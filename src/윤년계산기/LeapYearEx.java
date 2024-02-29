package 윤년계산기;
// 윤년이란? 지구가 태양을 한 바퀴 도는데 걸리는 시간이 365일과 1/4만큼 소요 되기 때문에
// 일반적으로 4년에 한 번씩 2월 29일 존재 (366)
// 윤년의 규칙
// 1. 연도가 4로 나누어 지면 윤년이다
// 2. 100으로 나누어지면 윤년이 아니다
// 3. 400으로 나누어지면 윤년

import java.util.Scanner;

public class LeapYearEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt();

        boolean result= year%4==0 &&  (year%100!=0 || year%400==0);

        if (result){
            System.out.println("윤년임");
        }else {
            System.out.println("윤년아님");
        }
    }
}
