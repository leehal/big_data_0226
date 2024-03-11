package 다운캐스팅;

import java.util.ArrayList;

public class DownCastingEx {
    //Anomal 클래스 타입의 객체를 List형태로 관리하기 위해 사용
    ArrayList<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCastingEx downCastingEx = new DownCastingEx();
        downCastingEx.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        downCastingEx.downCasting();
    }
    public void addAnimal(){
        aniList.add(new Animal()); //Animal 객체를 생성해서 aniList에 대입.
//        == Animal animal =new Animal(); aniList.add(animal); //위의 줄을 풀어 쓴 것
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for (Animal e : aniList) {
            e.move();
        }
    }
    public void downCasting(){
        for (int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i);
            if (ani instanceof Human){ // 현재의 리스트가 Human현으로 다운캐스팅 가능한지 확인
                Human h = (Human) ani;
                h.readBook();
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            }else {
                System.out.println("지원되지 않는 형 입니다.");
            }
            {

            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("동물이 움직 입니다.");
    }
}
class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람은 두발로 걷습니다");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다");
    }
}
class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이는 네 발로 뜁니다");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다");
    }
}
class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 납니다");
    }
    public void flying(){
        System.out.println("독수리가 날개를 펴고 멀리 날아갑니다");
    }
}