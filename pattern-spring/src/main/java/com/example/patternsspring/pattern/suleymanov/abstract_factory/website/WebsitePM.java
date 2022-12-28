package com.example.patternsspring.pattern.suleymanov.abstract_factory.website;

import com.example.patternsspring.pattern.suleymanov.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website project...");
    }
}
