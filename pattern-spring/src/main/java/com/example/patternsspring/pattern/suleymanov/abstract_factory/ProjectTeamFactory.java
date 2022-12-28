package com.example.patternsspring.pattern.suleymanov.abstract_factory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getManager();
    void createProject();
}
