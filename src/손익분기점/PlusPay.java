package 손익분기점;

import java.util.Scanner;

public class PlusPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int cnt =0;
        System.out.println("직원급여");
        int fixCost =sc.nextInt();
        System.out.println("물품생산비용");
        int varCost =sc.nextInt();
        System.out.println("물건가격");
        int sellPrice =sc.nextInt();
        if (varCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
//        while(true) {
//            // if(fixCost + (varCost * cnt) < sellPrice * cnt) break;
//            if(cnt > fixCost / (sellPrice - varCost)) break;
//            cnt++;
//        }
//        System.out.println(cnt);

        System.out.println((fixCost/(sellPrice-varCost))+1);
    }
}
