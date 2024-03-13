package 벡터;

import java.util.List;
import java.util.Vector;

// Vector : List 인터페이스를 상속받아 만든 리스트 타입의 자료 구조
// Vector는 동기화 기능을 제공하므로 멀티쓰레드 환경에서 안전
// 하지만 성능이 ArrayList에 비해서 떨어지므로 특별한 경우가 아니면 ArrayList를 사용
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("카즈하","kz@naver.com","010-1234-3423","idol"));
        list.add(new NameCard("김채원","kch@naver.com","010-5678-3423","idol"));
        list.add(new NameCard("은채","ech@naver.com","010-9876-3423","idol"));

        for (NameCard nameCard : list) {
            System.out.println("이름 : "+nameCard.name);
            System.out.println("이름 : "+nameCard.eMail);
            System.out.println("이름 : "+nameCard.phone);
            System.out.println("이름 : "+nameCard.jobs+"\n");
        }

    }
}
class NameCard{
    String name;
    String eMail;
    String phone;
    String jobs;

    public NameCard(String name, String eMail, String phone, String jobs) {
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
        this.jobs = jobs;
    }
}