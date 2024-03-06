package 객체타입확인;
// 객체 타입을 확인하는 instanceof
public class ObjectType {
    public static void main(String[] args) {
        Parent parent = new Parent("부모 클래스");
        Child child = new Child("자식 클래스");
        System.out.println(parent instanceof Parent);//parent라는 참조변수가 Parent 클래스와 같은 타입인가? (상속하는지)--> true
        System.out.println(child instanceof  Parent);//--->true
        System.out.println(parent instanceof Child);//--->false
        
        Parent parent1 = new Child("ddd"); //--->가능
//        Child child1 = new Parent("nnn"); //--->불가능
    }
}
class Parent{
    String name;
    Parent(String name){
        this.name = name;
    }
}
class Child extends Parent{

    Child(String name) {
        super(name); //부모 클래스의 생성자 호출  //기본 생성자일 경우 필요X
        this.name = name;
    }
}
/*
    super
    자신이 상속받은 부모 클래스에 대한 레퍼런스 변수로,
    부모 클래스의 멤버에 접근할 때 사용

    super()
    자식 클래스의 모든 생성자는 부모 클래스의 생성자를 포함하고 있어야 합니다.
    그런데 만약 자식 클래스의 생성자에 부모 클래스의 생성자가 지정되어 있지 않다면,
    컴파일러가 자동으로 부모 클래스의 기본생성자를 호출

 */