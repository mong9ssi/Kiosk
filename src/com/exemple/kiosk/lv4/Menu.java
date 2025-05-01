package com.exemple.kiosk.lv4;

import java.util.ArrayList;

public class Menu {
    // 속성
    private String category;
    private ArrayList<MenuItem> menuItemList;
    private ArrayList<MenuItem> cartList = new ArrayList<>();

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

    // 전체 메뉴 출력 메서드
    public void printMenuList() {
        System.out.println("====" + this.category + "메뉴 ====");
        for (int i = 0; i < menuItemList.size(); i++) {
            System.out.println((i+1) + ". " + menuItemList.get(i).getName() + " || " + menuItemList.get(i).getPrice() + " || " + menuItemList.get(i).getComment());
        }
        System.out.println("============");
    }



    // 메뉴 단품 (카스텔라, 생크림) 출력 메서드
    public void printMenu (int i) {
        System.out.println(menuItemList.get(i-1).getName() + " || " + menuItemList.get(i-1).getPrice() +"원을 선택하셨습니다" );
    }

    // 메뉴 단품 (드링크) 출력 메서드
    public void printDrinkMenu (int i) {
        System.out.println(menuItemList.get(i-1).getComment() + " " + menuItemList.get(i-1).getName() + " || " + menuItemList.get(i-1).getPrice() +"원을 선택하셨습니다" );
    }





    // 게터
    public String getCategory() {
        return category;
    }

    public ArrayList<MenuItem> getMenuItemList() {
        return menuItemList;
    }
}
