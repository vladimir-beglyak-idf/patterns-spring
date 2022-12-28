package com.example.patternsspring.pattern.suleymanov.abstract_factory;

import com.example.patternsspring.pattern.suleymanov.abstract_factory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        WebsiteTeamFactory websiteTeamFactory = new WebsiteTeamFactory();
        Developer developer = websiteTeamFactory.getDeveloper();
        Tester tester = websiteTeamFactory.getTester();
        ProjectManager manager = websiteTeamFactory.getManager();
        websiteTeamFactory.createProject();
    }
}
