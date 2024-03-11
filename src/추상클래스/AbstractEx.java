package 추상클래스;

import java.util.ArrayList;
import java.util.List;

//추상클래스는 객체를 생성할 수 없는 클래스를 의미
//추상클래스에는 추상메소드와 일반메소드가 혼용 되어 있음
//다중상속을 지원하지 않음
//추상메소드는 반드시 자식클래스에서 오버라이딩을 해야함
//부모가 해당 메소드를 구현하지 않았기 때문
//상속은 오버라이딩이 선택이나 추상메소드는 필수
public class AbstractEx {
    public static void main(String[] args) {
//        Phone phone = new Phone() { //1회용 추상클래스 구현부
//            @Override
//            void call() {
//                
//            }
//        }
        SmartPhone smartPhone = new SmartPhone("Lg");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new SmartPhone("Galaxy");
        phone.setPower(true);
//        phone.internet(); //부모는 자식것을 쓸 수 X //인터페이스 다중상속 또는 오버로딩 하기.
        phone.call();

        List list = new ArrayList(); // List가 ArrayList의 부모 클래스
        ArrayList arrayList = new ArrayList();
    }
}
