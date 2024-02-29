package 형변환예제;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class TypeCastEx {
    public static void main(String[] args) {

        int num1 = 1 , num2 = 4;
        double res1 = num1/num2; //정수를 나누기 연산을 했기 때문에 소수점 이하가 없어짐
        double res2 = (double)num1/num2;
        System.out.println(res1);
        System.out.println(res2);

        //타입변환 메소드
        //문자열을 정수로 변환하는 메소드
        int value1 = parseInt("123");
        double value2 = parseDouble("123.555");
        System.out.println(value1);
        System.out.println(value2);

    }
}
