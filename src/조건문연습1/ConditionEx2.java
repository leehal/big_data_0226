package 조건문연습1;

import java.util.Scanner;

public class ConditionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in 콘솔 입력을 의미, 파일으로 변경 가능
        System.out.println("문자를 입력하세요 : ");
        char ch = sc.next().charAt(0); //스캐너로 문자를 입력 받기 위해서는 문자열에서 특정 인덱스의 문자를 추출
        if (ch >='a' && ch <= 'z'){ //아스키코드라 이런 비교문이 가능함.
            System.out.println(ch + "는 알파벳 소문자 입니다.");
        } else if (ch >='A' && ch <= 'Z') {
            System.out.println(ch + "는 알파벳 대문자 입니다.");
        }else {
            System.out.println(ch + "는 알파벳이 아닙니다.");
        }
    }
}
