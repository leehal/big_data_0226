package 집주소;

import java.util.Scanner;

public class HomeAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력");
        int num = sc.nextInt();
        int weg = 1;
        int sum =0;
        int tum =0;

        while (num>=1){
            if (num<10){
                tum=num;
                sum=0;
            }else {
                sum = num / 10;
                tum = num % 10;
            }
            if (tum==1){
                weg++;
                weg+=2;
            } else if (tum>1) {
                weg++;
                weg+=3;
            } else {
                weg++;
                weg+=4;
            }
            num=sum;
        }
        System.out.println(weg);
    }

}
