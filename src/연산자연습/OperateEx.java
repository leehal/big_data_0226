package 연산자연습;

import java.util.Scanner;

public class OperateEx {
    public static void main(String[] args) {

        int num1 = 10, num2 = 4;
        System.out.println(" + 연산자 : " + (num1 + num2));
        System.out.println(" - 연산자 : " + (num1 - num2));
        System.out.println(" * 연산자 : " + (num1 * num2));
        System.out.println(" / 연산자 : " + ((double) num1 / num2));
        System.out.println(" / 연산자 : " + (num1 % num2));

        //예외적 연산
        System.out.println(5 / 0.0); //infinity

        try {
            System.out.println(5 / 0); // 원래라면 오류남! 예외처리
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됩니다");
        }
        // 대입연산자 =
        int num3 = 10;
        // 복합대입연산자 += -= (*=, /=도 가능하나 잘 안쓰는 걸 지향)
        System.out.println(num3 += 2);
        System.out.println(num3 -= 2);

        //증감연산자 : 피연산자를 1씩 증가 또는 감소시키는 연산자
        int num4 =10;
        System.out.println(num4++);
        System.out.println(++num4);

        //비교연산자 >, < , >=, <=
        int x = 10;
        int y =20;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        //논리연산자 : &&, ||, !
        System.out.println("----------------------");
        boolean rst1, rst2, rst3;
        rst1 = (x > 0) && (x > y);
        rst2 = (x > 0) || (x > y);
        rst3 = !((x > 0) || (x > y));; //괄호 내의 결과값을 반전시킴
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
        
        //삼항연산자 : 피연산자가 3개임
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = age > 19;
        if (isAdult){
            System.out.println("성인입니다");
        }else {
            System.out.println("미성년자임");
        }
        String adult = (age > 19) ? "성인" : "미자";
        System.out.println(adult);

        //문자열 결합 연산자
        System.out.println("Java JDK " + 11.04 + 12); //처음 만나는 데이터타입이 문자열이면 이후 값들이 문자열로 간주됨
        System.out.println(3 + 3.3 + "JDK");

        //연산자 우선순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        int rst11, rst22, rst33;
        rst11 = val1 + val2 + val3;
        rst22 = (val1 + val2) * val3;
        rst33 = val1 + (++val2) * val3;
        System.out.println(rst11);
        System.out.println(rst22);
        System.out.println(rst33);

    }
}
