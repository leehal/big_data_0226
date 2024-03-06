package 상속기본;
//상속이란? 자식클래스가 부모클래스의 기능을 물려 받는 것(필드, 메소드)
//자식 클래스는 부모 클래스를 상속 받으면 부모클래스의 크기와 같거나 커진다.
//상속을 받아서 그대로 사용하면 상속 개념이 적용되고, 기능을 개선하고나 새롭게 만들면 다형성(오버라이딩)이 적용된다

public class InheritanceEx {
    public static void main(String[] args) {
        Dog dog = new Dog(); //Dog 클래스의 기본생성자로 객체 생성
        dog.setName("댕댕이1번");
        System.out.println(dog.name);
        HouseDog houseDog = new HouseDog();
        houseDog.setName("댕댕이2번");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
class Animal extends Object{
    String name; //인스턴스 필드
    void setName(String name){
        this.name = name;
    }
    Animal(){} //기본 생성자
}
class Dog extends Animal{
    void sleep(){
        System.out.println(name + "zzz...");
    }
}
class HouseDog extends Dog{
    //오버라이딩 관계가 성립하는지를 문법적으로 확인
    @Override //해당 메소드가 부모 클래스에 있는 메서드를 Override 했다는 것을 명시적으로 선언
    void sleep(){
        System.out.println(name+" zzz in house");
    }
    //메소드 오버로딩
    void sleep(int hour){
        System.out.println(name+" zzz in for "+hour+"hours");
    }
}