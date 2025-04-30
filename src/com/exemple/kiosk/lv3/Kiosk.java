package com.exemple.kiosk.lv3;

import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    // 속성
    private List<Castella> menuList = new ArrayList<>();

    // 생성자

    // 기능
    // 메뉴 객체 생성 및 List 등록
    public Castella makeCastellaMenu (String name , int price , String comment) {
        menuList.add(new Castella(name, price , comment));
        return new Castella(name, price , comment);
    }

    // 생성된 메뉴 프린트.
    public void setMenuList () {
        System.out.println("====메뉴====");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i+1) + ". " + menuList.get(i).getName() + " || " + menuList.get(i).getPrice() + " || " + menuList.get(i).getComment());
        }
    }






}
