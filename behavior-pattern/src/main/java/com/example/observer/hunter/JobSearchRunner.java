package com.example.observer.hunter;

import java.util.List;

public class JobSearchRunner {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();
        String firstVacancy = "First vacancy";
        javaDeveloperJobSite.addVacancy(firstVacancy);
        String secondVacancy = "Second vacancy";
        javaDeveloperJobSite.addVacancy(secondVacancy);

        Observer firstSubscriber = new Subscriber("Vladimir Beglyak");
        Observer secondSubscriber = new Subscriber("Elon Mask");

        javaDeveloperJobSite.addObserver(firstSubscriber);
        javaDeveloperJobSite.addObserver(secondSubscriber);

        String thirdVacancy = "Third vacancy";
        javaDeveloperJobSite.addVacancy(thirdVacancy);

        javaDeveloperJobSite.removeVacancy(firstVacancy);
    }
}
