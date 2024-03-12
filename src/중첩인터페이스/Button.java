package 중첩인터페이스;

public class Button {
    OnClickListener listener; //OnClickListener 인터페이스에 대한 참조변수
    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }
    void touch(){
        listener.onClick();; //구현 객체의 onClick() 메서드를 의미
    }
    interface OnClickListener{
        void onClick(); //추상메소드
    }
}
