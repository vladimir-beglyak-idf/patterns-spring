package com.example.patternsspring.pattern.strategy;

import com.example.patternsspring.model.NotificationInfo;
import com.example.patternsspring.model.NotificationType;

public class TelegramNotification implements Notification {

    private final NotificationType type = NotificationType.TELEGRAM;

    @Override
    public void send(NotificationInfo notificationInfo) {
        System.out.println("Send message to Telegram");
    }

    @Override
    public NotificationType getType() {
        return type;
    }
}
