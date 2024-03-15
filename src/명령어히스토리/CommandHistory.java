package 명령어히스토리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CommandHistory {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;

    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while (true){
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim(); // 입력받은 문자열의 앞/뒤 공백 제거
            if (cmd.equalsIgnoreCase("q")){ //equalsIgnoreCase: 대소문자 구별 없이 맞는 단어 시O
                System.exit(0); // 프로그램 강제 종료 // 0이 아니여도 O
            }else if (cmd.equalsIgnoreCase("help")){
                System.out.println("help - 도움말을 보여줍니다");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다");
            } else if (cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 0;
                for (String e : history.queue) {
                    cnt++; //명령 history 앞에 숫자를 증가 시켜주기 위해
                    System.out.println(cnt+" "+e);
                }
            }else {
                history.save(cmd);
                System.out.println(cmd);
            }
        }
    }
    void save(String cmd){
        queue.offer(cmd); //주어진 객체 삽입
        if (queue.size() > MAX_SIZE){
            queue.remove(); //주어진 사이즈보다 크면 맨 먼저 삽입된 값을 제거
        }
    }
}
