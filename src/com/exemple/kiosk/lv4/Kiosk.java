package com.exemple.kiosk.lv4;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    // 속성
    private String bigCategory;
    private ArrayList<Menu> menuList;

    // 생성자
    Kiosk (String bigCategory) {
        this.bigCategory = bigCategory;
        this.menuList = new ArrayList<>();
    }

    // 기능
    // 큰카테고리 생성 및 리스트에 추가 메서드
    public Menu addMenuList (String bigCategory) {
        Menu menu = new Menu(bigCategory);
        menuList.add(menu);
        return menu;
    }

    // 큰카테고리 전체 출력 메서드
    public void printMainMenuList () {
        System.out.println("====" + bigCategory + "====");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i+1) + ". " + menuList.get(i).getCategory());
        }
        System.out.println("============");
    }

    // 시작 메서드
    public void start () {
        Scanner scanner = new Scanner(System.in);
        String string1;
        // 메인메뉴 (카테고리) 출력 및 입력
        while (true) {
            // 메인 카테고리 출력
            System.out.println("====" + bigCategory + "====");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i+1) + ". " + menuList.get(i).getCategory());
            }
            System.out.println("============");

            // 스캐너 입력
            string1 = scanner.next();


        }
    }





    //게터
    public String getBigCategory() {
        return bigCategory;
    }
}
