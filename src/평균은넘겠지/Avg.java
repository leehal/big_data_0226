package 평균은넘겠지;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cl> list = new ArrayList<>();
        System.out.println("반 몇 개?");
        int case1 = sc.nextInt();
        for (int e = 0; e < case1; e++) {
            System.out.println((e + 1) + "번째 반 몇 명?");
            int stu = sc.nextInt();
            int[] sco = new int[stu];
            for (int j = 0; j < stu; j++) {
                System.out.println((j + 1) + "번째 학생 점수입력");
                sco[j] = sc.nextInt();
                list.add(new Cl(stu,sco[j]));
            }
            for (int j = 0; j < sco.length; j++) {
                System.out.print(sco[j] + " ");
            }
            System.out.println();
        }
        System.out.println(list.stream().toList());
    }
}

class Cl {
    int stcnt;
    int num = 1;
    Integer[] stsc = new Integer[1];

    public Cl(int stcnt, int stsc) {
        this.stcnt = stcnt;
        for (int i = 0; i < this.stsc.length; i++) {
            if (this.stsc[i] != null) {
                this.stsc[i] = stsc;
            }
            num++;
        }
    }
}
