package com.example.patternsspring.pattern.command.notification;

import com.example.patternsspring.model.NotificationInfo;
import com.example.patternsspring.model.NotificationType;

public class EmailNotification implements Notification {

    private final NotificationType type = NotificationType.EMAIL;

    @Override
    public void send(NotificationInfo notificationInfo) {
        System.out.println("Send message to Email");
    }

    @Override
    public NotificationType getType() {
        return type;
    }
}
