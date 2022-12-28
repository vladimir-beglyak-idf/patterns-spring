package com.example.patternsspring.controller;

import com.example.patternsspring.pattern.factory_method.DocumentService;
import com.example.patternsspring.pattern.factory_method.DocumentType;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/document/generate")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;

    @GetMapping(value = "/{type}")
    @SneakyThrows
    public Mono<ResponseEntity<InputStreamResource>> generateExcelDocument(@PathVariable DocumentType type) {
        return documentService.create(type);
    }


}
