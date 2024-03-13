package 어레이리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// List 인터페이스 : ArrayList, Vector, LinkedList 부모 인터페이스
// List의 특징을 배열과 유사하지만, 동적으로 크기가 변합니다.
// 특징
// - 요소의 저장 순서 위치
// - 중복 저장 허용
// - 여러가지 메소드 제공
public class ArrayListEx {
    public static void main(String[] args) {
//        List<String > pitches = new ArrayList<>();
//        pitches.add("138"); //리스트에 값 추가
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches);
//        String one = pitches.get(0);
//        String two = pitches.get(1);
//        System.out.println(one + " " + two);

        // asList() : 배열을 List로 변활하기 위해 사용
        String[] data = {"123","234","125"};
        List<String > pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);
    }
}
