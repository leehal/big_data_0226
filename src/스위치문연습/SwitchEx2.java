package 스위치문연습;
// 스위치문에서 조건을 비교하는 변수로 사용될 수 있는 것은 정수, 문자, 문자열 가능, 실수는 안됨

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
//        int x, y; //좌우변값
//        char op;  //연산자
//        Scanner sc = new Scanner(System.in);
//        System.out.print("계산식 입력 : ");
//        x = sc.nextInt();
//        op = sc.next().charAt(0);
//        y = sc.nextInt();
//
//        switch (op) {
//            case '+':
//                System.out.println("덧셈결과 : " + (x + y));
//                break;
//            case '-':
//                System.out.println("뺏셈결과 : " + (x - y));
//                break;
//            case '*':
//                System.out.println("곱셈결과 : " + (x * y));
//                break;
//            case '/':
//                System.out.println("나눗셈결과 : " + ((double)x / y));
//                break;
//            default:
//                System.out.println("계산식을 잘 못 입력 했습니다. ");
//        }

//        //1)
//        Scanner sc = new Scanner(System.in);
//        int score;
//        char grade;
//        while (true) {
//            System.out.print("성적을 입력해주세요 : ");
//            score = sc.nextInt();
//
//            if (100 >= score && score >= 90) {
//                grade = 'A';
//                System.out.println(grade);
//            } else if (90 > score && score >= 80) {
//                grade = 'B';
//                System.out.println(grade);
//            } else if (80 > score && score >= 70) {
//                grade = 'C';
//                System.out.println(grade);
//            } else if (70 > score && score >= 60) {
//                grade = 'D';
//                System.out.println(grade);
//            } else if (60 > score && score >= 0) {
//                grade = 'F';
//                System.out.println(grade);
//            } else {
//                System.out.println("성적이 잘못 입력되었습니다.");
//                continue;
//            }
//            break;
//        }

//        //2)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("세자리 정수를 입력하세요");
//        int num = sc.nextInt();
//
//        while (num<100){
//            System.out.print("100의 자리숫자로 다시 입력부탁드립니다 : ");
//            sc = new Scanner(System.in);
//            num = sc.nextInt();
//        }
//
//        int a = num/100;
//        int b = (num-a*100)/10; // (num%100)/10
//        int c = num-(a*100+b*10); // num%10
//
//        if(a>b && a>c){
//            System.out.println("가장 큰 수는" + a);
//        } else if (b>c) {
//            System.out.println("가장 큰 수는" + b);
//        } else {
//            System.out.println("가장 큰 수는" + c);
//        }

//        //3)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("이름 입력 : ");
//        String name = sc.nextLine();
//        System.out.println("제목 입력 : ");
//        String title = sc.nextLine();
//        System.out.println("계절 입력 : (ex:20240228)");
//        String date = sc.nextLine();
//        System.out.println("시간 입력 : (시)");
//        int time = sc.nextInt();
//
//        int year = (Integer.parseInt(date)/10000);
//        int mon = (Integer.parseInt(date)%10000)/100;
////        int mon = Integer.parseInt(date.substring(4,6)); //4,5만 포함 6미만임.
//        int day = (Integer.parseInt(date)%100);
//
//        System.out.println("\n["+name+"]"+"님.");
//        switch (mon){
//            case 12,1,2:
//                System.out.println("한파의 연속인 "+mon+"월 입니다");
//                break;
//            case 3:
//                System.out.println("봄의 기운이 느껴지는 "+mon+"월 입니다");
//                break;
//            case 4:
//                System.out.println("새싹이 피어나는 "+mon+"월 입니다");
//                break;
//            case 5:
//                System.out.println("계절의 여왕 "+mon+"월 입니다");
//                break;
//            case 6:
//                System.out.println("활동하기 좋은 "+mon+"월 입니다");
//                break;
//            case 7:
//                System.out.println("휴가가 기다려지는 "+mon+"월 입니다");
//                break;
//            case 8:
//                System.out.println("무더운 "+mon+"월 입니다");
//                break;
//            case 9:
//                System.out.println("선선한 "+mon+"월 입니다");
//                break;
//            case 10:
//                System.out.println("천고마비의 계절 "+mon+"월 입니다");
//                break;
//            case 11:
//                System.out.println("쓸쓸한 늦가을 "+mon+"월 입니다");
//                break;
//        }
//        System.out.println("아래의 일정으로 ["+title+"]를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.\n");
//        System.out.println("===== 행사안내 =====");
//        System.out.println("행사 안내 : ["+title+"]");
//        System.out.println("일시 : ["+year+"]년 ["+mon+"]월 ["+day+"]일");
//        System.out.println("시간 : ["+time+"]시");

        //4)
        int h, m, h2, m2;
        Scanner sc = new Scanner(System.in);
        System.out.println("시간을 입력하세요 (0 ≤ H ≤ 23)");

        h = sc.nextInt();
        while (0 > h || h > 23) {
            System.out.println("다시 시간을 입력하세요 (0 ≤ H ≤ 23)");
            h = sc.nextInt();
        }
        System.out.println("분을 입력하세요 (0 ≤ M ≤ 59)");
        m = sc.nextInt();
        while (0 > m || m > 59) {
            System.out.println("다시 분을 입력하세요 (0 ≤ M ≤ 59)");
            m = sc.nextInt();
        }
        if (h==0 && m<45) {
            h2=23;
            m2=(m + 60) - 45;
        } else if (h==0 && m==45) {
            h2=23;
            m2=0;
        } else if (m >= 45) {
            h2 = h;
            m2 = m - 45;
        } else {
            h2 = h - 1;
            m2 = (m + 60) - 45;
        }
        System.out.println("알람 설정할 시간은 " + h2 + "시 " + m2 + "분 입니다.");

    }
}
