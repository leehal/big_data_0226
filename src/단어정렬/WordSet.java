package 단어정렬;

import java.util.*;

public class WordSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int num = sc.nextInt();
        String word = " ";

        for (int i = 0; i < num; i++) {
            word = sc.next();
            set.add(word);
        }

        String[] wordList = set.toArray(new String[0]); //set의 값을 wordList에 넣어주기

        Arrays.sort(wordList, new  Comparator<>(){
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2); //앞의 값이 사전순으로 뒤에 있는 경우 양수 반환
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(set);
        System.out.println(Arrays.toString(wordList));
    }
}
