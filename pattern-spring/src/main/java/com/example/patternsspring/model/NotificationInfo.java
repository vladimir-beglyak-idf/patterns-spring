package com.example.patternsspring.model;

import lombok.Data;

@Data
public class NotificationInfo {
    private Long id;
    private Long userId;
    private String message;
    private NotificationType type;
}
