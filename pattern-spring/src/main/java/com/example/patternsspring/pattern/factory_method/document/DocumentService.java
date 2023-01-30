package com.example.patternsspring.pattern.factory_method.document;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.File;
import java.io.FileInputStream;

@RequiredArgsConstructor
public class DocumentService {
    private final AbstractDocument document;

    public Mono<ResponseEntity<InputStreamResource>> create(DocumentType type) {
        return Mono.fromCallable(() -> document.create(type))
                .subscribeOn(Schedulers.boundedElastic())
                .map(this::buildResponse);
    }

    @SneakyThrows
    private ResponseEntity<InputStreamResource> buildResponse(File file) {
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .contentLength(file.length())
                .body(resource);
    }
}
