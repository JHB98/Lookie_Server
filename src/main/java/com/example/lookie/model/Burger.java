package com.example.lookie.model;

public class Burger {
    private String id;
    private boolean is_double;
    private int patty;
    private int price;
    private int set_price;

    public Burger(String id, boolean is_double, int patty, int price, int set_price) {
        this.id = id;
        this.is_double = is_double;
        this.patty = patty;
        this.price = price;
        this.set_price = set_price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIs_double() {
        return is_double;
    }

    public void setIs_double(boolean is_double) {
        this.is_double = is_double;
    }

    public int getPatty() {
        return patty;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSet_price() {
        return set_price;
    }

    public void setSet_price(int set_price) {
        this.set_price = set_price;
    }
}
