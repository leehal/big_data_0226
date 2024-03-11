package 인터페이스;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal[] animal = {new Dog(), new Cat()};
//        for (Animal animal1 : animal) {
//            animal1.sound();
//        }
        Animal shih_tzu = new Dog();
        System.out.println("[시츄의 소리]");
        shih_tzu.sound();

        Animal Maltese = new Dog();
        System.out.println("[말티즈의 소리]");
        Maltese.sound();

        //고양이 페르시안과 먼치킨의 소리를 만들기.
        Animal persian = new Cat();
        System.out.println("[페르시안의 소리]");
        persian.sound();

        Animal munchkin = new Cat();
        System.out.println("[먼치킨의 소리]");
        munchkin.sound();

        //소 클래스를 만들어 음매 소리 만들기.
        Animal bull = new Cow();
        System.out.println("[숫소의 소리]");
        bull.sound();

        Animal ox = new Cow();
        System.out.println("[황소의 소리]");
        ox.sound();

        Animal dachshund = new Dog();
        System.out.println("[닥스훈트는 밥을 먹습니다.]");
        dachshund.eat();

    }
}
