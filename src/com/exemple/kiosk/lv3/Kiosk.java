package com.exemple.kiosk.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    private List<Castella> menuList = new ArrayList<>();

    // 생성자

    // 기능
    // 메뉴 객체 생성 및 List 등록
    public Castella makeCastellaMenu (String name , int price , String comment) {
        Castella castella = new Castella(name, price , comment);
        menuList.add(castella);
        return castella;
    }

    // 생성된 메뉴 프린트.
    public void setMenuList () {
        System.out.println("====메뉴====");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i+1) + ". " + menuList.get(i).getName() + " || " + menuList.get(i).getPrice() + " || " + menuList.get(i).getComment());
        }
        System.out.println("0. 종료");
    }

    // 숫자 입력시 출력 기능.
    public void start () {
        Scanner scanner = new Scanner(System.in);
        String string1;
        while (true) {
            string1 = scanner.next();
            if (string1.equals("1")) {
                System.out.println(menuList.get(0).getName() + "이(가) 추가되었습니다." + "( " + menuList.get(0).getPrice() + "원 )");
            } else if (string1.equals("2")) {
                System.out.println(menuList.get(1).getName() + "이(가) 추가되었습니다." + "( " + menuList.get(1).getPrice() + "원 )");
            } else if (string1.equals("3")) {
                System.out.println(menuList.get(2).getName() + "이(가) 추가되었습니다." + "( " + menuList.get(2).getPrice() + "원 )");
            } else if (string1.equals("4")) {
                System.out.println(menuList.get(3).getName() + "이(가) 추가되었습니다." + "( " + menuList.get(3).getPrice() + "원 )");
            } else if (string1.equals("5")) {
                System.out.println(menuList.get(4).getName() + "이(가) 추가되었습니다." + "( " + menuList.get(4).getPrice() + "원 )");
            } else if (string1.equals("0")) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
//            switch (int1) {
//                case 1 -> System.out.println(menuList.get(0).getName() + "이(가) 추가되었습니다.");
//                case 2 -> System.out.println(menuList.get(1).getName() + "이(가) 추가되었습니다.");
//                case 3 -> System.out.println(menuList.get(2).getName() + "이(가) 추가되었습니다.");
//                case 4 -> System.out.println(menuList.get(3).getName() + "이(가) 추가되었습니다.");
//                case 5 -> System.out.println(menuList.get(4).getName() + "이(가) 추가되었습니다.");
//                case 0 -> {
//                    System.out.println("종료합니다.");
//                    break;
//                }default -> System.out.println("잘못입력하셨습니다.");
//            }
        }

    }






}
