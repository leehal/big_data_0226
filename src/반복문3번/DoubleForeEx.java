package 반복문3번;
//이중 for문 사용해서 구구단 찍기
public class DoubleForeEx {
    public static void main(String[] args) {
        for(int i=2; i<10; i++){
            System.out.println("구구단수 찍기 : "+i+"단");
            if( i%2 ==0)continue; //홀수단만 찍기
            for(int j=1; j<10; j++){
                System.out.printf("%d x %d = %d\n", i , j, (i*j));
            }

            System.out.println();
        }
    }
}
