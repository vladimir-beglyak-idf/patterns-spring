package com.example.patternsspring.service;

import com.example.patternsspring.pattern.command.notification.Notification;
import com.example.patternsspring.model.NotificationInfo;
import com.example.patternsspring.model.NotificationType;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class DefaultNotificationService implements NotificationService {

    private final Map<NotificationType, Notification> notificationMap;

    @Override
    public void send(NotificationInfo notificationInfo) {
        notificationMap.get(notificationInfo.getType()).send(notificationInfo);
    }
}
