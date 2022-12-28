package com.example.patternsspring.pattern.suleymanov.abstract_factory.website;

import com.example.patternsspring.pattern.suleymanov.abstract_factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes php code...");
    }
}
