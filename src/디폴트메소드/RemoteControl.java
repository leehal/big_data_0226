package 디폴트메소드;
// 객체는 상속 받지 X
public interface RemoteControl {
    final static int MAX_VOLUME = 100; //final static 자동 추가 (기능 명세에서 미리 정한 값의 의미)
    int MIN_VOLUME = 0;
    void turnOn(); //자동으로 public abstract가 붙음
    void turnOff();
    void setVolume(int volume);
    // 디폴트 메소드 추가 : JDK 8 이후 추가 됨
    default void setMute(boolean mute){ //상속 받는 것이 자유 //할 수도 O 안 할 수도 O
        if (mute) System.out.println("무음 처리 합니다");
        else System.out.println("무움 해제 합니다");
    }//인터페이스를 상속받으면 모든 상속받은 클래스들이 새 메서드를 추가 할 때마다 오류나서 만들어 준 것.
    //static을 사용하면 RemoteControl 인터페이스 소속이므로 메소드 구현 가능
    //but static은 정적메소드 이므로 상속 불가능
    static void changeBattery(){
        System.out.println("건전지를 교체합니다.");
    }
}
