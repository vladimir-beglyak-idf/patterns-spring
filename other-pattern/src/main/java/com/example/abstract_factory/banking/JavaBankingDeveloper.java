package com.example.abstract_factory.banking;

import com.example.abstract_factory.Developer;

public class JavaBankingDeveloper implements Developer {
    @Override
    public void writeCode(){
        System.out.println("Java developer writes java code...");
    }
}
