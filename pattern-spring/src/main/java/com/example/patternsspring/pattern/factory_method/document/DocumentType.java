package com.example.patternsspring.pattern.factory_method.document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DocumentType {
    PDF("pdf"),
    EXCEL("xlsx"),
    TXT("txt"),
    WORD("docx");

    private final String fileExtension;
}
