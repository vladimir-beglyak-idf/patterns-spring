package com.example.abstract_factory;

import com.example.abstract_factory.banking.BankingTeamFactory;

public class SuperBankSystemProject {
    public static void main(String[] args) {
        BankingTeamFactory bankingTeamFactory = new BankingTeamFactory();
        Developer developer = bankingTeamFactory.getDeveloper();
        Tester tester = bankingTeamFactory.getTester();
        ProjectManager manager = bankingTeamFactory.getManager();
        bankingTeamFactory.createProject();
    }
}
