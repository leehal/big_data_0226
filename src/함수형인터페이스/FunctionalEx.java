package 함수형인터페이스;
// 함수형 인터페이스 : 자바는 함수가 독립적으로 만들어질 수 없으므로 사용하는 문법

//@FunctionalInterface // 함수형 인터페이스 //함수를 하나만 넣을 수 있음
abstract interface Calculator {
    int sum(int a, int b);
    default int arry(){return 0;};
}

//class MyCalculator implements Calculator{
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//
//}

public class FunctionalEx {
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
//        int result = mc.sum(100,200);
//        System.out.println(result);

        Calculator mc = Integer::sum;
        int result = mc.sum(100,200);
        System.out.println(result);
    }
}
