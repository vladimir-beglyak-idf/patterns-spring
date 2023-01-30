package com.example.patternsspring.pattern.factory_method.document;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;

@RequiredArgsConstructor
public abstract class AbstractDocument {

    private final DocumentDao documentDao;
    private final Printer printer;

    @SneakyThrows
    public final File create(DocumentType type) {
        String data = documentDao.getData();
        File file = generate(data, type);
        printer.print(file);
        return file;
    }

    protected abstract File generate(String data, DocumentType type);
}
