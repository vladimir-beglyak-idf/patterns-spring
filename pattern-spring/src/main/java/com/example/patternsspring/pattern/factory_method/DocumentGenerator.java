package com.example.patternsspring.pattern.factory_method;

import java.io.File;

public interface DocumentGenerator {
    File generate(String data, DocumentType type);
}
