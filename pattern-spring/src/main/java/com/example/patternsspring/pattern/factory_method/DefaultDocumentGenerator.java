package com.example.patternsspring.pattern.factory_method;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class DefaultDocumentGenerator implements DocumentGenerator {
    @Override
    @SneakyThrows
    public File generate(String data, DocumentType type) {
        return Files.write(Path.of( createFileNameAndExtension("test", type)), "Hello world!".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING).toFile();
    }

    public String createFileNameAndExtension(String name, DocumentType type) {
        return String.join(".", name, type.getFileExtension());
    }
}
