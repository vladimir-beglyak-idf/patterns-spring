package com.example.abstract_factory.banking;

import com.example.abstract_factory.Developer;
import com.example.abstract_factory.ProjectManager;
import com.example.abstract_factory.ProjectTeamFactory;
import com.example.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaBankingDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QABankingTester();
    }

    @Override
    public ProjectManager getManager() {
        return new BankingProjectManager();
    }

    @Override
    public void createProject() {
        getDeveloper().writeCode();
        getTester().testCode();
        getManager().manageProject();
    }
}
