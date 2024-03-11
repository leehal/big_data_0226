package 코코아톡;

public class CoCoaTok {
    private String to; //상대방 이름
    private String msg; //전달한 메세지
    public CoCoaTok(String name){
        to = name;
    }
    public void writeMsg(String msg){
        this.msg = to+" : "+msg;
    }
    public void csend(NetworkAdapter na){
        na.send(msg);
    }
}
