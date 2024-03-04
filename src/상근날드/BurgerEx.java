package 상근날드;
//햄버거 3가지 종류
//음료 2가지 종류
//햄버거 3가지 중 가장 싼거, 음료 2가지 중 가장 싼거 가격을 선택하고,
//세트 메뉴 이므로 50원 할인해서 금액 계산

import java.util.Scanner;

public class BurgerEx {
    public static void main(String[] args) {
        int[] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        // 배열에 햄버거와 음료 가격을 입력받음
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int minBurger = menu[0]; //버거 중 1개의 임의의 값
        int minDrink = menu[3]; //음료 중 한 개의 임의의 값
        // 햄버거와 음료 중 제일 싼 메뉴 찾기
        for(int i = 0; i < menu.length; i++) {
            if((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if((i > 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50);

    }
}
