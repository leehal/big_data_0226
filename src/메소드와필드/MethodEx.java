package 메소드와필드;

public class MethodEx {
    public static void main(String[] args) {
        say("곰돌이 사육사"); //메소드 호출, 메소드는 선언이 되어 있더라도 호출하지 않으면 동작하지 않음.
        int result = sum(1, 2, 3, 4, 5, 6, 7);
        sum();
    }

    //static은 메소드 앞에 사용하면 클래스 메소드라고 하며, 객체로 생성되지 않음.
    //매개변수의 개수를 모르는 경우
    static int sum(int ...values) {
        int sum=0;
        for (int i = 0; i < values.length; i++) {
           sum += values[i];
        }
        return sum;
    }
    //반환타입도 없고 매개변수도 없음
    static void say(String name) {
        System.out.println("Hi.........." + name);
    }
    //재귀호출

}
