package 인터페이스;

public class ImageMain {
    public static void main(String[] args) {
        ImageSize phone = new Phone();
        ImageSize computer = new Computer();

        phone.resize(360,600);
        computer.resize(1280,720);

        phone.buttonSize(50,25);
        computer.buttonSize(300,150);
    }
}
