package Set인터페이스;

import java.util.Arrays;
import java.util.HashSet;

// Set 인터페이스 : 중복을 허용 X
// HashSet 클래스 : 순서를 유지하지 않고 중복 허용 X, 집합의 개념
public class HashSetBasicEx {
    public static void main(String[] args) {
        String[] data = {"H","e","l","l","o"};
        HashSet<String> set = new HashSet<>(Arrays.asList(data));
        System.out.println(set); //순서유지 X 중복허용 X

        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("C");
        set1.add("C++");
        set1.add("Python");
        set1.add("Java");

        for (String s : set1) {
            System.out.print(s+ " ");
        }
    }
}
