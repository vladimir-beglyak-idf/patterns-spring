package com.example.patternsspring.pattern.factory_method.document.excel;

import com.example.patternsspring.pattern.factory_method.document.AbstractDocument;
import com.example.patternsspring.pattern.factory_method.document.Printer;
import com.example.patternsspring.pattern.factory_method.document.DocumentDao;
import com.example.patternsspring.pattern.factory_method.document.DocumentType;

import java.io.File;

public class ExcelDocument extends AbstractDocument {

    private final ExcelGenerator excelGenerator;

    public ExcelDocument(DocumentDao documentDao, Printer printer, ExcelGenerator excelGenerator) {
        super(documentDao, printer);
        this.excelGenerator = excelGenerator;
    }

    @Override
    protected File generate(String data, DocumentType type) {
        return excelGenerator.generate(data, type);
    }
}
