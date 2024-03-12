package 클론;
// 클론 메소드는 얕은 복사가 일어날 상황에서 깊은 복사가 일어나도록 해주는 메소드
//깊은 복사(Deep Copy)는 '실제 값'을 새로운 메모리 공간에 복사하는 것을 의미하며,
//얕은 복사(Shallow Copy)는 '주소 값'을 복사한다는 의미입니다.
public class CloneEx {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 23, true);
        Member mem2 = mem1.getMember();
        mem2.age = 100;
        mem2.name = "test";

        System.out.println("name : " + mem1.name);
        System.out.println("name : " + mem2.name);

        System.out.println("age : " + mem1.age);
        System.out.println("age : " + mem2.age);
    }
}