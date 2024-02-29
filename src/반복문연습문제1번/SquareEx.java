package 반복문연습문제1번;

import java.util.Scanner;

//1) 양의정수 n을 입력받아 n * n 크기의 행렬을 출력하는 프로그램 작성

//2) 입력받은 수가 소수인지 아닌지 판별하기 (소수란? 1과 자기자신 이외의 수로는 나누어 지지않는 수를 의미)

//3) 10을 입력하면 10 미만의 소수의 합을 출력
public class SquareEx {
    public static void main(String[] args) {
        
        //1)
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int num = sc.nextInt();
//        int j = 1;
//        for (int i = 1; i <= num * num; i++) {
//
//            System.out.print(j + " ");
//            j++;
//            if (j % num == 1) {
//                System.out.println();
//            }
//            if (j > num * num) break;
//        }
        
        //2)
//        System.out.println();
//        for(int k=2; k<num; k++){
//            int sum;
//            sum=num%k;
//            if (sum==0){
//                System.out.println(num+"은 소수가 아닙니다");break;
//            }else if(k==num-1){
//                System.out.println(num+"은 소수 입니다");break;
//            }
//        }

        //3)
        int stm = num;
        int res=0;
        for(int m=0; m<stm; m++) {
            int tym = num--;
//            System.out.println(tym);
            if(tym==2){
                System.out.println("2는 소수 입니다");
                res =res+2;
            }
            for (int k = 2; k < tym; k++) {
                int sum;
                sum = tym % k;
                if (sum == 0) {
                    System.out.println(tym + "은 소수가 아닙니다");
                    break;
                } else if (k == tym - 1) {
                    System.out.println(tym + "은 소수 입니다");
                    res += tym;
                    break;
                }

            }
        }
        System.out.println(res);
    }
}
