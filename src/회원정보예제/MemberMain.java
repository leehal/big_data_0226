package 회원정보예제;
//이름, 나이(1~199), 성별(m/M/ f,F), 직업(1:학생, 2:회사원, 3:무직, 4:주부) 입력 후 최종 출력
//나이, 성별. 직업에서 유효한 값이 아니면 재입력 요구
public class MemberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo(); // MemberInfo 클래스로 객체 생성
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.getInfo();

    }
}
