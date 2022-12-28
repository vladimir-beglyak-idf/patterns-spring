package com.example.patternsspring.config;

import com.example.patternsspring.pattern.factory_method.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocumentConfig {

    @Bean
    public AbstractDocument document() {
        return new Document(documentDao(), printer(), documentGenerator());
    }

    @Bean
    public Printer printer() {
        return new Printer();
    }

    @Bean
    public DocumentGenerator documentGenerator() {
        return new DefaultDocumentGenerator();
    }

    @Bean
    public DocumentDao documentDao() {
        return new DocumentDao();
    }
}
