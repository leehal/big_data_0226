package 디폴트메소드;

public class TV extends Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : "+this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        if (mute) System.out.println("TV를 무음 처리 합니다");
        else System.out.println("TV 무음처리를 해제합니다");
    }
}
