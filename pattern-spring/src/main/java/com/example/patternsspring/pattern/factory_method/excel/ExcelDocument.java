package com.example.patternsspring.pattern.factory_method.excel;

import com.example.patternsspring.pattern.factory_method.AbstractDocument;
import com.example.patternsspring.pattern.factory_method.Printer;
import com.example.patternsspring.pattern.factory_method.DocumentDao;
import com.example.patternsspring.pattern.factory_method.DocumentType;

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
