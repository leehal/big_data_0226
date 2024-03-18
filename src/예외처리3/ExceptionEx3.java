package 예외처리3;

public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        try {
            String testStr = test.name;
            System.out.println(testStr);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 에러");
        }
    }
}

class Test {
    String name = "곰돌이사육사";
}