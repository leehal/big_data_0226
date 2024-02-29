package 배열기본;

public class ArrayBasicEx {
    public static void main(String[] args) {
        int[] arr = new int[3]; //길이가 3개인 정수 타입
        arr[0] = 85;
        arr[1] = 100;
        arr[2] = 67;

//        for (int i = 0; i < arr.length; i++) { //아예 배열 값이 바뀜
//            arr[i] += 1;
//            System.out.println(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        //향상된 for문 : 자동 순회, 자동 순회 하면서 요소의 값을 가져옴
//        for (int e : arr) { //실제 배열값은 바뀌지 X
//            e += 3;
//            System.out.println(e+ " ");
//        }
//
//        System.out.println();
//
//        for (int e : arr) { //다시찍은 걸 보면 +1된 값이 보임.
//            System.out.println(e+ " ");
//        }

        //문자열 배열
        String[] weeks ={"일","월","화","수","목","금","토"};
        for (String week : weeks) {
            System.out.println(week);
        }

    }
}
