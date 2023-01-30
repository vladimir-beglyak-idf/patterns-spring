package com.example.mediator;

public interface Chat { //это и есть посредник
    void sendMessage(String message, User user);
}
