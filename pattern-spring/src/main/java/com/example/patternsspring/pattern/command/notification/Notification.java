package com.example.patternsspring.pattern.command.notification;

import com.example.patternsspring.model.NotificationInfo;
import com.example.patternsspring.model.NotificationType;

public interface Notification {
    void send(NotificationInfo notificationInfo);

    NotificationType getType();
}
