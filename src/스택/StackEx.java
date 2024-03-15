package 스택;

import java.util.Stack;

// 스택은 Last in_First out 구조로 동작 (생각보다 프로그램 내부에선 상당히 많이 사용)
// 네비게이션 이동, 함수의 호출 등등에서 많이 사용
// 벡터 클래스의 기능을 제한해서 사용
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(345);
        stack.push(56);
        System.out.println(stack.peek()); //최상위값 확인
        System.out.println(stack.pop()); //최상위값 추출 / 보여줌
        System.out.println(stack.empty()); //비어있는지 확인
        System.out.println(stack.size()); //사이즈 확인
        System.out.println(stack.contains(1)); //해당값이 포함되어 있는지 확인
        System.out.println(stack.peek()); //최상위값 확인
    }
}
