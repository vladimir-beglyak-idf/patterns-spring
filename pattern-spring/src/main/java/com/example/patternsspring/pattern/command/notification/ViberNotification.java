package com.example.patternsspring.pattern.command.notification;

import com.example.patternsspring.model.NotificationInfo;
import com.example.patternsspring.model.NotificationType;

public class ViberNotification implements Notification {

    private final NotificationType type = NotificationType.VIBER;

    @Override
    public void send(NotificationInfo notificationInfo) {
        System.out.println("Send message to Viber");
    }

    @Override
    public NotificationType getType() {
        return type;
    }
}
