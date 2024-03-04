package KMP;

import java.util.Scanner;

public class KmpEx {
    public static void main(String[] args) {
        // 문자열 입력을 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 문자열 입력에 대한 가이드 문구 출력
        System.out.print("문자열 입력 : ");
        // 문자열 입력 받기
        String name = sc.next();
        // 첫번째 방법 : charAt(인덱스)로 문자의 ASCII 확인 후 'A' ~ 'Z' 사이 문자만 출력
//        for(int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));
//            }
//        }
        // 두번째 방법 : 0번째 문자 출력, 그리고 '-' 다음의 문자 출력
//        for(int i = 0; i < name.length(); i++) {
//            if(i == 0) System.out.print(name.charAt(i));
//            else {
//                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }
        // 세번째 방법 : split() 메소드로 자르고 각자 0번째 인덱스
//        String[] splitName = name.split("-");
//        for(String e : splitName) {
//            System.out.print(e.charAt(0));
//        }
        // 네번째 방법 : 배열로 변경 후 'A' ~ 'Z' 사이 문자만 출력
        char[] chName = name.toCharArray();
        for(char e : chName) {
            if(e >= 'A' && e <= 'Z') System.out.print(e);
        }
    }
}