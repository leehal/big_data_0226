package 시스템입출력;


public class systemInOut {
    public static void main(String[] args) {

        String name = "곰돌이사육사";
        String addr = "서울시 강남구 역삼동"; //""은 문자열
        char gender = 'M'; //char형은 문자를 입력받으며 ''로 감싸야 함. 아스키 코드 또는 유니코드
        int age = 22;
        int kor = 99;
        int eng = 88;
        int mat = 40;
        double aver = 0.0; // 평균을 구하기 위한 변수

        //자바 스타일 출력방식(오버로딩 방식)
        System.out.println("=".repeat(5)+" java style 출력 " + "=".repeat(5)); //"=".repeat(5) == "="를 다섯번 반복
        System.out.println("이름 : "+ name);
        System.out.println("주소 : "+ addr);
        System.out.println("성별 : "+ gender);
        System.out.println("나이 : "+ age);
        System.out.println("총점 : "+ (kor+eng+mat));
        System.out.println("평균 : "+ ((kor+eng+mat)/3.0));
        System.out.printf("평균 : %.2f\n", (double)((kor+eng+mat)/3));

        //C언어 스타일 츨력방식 : 서식지정자를 사용하는 방식
        System.out.printf("%s\n","===== C언어 스타일 서식지정자 사용");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("습도 : %d%%\n", 65); //정말 %를 표시하려면 %%라고 써야함
        System.out.printf("총점 : %d\n", (kor+eng+mat));

    }
}
