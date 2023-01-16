package com.example.template_method;

import java.util.function.Consumer;

public class WebsiteBuilder {

    public static final String CLICK_AND_MOVE_TO = "Click and move to : ";

    public void showPage(String url, Consumer<String> pageContent) {
        getHeader(url);
        pageContent.accept(url);
        getFooter(url);
    }

    private void getHeader(String url) {
        System.out.println("Header");
        System.out.println(CLICK_AND_MOVE_TO);
    }

    private void getFooter(String url) {
        System.out.println("Footer");
        System.out.println(CLICK_AND_MOVE_TO + url);
    }
}
