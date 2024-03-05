package 더하기문제;

import java.util.Scanner;

public class Plusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0; // 입력받은 수의 10의 자리와 1자리를 분리해서 더함
        int newNumber = 0; // 새롭게 만들어진 수
        int cnt = 0; // 사이클 회수 누적
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int tmp = input; // 입력 받은 값이 변경되는 걸 막기 위해 임시 값을 만듬
        while (true) {
            sumNumber = (tmp / 10) + (tmp % 10); // 입력값을 10의 자리와 1자리로 분리해서 더함
            newNumber = (tmp % 10) * 10 + (sumNumber % 10); // 입력값의 1의 자리 + 계산된 값의 1자의 더함
            cnt++;
            if (newNumber == input) break; // 더하기 조건에 따라 1 Cycle 순회 후 입력 받은 값과 비교
            tmp = newNumber; // 순회를 위해 만들어진 값을 순회용 변수에 대입
        }
        System.out.println(cnt);
    }
}
