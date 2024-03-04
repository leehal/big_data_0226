package 객체지향기본;

public class OopBasic {
    public static void main(String[] args) {
        Student s1 = new Student("안유진","서울시 역삼동"); //객체생성
        Student s2 = new Student("장원영","서울시 강남구"); //객체생성
        s1.setStudentName("곰돌이사육사");
        s2.setStudentName("안유진");
        s1.setAddress("경기도 수원시");
        s2.setAddress("강남구 청담동");
        s1.showStudentInfo();
        s2.showStudentInfo();

    }
}

class Student {
    private int studentId; //학번, 인스턴스 필드
    private String studentName;
    private int grade;
    private String address;

    Student(String name, String addr){
        studentName = name;
        address = addr;
    }

    public void setStudentId(int id){
        studentId = id;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public void  setGrade(int grade){
        this.grade =grade;
    }
    public void setAddress(String add){
        address =add;
    }

    //메소드 추가
    public void showStudentInfo(){
        System.out.println(studentName+", "+address);
    }
}