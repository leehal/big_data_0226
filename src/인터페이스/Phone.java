package 인터페이스;

public class Phone implements ImageSize{
    @Override
    public void resize(int width, int height) {
        System.out.println("핸드폰의 가로크기는 "+width+", 핸드폰의 세로크기는 "+height);
    }

    @Override
    public void buttonSize(int width, int height) {
        System.out.println("핸드폰 버튼의 가로크기는 "+width+", 핸드폰 버튼의 세로크기는 "+height);
    }
}
