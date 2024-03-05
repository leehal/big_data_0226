package 생성자TV;

public class TV {
    private boolean ison; //전원
    private  int channel;
    private int volume;
    
    // 매개변수 없는 기본 생성자
    TV(){
        ison = false;
        channel = 11;
        volume =10;
        System.out.println("전원 : "+ison+" 채널 : "+channel+" 볼륨 : "+volume);
    }
    // 생성자 오버로딩 된 생성자
    TV(boolean ison , int channel, int volume){
        this.ison= ison;
        this.channel = channel;
        this.volume = volume;
    }
    public void setOn(boolean onOff){
        ison = onOff;
        String onOffStr = (ison)? "On" : "OFF"; //불리언 값으로 받은 랎을 on/off 문자열로 변환
        System.out.println("TV 전원 : "+ onOffStr);
    }
    public void setChannel(int cnl){
        if (cnl >= 1 && cnl <= 999){
            channel = cnl;
            System.out.println("채널은 "+channel+"변경 하였습니다.");
        }else {
            System.out.println("유효하지 않은 채널입니다.");
        }
    }
    public void setVolume(int vol){
        if (vol >= 0 && vol <= 100){
            volume = vol;
            System.out.println("볼륨을 "+volume+"변경 하였습니다.");
        }else {
            System.out.println("유효하지 않은 볼륨값 입니다.");
        }
    }
    public void prnTvInfo(){
        String onOffStr = (ison)? "On" : "Off";
        System.out.println("===== TV정보 =====");
        System.out.println("전원 : "+ison);
        System.out.println("볼륨 : "+volume);
        System.out.println("채널 : "+channel);
    }
}

