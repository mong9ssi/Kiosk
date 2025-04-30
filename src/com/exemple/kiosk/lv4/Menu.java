package com.exemple.kiosk.lv4;

import com.exemple.kiosk.lv3.Castella;

import java.util.ArrayList;

public class Menu {
    // 속성
    private String category;
    private ArrayList<MenuItem> menuItemList;

    // 생성자
    public Menu(String category) {
        this.category = category;
        this.menuItemList = new ArrayList<>();
    }

    // 기능
    // 메뉴 생성 및 리스트에 추가 메서드
    public MenuItem addMenuItem(String name , int price , String comment) {
        MenuItem menuItem = new MenuItem(name, price, comment);
        menuItemList.add(menuItem);
        return menuItem;
    }

    // 메뉴 전체 출력 메서드
    public void printMenuList() {
        System.out.println("====" + this.category + "메뉴 ====");
        for (int i = 0; i < menuItemList.size(); i++) {
            System.out.println((i+1) + ". " + menuItemList.get(i).getName() + " || " + menuItemList.get(i).getPrice() + " || " + menuItemList.get(i).getComment());
        }
        System.out.println("============");
    }

    // 게터
    public String getCategory() {
        return category;
    }
}
