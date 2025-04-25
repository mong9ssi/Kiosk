package com.exemple.kiosk.lv1;

public class CastellaMenu {
    // 속성
    private String name;
    private int price;
    private String comment;

    // 생성자
    CastellaMenu (String name , int price , String commment) {
        this.name = name;
        this.price = price;
        this.comment = commment;
    }

    // 기능
    @Override
    public String toString() {
        return name + " | ₩" + price + " | " + comment;
    }

    public void selectedMenu() {
        System.out.println(name + "을(를) 주문목록에 추가합니다.");
    }
}
