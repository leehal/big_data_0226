package Math클래스;
// Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
// Math 클래스의 모든 메소드는 클래스 메소드이므로, 객체 생성을 하지 않음
// java.lang 기본 패키지에 ㅠㅗ함되어 있어 별도의 import가 필요 없음.
public class MathEx {
    public static void main(String[] args) {
        // random: 0.0이상 1.0 미만의 임의의 double 형 값을 생성해서 반환
        int lotto = (int)((Math.random()*45)+1);
        // abs() : 절대값(음수이면 양수, 양수이면 음수)
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-3.14));
        // ceil(): 소수점 이하를 무조건 올림
        System.out.println(Math.ceil(10.0000001));
        // floor(): 소수점 이하 제거
        System.out.println(Math.floor(10.99999));
        // round(): 반올림
        System.out.println(Math.round(10.49999));
        System.out.println(Math.round(10.5000));
        // max: 두 개의 변수 값 중 큰 값 반환
        System.out.println(Math.max(100,200));
        // min: 두 개의 변수 값 중 작은 값 반환
        System.out.println(Math.min(100,200));
    }
}
