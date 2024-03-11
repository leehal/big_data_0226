package 인터페이스심화;

public interface NetworkAdapter {
    public abstract void connect(); // 인터페이스는 자동으로 public abstract가 포함되나 생략되어 있음.

}
class WiFi implements NetworkAdapter{

    String company;
    WiFi(String com){
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company+" WiFi가 연결되었습니다");
    }
}
class FiveG implements NetworkAdapter{

    String company;
    FiveG(String com){
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company+" FiveG가 연결되었습니다");
    }
}
class LTE implements NetworkAdapter{

    String company;
    LTE(String com){
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company+" LTE가 연결되었습니다");
    }
}