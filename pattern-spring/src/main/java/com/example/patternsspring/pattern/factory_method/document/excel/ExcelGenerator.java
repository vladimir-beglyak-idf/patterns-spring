package com.example.patternsspring.pattern.factory_method.document.excel;

import com.example.patternsspring.pattern.factory_method.document.DocumentGenerator;
import com.example.patternsspring.pattern.factory_method.document.DocumentType;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

@Component
public class ExcelGenerator implements DocumentGenerator {
    @Override
    @SneakyThrows
    public File generate(String data, DocumentType type) {
        return Files.write(Path.of("/", createFileNameAndExtension("test-excel", type)), "Hello world!".getBytes(), StandardOpenOption.CREATE_NEW).toFile();
    }

    public String createFileNameAndExtension(String name, DocumentType type) {
        return String.join(".", name, type.getFileExtension());
    }
}
