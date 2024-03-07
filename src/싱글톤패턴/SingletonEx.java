package 싱글톤패턴;
// 싱글톤이란? 단 한 개의 객체만 생성되도록 하는 패턴
// 사용하는 이유는 메모리 철학(스프링 부트에서 많이 사용, Bean),데이터 공유 목적
public class SingletonEx {
    public static void main(String[] args) {
        SingletonTest1 test1 = new SingletonTest1();
        SingletonTest2 test2 = new SingletonTest2();
        test1.setInfo("동그라미",0);
        test2.viewInfo();
    }
}
