package com.example.patternsspring.pattern.suleymanov.abstract_factory.banking;

import com.example.patternsspring.pattern.suleymanov.abstract_factory.*;

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
