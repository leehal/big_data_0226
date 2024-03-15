package 학생성적정렬;

import java.util.*;

public class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            List<Student> list = new ArrayList<>();
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            list.add(new Student(name,score));
        }
//        Arrays.sort(list ,new  Comparator<Student>(){
//            @Override
//            public int compare(Student o1 , Student o2) {
//                if (o1.getScore() == o2.getScore()){
//                    return Integer.compare(o1.getScore(),o2.getScore());
//                } else {
//                    return 0;
//                }
//                o1.getName().compareTo(o2.getName());
//            }
//        });;
        for (Student student : list) {
            System.out.println(student.getName()+" : "+student.getScore());
        }
    }
}
class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
