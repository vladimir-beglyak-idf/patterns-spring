package com.example.patternsspring.pattern.suleymanov.factory;

public class Programm {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = DeveloperFactoryDefiner.define(DeveloperType.PHP);
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
}
