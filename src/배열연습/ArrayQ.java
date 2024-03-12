package 배열연습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ {
    public static void main(String[] args) {
        System.out.println("정수입력");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer[] arr = new Integer[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random()*num)+1);
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println(Arrays.binarySearch(arr,num));
    }
}
