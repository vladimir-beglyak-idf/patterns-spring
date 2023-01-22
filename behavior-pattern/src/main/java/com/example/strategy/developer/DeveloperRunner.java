package com.example.strategy.developer;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Eating());

        System.out.println(developer.doActivity());

        developer.setActivity(new Coding());
        System.out.println(developer.doActivity());

        developer.setActivity(new Reading());
        System.out.println(developer.doActivity());

        developer.setActivity(new Sleeping());
        System.out.println(developer.doActivity());
    }
}
