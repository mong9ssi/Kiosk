package com.exemple.kiosk.lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //스캐너 생성
        Scanner scanner = new Scanner(System.in);

        //스캐너 입력값 정의
        int scnInt1;

        //키오스크 메뉴 출력물
        System.out.println("[치즈당 카스텔라 메뉴]");
        System.out.println("1. 오리지날 카스텔라 | ₩9000 | 카스텔라 본연의 맛으로 달지 않아 담백하고 깔끔한 맛");
        System.out.println("2. 치즈 카스텔라 | ₩11000 | 고급 체다치즈가 듬뿍 들어가 단짠단짠 치즈맛");
        System.out.println("3. 초코칩 카스텔라 | ₩11000 | 고급스러운 진한 초코칩의 풍미와 달달한 맛");
        System.out.println("4. 우유 생크림 카스텔라 | ₩11000 | 우유크림이 듬뿍 들어가 촉촉하고 달달한 맛");
        System.out.println("5. 초코칩 생크림 카스텔라 | ₩13000 | 진한 초코칩과 우유 생크림 서로의 맛이 어울러져 촉촉하고 달달한 맛");
        System.out.println("|장바구니에 추가할 메뉴를 입력하세요|");
        System.out.println("0. 종료 ");

        //메뉴 선택 기능 추가
        while (true) {
            scnInt1 = scanner.nextInt();
            String choiceMenu;
            if (scnInt1 == 1) {
            } else if (scnInt1 == 2) {
            } else if (scnInt1 == 3) {
            } else if (scnInt1 == 4) {
            } else if (scnInt1 == 5) {
            } else if (scnInt1 == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}
