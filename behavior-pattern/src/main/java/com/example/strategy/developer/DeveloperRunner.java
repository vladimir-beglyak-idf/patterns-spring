package com.example.strategy.developer;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new EatingActivity());

        System.out.println(developer.doActivity());

        developer.setActivity(new CodingActivity());
        System.out.println(developer.doActivity());

        developer.setActivity(new ReadingActivity());
        System.out.println(developer.doActivity());

        developer.setActivity(new SleepingActivity());
        System.out.println(developer.doActivity());
    }
}
