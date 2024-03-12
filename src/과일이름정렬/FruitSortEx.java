package 과일이름정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//compare() : 두 개의 매개 변수를 받아 값을 비교 함
// 0: 두 객체가 같음을 의미
// 양수 : 첫 번째 객체가 두 번 째 객체보다 크다는 의미
// 음수 : 첫 번째 객체가 두 번 째 객체보다 작다는 의미
public class FruitSortEx {
    public static void main(String[] args) {

        String[] fruit = {"kiwi", "orange", "banana", "mango"};
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                    return -1; //현상태 유지
                }
            }
        };
        Arrays.sort(fruit,comp);
        System.out.println(Arrays.toString(fruit));

        List<String> list = Arrays.asList("AA","BB");
        List<String> list1 = Arrays.asList(fruit);
    }
}
