package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CoCoaTok coCoaTok =new CoCoaTok("장원영");
        coCoaTok.writeMsg("오늘은 날씨가 따숩. 봄 옴");
        NetworkAdapter adapter;
        Scanner sc =new Scanner(System.in);
        System.out.println("네트워크 선택 (1 WiFi / 2 5G / 3 LTE )");
        int sel = sc.nextInt();
        if (sel ==1) adapter = new Wifi();
        else adapter = new FiveG();
        coCoaTok.csend(adapter);
    }
}
