package 집합;

import java.util.Arrays;
import java.util.HashSet;

// 집합은 중복값이 없음
// 합집합 : 둘 중 한군데 값이 존재하면 모두 포함, 중복이 되는 경우 한 개의 값만 포함
// 교집합 : 두 군데 모두 존재해야 포함
// 차집합 : 앞의 데이터에서 뒤의 데이터를 빼고 남은 것
public class SetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
//        s1.addAll(s2); // 합집합을 수행
//        s1.removeAll(s2); // 차집합 수행
        s1.retainAll(s2); // 교집합 수행
        System.out.println(s1);
    }
}
