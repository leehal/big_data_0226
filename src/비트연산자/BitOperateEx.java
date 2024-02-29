package 비트연산자;
// 비트연산자 : 비트 단위로 연산하는 것, 주로 하드웨어 제어, 극도로 성능을 요구하는 영역
// 비트 AND : & (둘 다 1인 경우 1)
// 비트 OR : | (둘 중 하나만 1이면 1)
// 비트 XOR : ^ (비트가 서로 다른 경우에 1)
// 비트 NOT : ~ 비트를 반전
// 쉬프트 : << >> 비트를 왼쪽 또는 오른쫄을 주어진 수 만큼 이동시킴
public class BitOperateEx {
    public static void main(String[] args) {

//      ______________________
//      |128|64|32|16|8|4|2|1|
//      ----------------------

        byte num1 = 10; //1010
        byte num2 = 12; //1100
        System.out.println(num1 & num2); //1000
        System.out.println(num1 | num2); //1110
        System.out.println(num1 ^ num2); //0110
        System.out.println(~num1); //비트를 반전하는 게 8에 대한 완전한 음수는 안나옴
        System.out.println(num1 << 1); //10100
        System.out.println(num1 >> 1); //101

    }
}
