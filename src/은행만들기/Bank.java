package 은행만들기;

public class Bank {
    private static int count = 0; //클래스 내부에서만 접근 가능하고, static이 있음으로 정적 필드임(클래스 생성 시 생성 됨)
    private int account; //잔액
    private String bank;
    Bank(String name, int account){
        count++; //클래스 필드, 생성자가 호출 될 때 마다 값이 증가
        this.bank = name;
        this.account = account; // 잔액
        System.out.println(name+" 은행에 계좌를 개설 합니다. "+account+"입니다.");
    }
    public static int getCount(){ //정적 메소드
        return count;
    }
    public void setDeposit(final int dep){ //입금된 금액을 바꿀 수 없게 하려고 (다른 과정 중 바뀌지 않게)
        this.account += dep; //현재 잔액에 예금을 더함
        System.out.println(dep+"을 예금 했습니다.");
    }
    public void setWithDraw(final int with){ //출금
        if (with > account){
            System.out.println("잔액이 부족합니다.");
        }else {
            account -= with;
        }
    }
    public void viewAccount(){
        System.out.println("현재 잔액은 "+account+"원 입니다.");
    }
}
