package com.example.patternsspring.pattern.suleymanov.abstract_factory.banking;

import com.example.patternsspring.pattern.suleymanov.abstract_factory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking project...");
    }
}
