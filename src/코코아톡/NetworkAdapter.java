package 코코아톡;

public interface NetworkAdapter {
    public abstract void connect(); //인터페이스는 기본적으로 public abstract가 생략되어 있음.
    void send(String msg);

}

class Wifi implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("Wifi에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("Wifi >> "+msg);
    }
}
class FiveG implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("FiveG에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("FiveG >> "+msg);
    }
}
class LTE implements NetworkAdapter{

    @Override
    public void connect() {
        System.out.println("LTE에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> "+msg);
    }
}
