package com.example.patternsspring.pattern.suleymanov.abstract_factory.website;

import com.example.patternsspring.pattern.suleymanov.abstract_factory.Developer;
import com.example.patternsspring.pattern.suleymanov.abstract_factory.ProjectManager;
import com.example.patternsspring.pattern.suleymanov.abstract_factory.ProjectTeamFactory;
import com.example.patternsspring.pattern.suleymanov.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new WebsiteManualTester();
    }

    @Override
    public ProjectManager getManager() {
        return new WebsitePM();
    }

    @Override
    public void createProject() {
        getDeveloper().writeCode();
        getTester().testCode();
        getManager().manageProject();
    }
}
