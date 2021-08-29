package com.example.lookie.model;

public class Dessert {
    private String id;
    private boolean is_icecream;
    private int s_price;
    private int m_price;
    private int l_price;

    public Dessert(String id, boolean is_icecream, int s_price, int m_price, int l_price) {
        this.id = id;
        this.is_icecream = is_icecream;
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

    public boolean isIs_icecream() {
        return is_icecream;
    }

    public void setIs_icecream(boolean is_icecream) {
        this.is_icecream = is_icecream;
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
