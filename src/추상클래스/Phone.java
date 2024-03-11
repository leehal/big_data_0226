package 추상클래스;
//abstract 사용시 객체생성이 불가하다
public abstract class Phone { //추상클래스 //객체생성불가
    public String name;
    public boolean isPower;

    public Phone(String name) {
        this.name = name;
    }

    public void setPower(boolean power) {
        isPower = power;
        if (isPower){
            System.out.println("Phone Power On");
        }else {
            System.out.println("Phone Power Off");
        }
    }
    abstract void call(); //추상메소드 상속받아서 반드시 구현해야함. 강제성 부여. 구현부인 {}가 없고 앞에 abstract 붙음.
}
