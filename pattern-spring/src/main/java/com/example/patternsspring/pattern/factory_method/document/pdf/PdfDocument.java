package com.example.patternsspring.pattern.factory_method.document.pdf;

import com.example.patternsspring.pattern.factory_method.document.AbstractDocument;
import com.example.patternsspring.pattern.factory_method.document.DocumentDao;
import com.example.patternsspring.pattern.factory_method.document.DocumentType;
import com.example.patternsspring.pattern.factory_method.document.Printer;
import lombok.SneakyThrows;

import java.io.File;

public class PdfDocument extends AbstractDocument {

    private final PdfGenerator pdfGenerator;

    public PdfDocument(DocumentDao documentDao, Printer printer, PdfGenerator pdfGenerator) {
        super(documentDao, printer);
        this.pdfGenerator = pdfGenerator;
    }

    @Override
    @SneakyThrows
    protected File generate(String data, DocumentType type) {
        return pdfGenerator.generate(data, type);
    }
}
