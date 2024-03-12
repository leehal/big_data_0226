package 스트링버퍼;
// StringBuffer와 StringBuilder는 문자열을 추가하거나 변경할 때 사용
// 동일한 기능을 하는 String을 사용하면 좀 더 간결하긴 하나,
// String 자료형과 달리 문자열이 여러번 반복 추가되어서 한 번만 생성된다
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("java");
        sb.delete(0,3);
        sb.insert(0,"HhH");
        System.out.println(sb);

//        String str ="";
//        str += "Hello";
//        str += " ";
//        str +="Java";
//        System.out.println(str);
    }
}
