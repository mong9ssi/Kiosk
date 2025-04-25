package com.exemple.kiosk.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //스캐너 생성
        Scanner scanner = new Scanner(System.in);
        //리스트 생성
        List<CastellaMenu> menuList = new ArrayList<>();

        //스캐너 입력값 정의
        int scnInt1;

        // 카스텔라 객체 생성
        CastellaMenu castellaMenu1 = new CastellaMenu("오리지날 카스텔라", 9000 , "카스텔라 본연의 맛으로 달지 않아 담백하고 깔끔한 맛");
        CastellaMenu castellaMenu2 = new CastellaMenu("치즈 카스텔라" , 11000 , "고급 체다치즈가 듬뿍 들어가 단짠단짠 치즈맛");
        CastellaMenu castellaMenu3 = new CastellaMenu("초코칩 카스텔라" , 11000 , "고급스러운 진한 초코칩의 풍미와 달달한 맛");
        CastellaMenu castellaMenu4 = new CastellaMenu("우유 생크림 카스텔라" , 11000 , "우유크림이 듬뿍 들어가 촉촉하고 달달한 맛");
        CastellaMenu castellaMenu5 = new CastellaMenu("초코칩 생크림 카스텔라" , 13000 , "진한 초코칩과 우유 생크림 서로의 맛이 어울러져 촉촉하고 달달한 맛");



        //키오스크 메뉴 출력물
        System.out.println("[치즈당 카스텔라 메뉴]");
        System.out.println("1. 오리지날 카스텔라 | ₩9000 | 카스텔라 본연의 맛으로 달지 않아 담백하고 깔끔한 맛");
        System.out.println("2. 치즈 카스텔라 | ₩11000 | 고급 체다치즈가 듬뿍 들어가 단짠단짠 치즈맛");
        System.out.println("3. 초코칩 카스텔라 | ₩11000 | 고급스러운 진한 초코칩의 풍미와 달달한 맛");
        System.out.println("4. 우유 생크림 카스텔라 | ₩11000 | 우유크림이 듬뿍 들어가 촉촉하고 달달한 맛");
        System.out.println("5. 초코칩 생크림 카스텔라 | ₩13000 | 진한 초코칩과 우유 생크림 서로의 맛이 어울러져 촉촉하고 달달한 맛");
        System.out.println("|장바구니에 추가할 메뉴를 입력하세요|");
        System.out.println("9. 주문목록조회 | 0. 종료 ");

        //메뉴 선택 기능 추가
        while (true) {
            scnInt1 = scanner.nextInt();
            if (scnInt1 == 1) {
                menuList.add(castellaMenu1);
                castellaMenu1.selectedMenu();
            } else if (scnInt1 == 2) {
                menuList.add(castellaMenu2);
                castellaMenu2.selectedMenu();
            } else if (scnInt1 == 3) {
                menuList.add(castellaMenu3);
                castellaMenu3.selectedMenu();
            } else if (scnInt1 == 4) {
                menuList.add(castellaMenu4);
                castellaMenu4.selectedMenu();
            } else if (scnInt1 == 5) {
                menuList.add(castellaMenu5);
                castellaMenu5.selectedMenu();
            } else if (scnInt1 == 9) {
                for (CastellaMenu c : menuList) {
                    System.out.println(c);
                }
            } else if (scnInt1 == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }



    }
}
