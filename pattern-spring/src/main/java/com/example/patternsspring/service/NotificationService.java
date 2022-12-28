package com.example.patternsspring.service;

import com.example.patternsspring.model.NotificationInfo;

public interface NotificationService {
    void send(NotificationInfo notificationInfo);
}
