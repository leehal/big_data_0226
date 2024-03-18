package 스트림기본;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 스트림의 동작은 생성 -> 즁건 연산 -> 최종연산
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> aList = new ArrayList<>(Arrays.asList(arr));

        // .stream(): 스트림 생성 // .filter(): 중간연산: 자료구조를 넣어 조건에 맞는 자료구조를 뽑아냄 // .forEach(): 반복문 (최종연산)
        aList.stream().filter(s-> s>=5).forEach(s-> System.out.println(s));
        //5이상의 값이 들어간 새로운 리스트가 생성됨. -> s //장점: 누가 짜도 동일한 코드, 효과가 남/ 버그가 안나게 됨!

        int sum = aList.stream().mapToInt(e -> e).sum();
//        int sum = aList.stream().reduce(0,Integer::sum);
        int count = aList.size();
        System.out.println("합계 : "+sum+", 횟수 : "+count);

    }
}
