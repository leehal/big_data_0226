package 핸드폰요금;

import java.util.Scanner;

public class PhonePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("통화 횟수는?");
        int cnt = sc.nextInt();
        Pay pay =new Pay();
        pay.funcY(cnt);
    }
}
class Pay{
    int yprice =0 ;
    int mprice =0 ;
    public void funcY(int cnt){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cnt; i++) {
            System.out.println(i+1+" 번째 "+"통화 시간은?");
            int time = sc.nextInt();

            if (time%30!=0){
                yprice+=(time/30)*10+10;
            }else
                yprice+=(time/30)*10;

            if (time%60!=0){
                mprice+=(time/60)*15+15;
            }else
                mprice+=(time/60)*15;
        }
        System.out.println("Y 가격은 "+yprice);
        System.out.println("M 가격은 "+mprice);

        String pay = (yprice < mprice || yprice == mprice)? "y":"m" ;
        System.out.println(pay);
    }
}
