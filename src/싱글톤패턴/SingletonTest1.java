package 싱글톤패턴;

public class SingletonTest1 {
    Singleton singleton = Singleton.getSingleton(); //객체를 생성하지 않고 만들어져 있는 싱글톤을 참조
    void setInfo(String name, int id){
        singleton.name= name;
        singleton.id = id;
    }
    void viewInfo(){
        System.out.println("이름 : "+ singleton.name);
        System.out.println("아이디 : "+ singleton.id);
    }
}
