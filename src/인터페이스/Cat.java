package 인터페이스;

public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("고양이는 야옹");
    }

    @Override
    public void eat() {

    }
}
