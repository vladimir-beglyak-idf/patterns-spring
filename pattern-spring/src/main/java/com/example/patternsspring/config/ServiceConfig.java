package com.example.patternsspring.config;

import com.example.patternsspring.pattern.strategy.Notification;
import com.example.patternsspring.pattern.factory_method.document.DocumentService;
import com.example.patternsspring.service.DefaultNotificationService;
import com.example.patternsspring.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

@Configuration
@RequiredArgsConstructor
public class ServiceConfig {

    private final List<Notification> notifications;
    private final DocumentConfig documentConfig;

    @Bean
    public NotificationService notificationService() {
        return new DefaultNotificationService(notifications.stream()
                .collect(toMap(Notification::getType, identity())));
    }

    @Bean
    public DocumentService documentService(){
        return new DocumentService(documentConfig.document());
    }
}
