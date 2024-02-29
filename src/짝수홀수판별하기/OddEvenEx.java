package 짝수홀수판별하기;

import java.util.Scanner;

//임의의 정수를 입력받아 해당 값이 짜구 인지 홀수 인지 출력하는 문제
public class OddEvenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = sc.nextInt();
        
        String outString = (num%2 ==0 )? "짝" : "홀";
        System.out.println(outString);
    }
}
