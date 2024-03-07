package 접근제한자;

public class Restrictor extends City{
    public void seoul(){
        System.out.println("서을 메소드는 public");
    }
    void busan(){
        System.out.println("부산 메소드는 default");
    }
    protected void inchun(){
        System.out.println("인천 메소드는 protected");
    }
    private void daegu(){
        System.out.println("대구 메소드는 private");
    }
}
