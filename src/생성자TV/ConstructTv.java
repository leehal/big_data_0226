package 생성자TV;

public class ConstructTv {
    public static void main(String[] args) {
    TV lgTV =new TV();
    lgTV.setOn(true);
    lgTV.setVolume(200);
    lgTV.setChannel(980);
    lgTV.prnTvInfo();

    TV samTV =new TV(true,250, 99);
    samTV.prnTvInfo();

    }
}
