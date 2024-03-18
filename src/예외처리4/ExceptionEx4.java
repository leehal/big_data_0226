package 예외처리4;

import java.util.Scanner;

// ArithmeticException
public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("나눗셈 입력 : ");
            int a = sc.nextInt();
            int c = sc.nextInt();
            try {
                rst = a/c;
            }catch (ArithmeticException e){
//                System.out.println("0으로 나눌 수 없습니다 재입력부탁");
//                continue;
                rst = -1;
            }finally { // 예외상황 없이 반드시 실행
                System.out.println("프로그램 종료");
            }
            
            System.out.println("결과 : "+rst);
            break;
        }
    }
}
