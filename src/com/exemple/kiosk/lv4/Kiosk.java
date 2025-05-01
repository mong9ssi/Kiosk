package com.exemple.kiosk.lv4;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    // 속성
    private String bigCategory;
    private ArrayList<Menu> menuList;

    // 생성자
    public Kiosk(String bigCategory) {
        this.bigCategory = bigCategory;
        this.menuList = new ArrayList<>();
    }

    // 기능
    // 큰카테고리 생성 및 리스트에 추가 메서드
    public Menu addMenuList(String bigCategory) {
        Menu menu = new Menu(bigCategory);
        menuList.add(menu);
        return menu;
    }


    // 시작 메서드
    public void start(Menu menu1, Menu menu2, Menu menu3) {
        // 스캐너 및 입력값 사전 설정
        Scanner scanner = new Scanner(System.in);
        int int1;
        int int2;

        // 메인메뉴 (카테고리) 출력 및 입력
        while (true) {
            // 메인 카테고리 출력
            System.out.println("====" + bigCategory + "====");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getCategory());
            }
            System.out.println("0. 종료");
            System.out.println("============");

            // 스캐너 입력
            int1 = scanner.nextInt();
            // 1 입력시 카스텔라 메뉴 출력 , 숫자 입력하여 메뉴 선택
            if (int1 == 1) {
                menu1.printMenuList();
                while (int1 == 1) {
                    int2 = scanner.nextInt();
                    if (int2 == 1) {
                        menu1.printMenu(int2);
                    } else if (int2 == 2) {
                        menu1.printMenu(int2);
                    } else if (int2 == 3) {
                        menu1.printMenu(int2);
                    } else if (int2 == 4) {
                        menu1.printMenu(int2);
                    } else if (int2 == 5) {
                        menu1.printMenu(int2);
                    } else if (int2 == 0) {
                        System.out.println("종료합니다.");
                        break;
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
                    }
                }
            } else if (int1 == 2) {
                menu2.printMenuList();
                while (int1 == 2) {
                    int2 = scanner.nextInt();
                    if (int2 == 1) {
                        menu2.printMenu(int2);
                    } else if (int2 == 2) {
                        menu2.printMenu(int2);
                    } else if (int2 == 3) {
                        menu2.printMenu(int2);
                    } else if (int2 == 4) {
                        menu2.printMenu(int2);
                    } else if (int2 == 0) {
                        System.out.println("종료합니다.");
                        break;
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
                    }
                }
            } else if (int1 == 3) {
                menu3.printMenuList();
                while (int1 == 3) {
                    int2 = scanner.nextInt();
                    if (int2 == 1) {
                        menu3.printDrinkMenu(int2);
                    } else if (int2 == 2) {
                        menu3.printDrinkMenu(int2);
                    } else if (int2 == 3) {
                        menu3.printDrinkMenu(int2);
                    } else if (int2 == 4) {
                        menu3.printDrinkMenu(int2);
                    } else if (int2 == 0) {
                        System.out.println("종료합니다.");
                        break;
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
                    }
                }
            } else if (int1 == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
            }

        }
    }


}
