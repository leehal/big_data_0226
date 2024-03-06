package 상속응용1;
//상속에서 final 사용
//final : 수정 불가 상태로 만드는 것

public class InheritanceEx2 {
    public static void main(String[] args) {

    }
}
class Car {
    int spead; //인스턴스 필드
    String color;
    String name;

    final void accelerator(){
        System.out.println("차의 속도를 증가 시킵니다.");
    }
    final void breakPannel(){
        System.out.println("차의 속도를 감소 시킵니다.");
    }
}
class SportsCar extends Car{
    boolean isTurbo;
    SportsCar(String name){
        isTurbo = false;
        spead = 280;
        this.name = name;
        color = "red";
    }
    int getSpeed(){
        if (isTurbo) return spead*=1.2;
        return spead;
    }
    boolean isTurbo(){
        return isTurbo;
    }
    void infoCar(){
        System.out.println("이름 : "+name);
        System.out.println("속도 : "+getSpeed());
        System.out.println("색상 : "+color);
        System.out.println("부스트 : "+isTurbo);
    }
}