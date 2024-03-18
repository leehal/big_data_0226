package 예외처리미루기;

import java.io.IOException;

public class ExceptionEx6 {
    public static void main(String[] args) throws IOException {
        IoSample test = new IoSample();
//        try {
//            test.input();
//            test.output();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        test.input();
        test.output();
        //위가 보통(try_catch)인데 미뤄서 걍 밖으로 던져버림
    }
}
class IoSample{
    private int num;
    public void input() throws IOException {
        num = System.in.read();
    }
    public void output(){
        System.out.println(num);
    }
}