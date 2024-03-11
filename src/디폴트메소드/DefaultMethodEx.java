package 디폴트메소드;
//디폴트 메소드란? 인터페이스에 있는 구현 메서드를 의미
//메서드 앞에 detault 예약어 사용
// {} 구현부가 존재해야 함.

import java.util.Scanner;

public class DefaultMethodEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoteControl remoteControl ;
        System.out.println("제품선택 : (1) TV (2) 오디오");
        int sel = sc.nextInt();
        if (sel == 1){
            remoteControl = new TV();
            remoteControl.turnOn();
            remoteControl.setVolume(20);
            remoteControl.setMute(true);
            RemoteControl.changeBattery();
        }

    }
}
