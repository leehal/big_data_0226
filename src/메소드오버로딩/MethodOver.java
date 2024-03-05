package 메소드오버로딩;
// : 같은 이름의 메소드를 중복하여 정의하는 것
//1. 메소드 이름이 같아야 함.
//2. 매개변수의 개수나 타입이 달라야 함.
//3. 반환타입은 의미 없음(해당 사항 없음)
public class MethodOver {
    public static void main(String[] args) {
        System.out.println(sum(100,200));
        System.out.println(sum(100,200,300));
        System.out.println(sum(100,"kk",300));
        System.out.println(sum("Korea" , "Seoul"));
    }
    static int sum(int x, int y){
        return x+y;
    }
    static String sum(String x, String y){
        return x+" "+y;
    }
    static int sum(int x, int y, int z){
        return x+y+z;
    }
    static int sum(int x, String y, int z){
        if (y.equals("kk"))return x+10000+z;
        else return x+z;
    }
}
