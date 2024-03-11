package 인터페이스;

public class Sonata implements Car{
    @Override
    public void start() {
        System.out.println("소나타 시동 킴");
    }

    @Override
    public void stop() {
        System.out.println("소나타 시동 끔");
    }
}
