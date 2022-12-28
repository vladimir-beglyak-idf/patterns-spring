package com.example.patternsspring.pattern.factory_method;

import java.io.File;

public class Document extends AbstractDocument {

    private final DocumentGenerator documentGenerator;

    public Document(DocumentDao documentDao, Printer printer, DocumentGenerator documentGenerator) {
        super(documentDao, printer);
        this.documentGenerator = documentGenerator;
    }

    @Override
    protected File generate(String data, DocumentType type) {
        return documentGenerator.generate(data, type);
    }
}
