package com.example.patternsspring.config;

import com.example.patternsspring.pattern.command.notification.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {

    @Bean
    public Notification telegramNotification() {
        return new TelegramNotification();
    }

    @Bean
    public Notification smsNotification() {
        return new SmsNotification();
    }

    @Bean
    public Notification emailNotification() {
        return new EmailNotification();
    }

    @Bean
    public Notification viberNotification() {
        return new ViberNotification();
    }
}
