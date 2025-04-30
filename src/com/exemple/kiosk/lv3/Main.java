package com.exemple.kiosk.lv3;

public class Main {
    public static void main(String[] args) {

        // kiosk 객체 생성
        Kiosk kiosk = new Kiosk();
        // kiosk makeCastella 기능 이용한 Castella 객체 생성
        Castella castella1 = kiosk.makeCastellaMenu("오리지날 카스텔라" , 9000 , "카스텔라 본연의 맛으로 달지 않아 담백하고 깔끔한 맛");
        Castella castella2 = kiosk.makeCastellaMenu("치즈 카스텔라" , 11000 , "고급 체다치즈가 듬뿍 들어가 단짠단짠 치즈맛");
        Castella castella3 = kiosk.makeCastellaMenu("초코칩 카스텔라" , 11000 , "고급스러운 진한 초코칩의 풍미와 달달한 맛");
        Castella castella4 = kiosk.makeCastellaMenu("우유 생크림 카스텔라" , 11000 , "우유크림이 듬뿍 들어가 촉촉하고 달달한 맛");
        Castella castella5 = kiosk.makeCastellaMenu("초코칩 생크림 카스텔라" , 13000 , "진한 초코칩과 우유 생크림 서로의 맛이 어울러져 촉촉하고 달달한 맛");


        kiosk.setMenuList();



    }
}
