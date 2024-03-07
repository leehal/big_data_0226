package 단어공부;

import java.util.ArrayList;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] arr;
        arr = input.toCharArray();
        int[] cnt = new int[arr.length];
        int cntMax = 0;

        for (int i = 0; i < arr.length; ++i) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] - arr[j] == -32 || arr[i] - arr[j] == 32) {
                    cnt[i]++;

                } else if (arr[i] == arr[j]) {
                    cnt[i]++;
                }
            }
        }
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cntMax < cnt[i]) {
                cntMax = cnt[i];
                n = i;
            }
        }
        if (97 <= arr[n] && arr[n] <= 122) {
            arr[n] = (char) (arr[n] - 32);
        }
        System.out.println(arr[n]);
    }
}


