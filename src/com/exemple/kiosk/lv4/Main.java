package com.exemple.kiosk.lv4;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk("메인메뉴");

        Menu menu1 = kiosk.addMenuList("카스텔라");
        MenuItem castella1 = menu1.addMenuItem("오리지날 카스텔라" , 9000 , "카스텔라 본연의 맛으로 달지 않아 담백하고 깔끔한 맛");
        MenuItem castella2 = menu1.addMenuItem("치즈 카스텔라" , 11000 , "고급 체다치즈가 듬뿍 들어가 단짠단짠 치즈맛");
        MenuItem castella3 = menu1.addMenuItem("초코칩 카스텔라" , 11000 , "고급스러운 진한 초코칩의 풍미와 달달한 맛");
        MenuItem castella4 = menu1.addMenuItem("우유 생크림 카스텔라" , 11000 , "우유크림이 듬뿍 들어가 촉촉하고 달달한 맛");
        MenuItem castella5 = menu1.addMenuItem("초코칩 생크림 카스텔라" , 13000 , "진한 초코칩과 우유 생크림 서로의 맛이 어울러져 촉촉하고 달달한 맛");

        Menu menu2 = kiosk.addMenuList("생크림");
        MenuItem Cream1 = menu2.addMenuItem("우유 생크림" , 2000 , "동물성 생크림 함량이 높은 우유맛 생크림");
        MenuItem Cream2 = menu2.addMenuItem("라즈베리 생크림" , 2500 , "라즈베리가 듬뿍 들어간 생크림");
        MenuItem Cream3 = menu2.addMenuItem("뽀또 생크림" , 2500 , "황치즈가 듬뿍 들어간 뽀또맛 생크림");
        MenuItem Cream4 = menu2.addMenuItem("오레오 생크림" , 2500 , "오레오가 듬뿍 들어가 쿠키칩이 씹히는 생크림");

        Menu menu3 = kiosk.addMenuList("드링크");
        MenuItem drink1 = menu3.addMenuItem("Americano" , 3000 , "Ice");
        MenuItem drink2 = menu3.addMenuItem("Americano" , 3000 , "Hot");
        MenuItem drink3 = menu3.addMenuItem("caffeLatte" , 3500 , "Ice");
        MenuItem drink4 = menu3.addMenuItem("caffeLatte" , 3500 , "Hot");

        kiosk.start(menu1,menu2,menu3);

    }
}
