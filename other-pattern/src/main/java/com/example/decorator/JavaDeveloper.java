package com.example.decorator;

public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java Code.";
    }

    public void writeJavaCode(){
        System.out.println("Java developer writes Java code...");
    }
}
