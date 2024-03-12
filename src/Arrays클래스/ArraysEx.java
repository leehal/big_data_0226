package Arrays클래스;

import java.util.Arrays;
import java.util.Collections;

// 배열을 다루기 위한 다양한 메소드 포함
public class ArraysEx {
    public static void main(String[] args) {
        Integer[] arr = {5, 4, 3, 7, 8, 9, 2, 1};
        Arrays.sort(arr);
        for (int e : arr) { // 오름차순
            System.out.print(e + " ");
        }
        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder()); //기본타입이면 오류! 즉 int X , 동일한 구조로 만드려면 참조타입이여야 함.
        for (int e : arr) { // 내림차순
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(arr,5)); //음수가 나오면 못 찾았다는 이야기. 정렬(sort)를 안하면 못 찾을 수 O

    }
}
