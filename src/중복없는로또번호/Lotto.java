package 중복없는로또번호;

//Math.random() : 0.0 =< 범위 < 1.0

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int val, index = 0;
        boolean isExist = false;
        while(true) {
            val = (int)((Math.random() * 45) + 1);
            for (int i = 0; i < 6; i++) {
                if (lotto[i] == val) isExist = true;
            }
            if(!isExist) lotto[index++] = val;
            if(index == 6) break;
            isExist = false;
        }
        for(int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
    }
}