package 인터페이스;
// interface를 사용하기 위해선 implements를 사용해야함.
public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("강아지는 멍멍");
    }
    //오류! 인터페이스에 없음!
    public void eat(){
        System.out.println("냠냠 맛있게 먹습니다.");
    }
}
