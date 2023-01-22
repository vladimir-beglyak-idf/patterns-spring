package com.example.mediator;

public class DefaultChatRunner {
    public static void main(String[] args) {
        DefaultChat chat = new DefaultChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new DefaultUser(chat, "User 1");
        User user2 = new DefaultUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I'm user 1!!!!");
        admin.sendMessage("Roger that. I'm admin!!!");
    }
}
