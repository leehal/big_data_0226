package 평균은넘겠지;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Avg {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        double[]result = new double[testCnt];
        for(int i = 0; i < result.length; i++) {
            result[i] = overRate();
        }
        for(double val : result) {
            System.out.printf("%.3f%%\n", val);
        }
    }
    static double overRate() {
        int total = 0, overCnt = 0;
        Scanner sc = new Scanner(System.in);
        int studentCnt = sc.nextInt();
        int[] score = new int[studentCnt];
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }
        double average = (double)total / studentCnt;
        for(int val : score) {
            if (val > average) overCnt++;
        }
        return (double)overCnt/studentCnt * 100;
    }
}

//public class Avg {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Cl> list = new ArrayList<>();
//        System.out.println("반 몇 개?");
//        int case1 = sc.nextInt();
//        for (int e = 0; e < case1; e++) {
//            System.out.println((e + 1) + "번째 반 몇 명?");
//            int stu = sc.nextInt();
//            int[] sco = new int[stu];
//            for (int j = 0; j < stu; j++) {
//                System.out.println((j + 1) + "번째 학생 점수입력");
//                sco[j] = sc.nextInt();
//                list.add(new Cl(stu,sco[j]));
//            }
//            for (int j = 0; j < sco.length; j++) {
//                System.out.print(sco[j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(list.getFirst());
//    }
//}
//
//class Cl {
//    int stcnt;
//    int num = 1;
//    Integer[] stsc = new Integer[1];
//
//    public Cl(int stcnt, int stsc) {
//        this.stcnt = stcnt;
//        for (int i = 0; i < this.stsc.length; i++) {
//            if (this.stsc[i] != null) {
//                this.stsc[i] = stsc;
//            }
//            num++;
//            if (stcnt == num)break;
//        }
//    }
//}