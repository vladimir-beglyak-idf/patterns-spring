package com.example.template_method;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("***********************");

        newsPage.showPage();

        System.out.println("***********************");

        WebsiteBuilder websiteBuilder = new WebsiteBuilder();
        websiteBuilder.showPage("www.my-website", content -> System.out.println("Welcome message on my website"));
    }
}
