package PC방알바;

import java.util.Scanner;

public class PcEx {
    public static void main(String[]args) {
        int[] pcRoom = new int[100]; //heap영역에 공간이 확보되고 0으로 자동 초기화
        int cnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum-1] == 1) cnt++;
            else pcRoom[seatNum-1] = 1;
        }
        System.out.println(cnt);
    }
}

