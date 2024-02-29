package 스캐너사용;
import java.util.Scanner;//유틸에 있는 Scanner를 가져옴

//Scanner 클래스 : 자바에서 입력을 받기 위해서 만들어진 클래스(콘솔 입력, 파일 입력 등이 가능)

public class ScannerEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// 스캐너 클래스로 sc참조변수에 객체를 생성해 대입 함
        //= java.util.Scanner sc = new java.util.Scanner(System.sc)으로 유틸없이 사용가능

//        byte a = sc.nextByte(); 		// byte 형 입력 및 리턴
//        short b = sc.nextShort(); 		// short 형 입력 및 리턴
//        int c = sc.nextInt(); 			// int 형 입력 및 리턴
//        long d = sc.nextLong(); 		// long 형 입력 및 리턴
//        char ch = sc.next().charAt(0); // 문자 입력
//
//        float e = sc.nextFloat(); 		// float 형 입력 및 리턴
//        double f = sc.nextDouble(); 	// double 형 입력 및 리턴
//
//        boolean g = sc.nextBoolean(); 	// boolean 형 입력 및 리턴
//
//        String h = sc.next(); 			// String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
//        String i = sc.nextLine(); 		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine(); //버퍼 비우기

        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine(); //주소는 공백이 포함되므로 nextLine()사용 enter가 없으면 넘어가지지 X

        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println();

        System.out.println("===== 회원정보 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);



    }
}
