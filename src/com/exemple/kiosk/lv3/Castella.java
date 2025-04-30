package com.exemple.kiosk.lv3;

public class Castella {
    // 속성
    private String name;
    private int price;
    private String comment;

    // 생성자
    public Castella (String name , int price , String comment) {
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    // 기능

    // 게터
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getComment() {
        return comment;
    }
}
