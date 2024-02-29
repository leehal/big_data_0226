package 반복문1번;

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력 : ");
        int num = sc.nextInt(); //입력받은 정수를 num에 대입
        int sum = 0; //주어진 정수의 합을 구하기 위한 변수 // sum에 초기화를 걸지 않으면 오류.
//        while (num>0){
//            sum += num; //sum = sum + num
//            num--;
//        }
//        for (int i = 0; i <= num; i++) {
//            sum += i;
//        }
        int i=1;
        for (;;){
            sum += i;
            if (i==num)break;
            i++;
        }
        System.out.println("정수의 합 : " + sum);
    }
}
