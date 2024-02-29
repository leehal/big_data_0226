package 조건문기본;

import java.util.Scanner;

//조건문이란? 제어문이다, 주어진 조건에 따라서 명령을 수행하는 것
// 조건문의 종류| 삼항연산자(참/거짓), if문(if, if~else, if~ else if~ else, switch)
public class ConditionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 100){
            System.out.println(num + ", 100보다 큰 양수");
        } else if (num == 100) {
            System.out.println(num + ", 100임");
        } else{
            System.out.println(num + ", 100보다 작음");
        }

    }
}
