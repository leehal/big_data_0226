package 인터페이스;

public class Computer implements ImageSize{
    @Override
    public void resize(int width, int height) {
        System.out.println("컴퓨터의 가로크기는 "+width+", 컴퓨터의 세로크기는 "+height);
    }

    @Override
    public void buttonSize(int width, int height) {
        System.out.println("컴퓨터 버튼의 가로크기는 "+width+", 컴퓨터 버튼의 세로크기는 "+height);
    }
}
