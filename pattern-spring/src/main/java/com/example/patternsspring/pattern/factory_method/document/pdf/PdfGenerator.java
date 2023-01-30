package com.example.patternsspring.pattern.factory_method.document.pdf;

import com.example.patternsspring.pattern.factory_method.document.DocumentGenerator;
import com.example.patternsspring.pattern.factory_method.document.DocumentType;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

@Component
public class PdfGenerator implements DocumentGenerator {
    @Override
    @SneakyThrows
    public File generate(String data, DocumentType type) {
        Files.write(Path.of("/", createFileNameAndExtension("test-pdf", type)), "Hello world!".getBytes(), StandardOpenOption.CREATE_NEW);
        return new File("report.pdf");
    }

    public String createFileNameAndExtension(String name, DocumentType type) {
        return String.join(".", name, type.getFileExtension());
    }
}
