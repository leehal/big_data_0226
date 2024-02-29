package 변수연습;

public class VarEx {
    public static void main(String[] args) {

//        int switch; 예약어라 안됨
//        int 23rate; 숫자가 앞에 오면 안됨
//        int kor$#; 특수문자는 _, $ 만 사용 가능

        int age;
        age = 100;
        double taxRate = 1.0; //자바는 카멜표기법을 따름, 스네이크 표기법: tax_rate
        int jobs; //변수이름은 소문자로 지어야 함.

        int year = 2024;
//        int day = null; 오류!
        String name = ""; //문자열 초기화
        String name1 = null; //문자열 초기화는 null도 가능 = int는 기본타입이기 때문에 정수만 가능하고 String은 참조형이라 가리키는 주소 개념이라 가능함.
        int m = 30;

        int n = 20;
        if (n > 10) {
            m = n - 10;
        }
        int k = n+m;
        System.out.println(k);

        String addr = "서울시 강남구 역삼동 kh정보 교육원"; // 크기 : 해당운영체제는 64bit 따라서 주소 체계도 8byte임.
        String addr2 = "서울시 강남구 역삼동 kh정보 교육원"; //addr2의 메모리 위치와 addr 메모리 위치가 같음. 문자열이 같기때문 == 리터럴 상수
        if(addr.equals(addr2)){
            System.out.println("true");
        }

        //실수형 : 지수와 가수로 표현되면 가수 부분이 정밀도 연관이 있음, 근사치 표현법
        float height = 170.55f; // float형은 표기시 F 또는 f를 붙여야함.
        double pi =43.14599265389793; // double은 d를 붙여도 안붙여도 괜찮음

        //상수(constant) : 고정된 값을 표기 할 때 사용
        final double PI = 3.241592;
        final int YEAR = 365;

    }
}
