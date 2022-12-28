package com.example.patternsspring.pattern.suleymanov.builder;

public class Website {
    private String name;
    private Cmc cms;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cmc getCms() {
        return cms;
    }

    public void setCms(Cmc cms) {
        this.cms = cms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
