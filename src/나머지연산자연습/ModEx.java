package 나머지연산자연습;
//100의 자리 정수를 입력 받아서 3개의 변수에 나눠 담기
//ex) 257 => a=2, b=5, c=7이 되도록 하기

import java.util.Scanner;

public class ModEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100자리 정수를 입력해주세요 : ");
        int num = sc.nextInt();

        while (num<100){
            System.out.print("100의 자리숫자로 다시 입력부탁드립니다 : ");
            sc = new Scanner(System.in);
            num = sc.nextInt();
        }

        int a = num/100;
        int b = (num-a*100)/10; // (num%100)/10
        int c = num-(a*100+b*10); // num%10

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}
