package 예외상황2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx2 {
    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("../프로퍼티/database.properties"));
//        } catch (FileNotFoundException e) {
//            System.out.println("파일을 찾을 수 없습니다");
//        }

        //위의 throw문 안쓰고 위로하면 오류가 나지않고 "파일을 찾을 수 없음"이 뜸
        BufferedReader br = new BufferedReader(new FileReader("../프로퍼티/database.properties"));
    }
}
