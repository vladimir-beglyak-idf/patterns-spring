package com.example.patternsspring.pattern.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
