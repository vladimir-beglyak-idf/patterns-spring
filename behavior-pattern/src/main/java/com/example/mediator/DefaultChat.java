package com.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class DefaultChat implements Chat {

    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.forEach(user1 -> {
            if (user1 != user) {
                user.getMessage(message);
            }
        });
        admin.getMessage(message);
    }
}
