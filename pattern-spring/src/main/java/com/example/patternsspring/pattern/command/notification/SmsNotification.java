package com.example.patternsspring.pattern.command.notification;

import com.example.patternsspring.model.NotificationInfo;
import com.example.patternsspring.model.NotificationType;

public class SmsNotification implements Notification {

    private final NotificationType type = NotificationType.SMS;

    @Override
    public void send(NotificationInfo notificationInfo) {
        System.out.println("Send message to Sms");
    }

    @Override
    public NotificationType getType() {
        return type;
    }
}
