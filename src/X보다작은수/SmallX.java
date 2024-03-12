package X보다작은수;

import java.util.Scanner;

public class SmallX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력 : ");
        int n = sc.nextInt();
        int[] arrayA = new int[n];
        System.out.println("정수입력 : ");
        int x = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            arrayA[i] = (int) ((Math.random() * 45) + 1);
//        }
//        for (int i = 0; i < arrayA.length; i++) {
//            if (arrayA[i]<x){
//                System.out.println(arrayA[i]);
//            }
//        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println((i+1)+"번 배열입력 : ");
            arrayA[i] = sc.nextInt();
        }
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] < x) {
                System.out.println(arrayA[i]);
            }
        }
    }
}
