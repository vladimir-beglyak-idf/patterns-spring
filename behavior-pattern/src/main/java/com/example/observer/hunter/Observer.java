package com.example.observer.hunter;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
