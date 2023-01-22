package com.example.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "MySQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Vladimir Beglyak", skills);

        Iterator<String> iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
