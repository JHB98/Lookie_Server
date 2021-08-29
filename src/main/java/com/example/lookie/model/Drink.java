package com.example.lookie.model;

public class Drink {
    private String id;
    private boolean is_ice;
    private int category;
    private int s_price;
    private int m_price;
    private int l_price;

    public Drink(String id, boolean is_ice, int category, int s_price, int m_price, int l_price) {
        this.id = id;
        this.is_ice = is_ice;
        this.category = category;
        this.s_price = s_price;
        this.m_price = m_price;
        this.l_price = l_price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIs_ice() {
        return is_ice;
    }

    public void setIs_ice(boolean is_ice) {
        this.is_ice = is_ice;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getS_price() {
        return s_price;
    }

    public void setS_price(int s_price) {
        this.s_price = s_price;
    }

    public int getM_price() {
        return m_price;
    }

    public void setM_price(int m_price) {
        this.m_price = m_price;
    }

    public int getL_price() {
        return l_price;
    }

    public void setL_price(int l_price) {
        this.l_price = l_price;
    }
}
