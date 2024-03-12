package 열거타입;

// 열거타입이란 한정된 값이 열거 상수 중에서 하나의 상수를 저장하는 타입
// 입력 삾의 타입을 제한 할 수 있음
public class EnumEx {
    public static void main(String[] args) {
        Developer developer = new Developer("곰돌이", Career.SENIOR, DevType.FRONTEND, Gender.MAN);
        developer.devInfo();
    }
}

enum Career {
    JUNIOR, SENIOR
}

enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA
}

enum Gender {
    MAN, FEMALE
}

class Developer {
    private String name;
    private Career career; //개발자 등급(시니어, 주니어)
    private DevType devType;
    private Gender gender;

    public Developer(String name, Career career, DevType devType, Gender gender) {
        this.name = name;
        this.career = career;
        this.devType = devType;
        this.gender = gender;
    }

    public void devInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + devType);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}