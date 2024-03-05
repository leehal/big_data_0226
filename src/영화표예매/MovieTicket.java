package 영화표예매;

import java.util.Scanner;

// 종료하기 시 총 판매 금액 구하기
// 예매하기는 먼저 좌석 상태를 보여주고 예약을 받음, 예약을 하게되면 예약된 상태를 보여줌
public class MovieTicket {

    int ticketPrice;

    MovieTicket(int price){// 객체 생성시 생성자를 통해 티켓 가격을 정함.
        ticketPrice = price;
    }

    //좌석 배열 만들기
    int[] seat = new int[10];
    void printSeat(){ //좌석 목록 보여주기
        for (int i = 0; i < seat.length; i++) {
            if(seat[i]==0) System.out.print("[   ]");
            else System.out.print("[ V ]");
        }
        System.out.println();
    }
    void selectSeat(){
        printSeat(); //좌석 선택전 현재 좌석 현황 보여줌
        Scanner sc = new Scanner(System.in);
        System.out.println("좌석번호를 입력하세요");
        int seatNum = sc.nextInt();

        if(seat[seatNum-1]==0){
            seat[seatNum-1] =1;
            printSeat();
        }else {
            System.out.println("이미 예약된 좌석입니다.");
        }
    }
    //종료 시 좌석 판매에 대한 총 매출액 구하기
    int totalAmount(){
        int cnt =0;
        for (int e : seat) {
            if (e ==1) cnt++;
            return cnt*ticketPrice;
        }
        return ticketPrice;
    }
}
