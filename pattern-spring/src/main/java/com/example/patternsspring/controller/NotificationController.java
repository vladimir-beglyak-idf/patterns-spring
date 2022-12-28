package com.example.patternsspring.controller;

import com.example.patternsspring.model.NotificationInfo;
import com.example.patternsspring.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping("/notify")
    public String notify(@RequestBody NotificationInfo notificationInfo) {
        notificationService.send(notificationInfo);
        return String.format("Send message to %s", notificationInfo.getType().name().toLowerCase(Locale.US));
    }

}
