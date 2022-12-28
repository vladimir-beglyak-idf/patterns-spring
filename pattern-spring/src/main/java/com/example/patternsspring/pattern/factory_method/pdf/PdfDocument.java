package com.example.patternsspring.pattern.factory_method.pdf;

import com.example.patternsspring.pattern.factory_method.AbstractDocument;
import com.example.patternsspring.pattern.factory_method.DocumentDao;
import com.example.patternsspring.pattern.factory_method.DocumentType;
import com.example.patternsspring.pattern.factory_method.Printer;
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
