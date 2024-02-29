package 메모리구조;

public class MemoryMap {
    public static void main(String[] args) {
        //기본 타입 변수
        int age = 25;
        //참조 타입 변수
        Integer age2 = 25; //사용자 편의 때문에 new를 안씀 -->heap영역
        String name ="페퍼"; //name-->stack영역 // 페퍼---->static영역
        String name2 = new String("네모"); //heap영역

        //null, NullPointException
        //null은 객체를 참조하지 않는다는 의미
        //참조 타입 변수가 바라보고 있는 위치에 객체가 없으면 NullPointException가 발생
        int[] intArray = null;
        String name3 =null;
//        int jobs =null; //에러! int형은 참조타입이 아님!
        Integer jobs = null; //편의로 가능하게 한 예외적인 케이스

//        Integer kk = null; //임의로 NullPointException 띄우기
//        int jj =kk;
//        System.out.println(jj);
        
        //참조 변수의 ==, != 연산
        String strVal1 ="나희도";
        String strVal2 = new String("나희도");
        
        if (strVal1 == strVal2){
            System.out.println("참조 타입의 주소가 같음을 의미");
        }else {
            System.out.println("참조 타입의 주소가 다름을 의미");
        }

        if (strVal1.equals(strVal2)) {
            System.out.println("참조하고 있는 변수의 내용이 같음");
        }
    }
}
