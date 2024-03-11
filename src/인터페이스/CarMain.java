package 인터페이스;

public class CarMain {
    public static void main(String[] args) {
        Car sonata = new Sonata();
        Car avante = new Avante();

        System.out.println("===== 소나타 =====");
        sonata.start();
        sonata.stop();

        System.out.println("===== 아반떼 =====");
        avante.start();
        avante.stop();
    }
}
