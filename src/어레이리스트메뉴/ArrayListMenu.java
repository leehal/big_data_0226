package 어레이리스트메뉴;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMenu {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("아메리카노",2800,"커피","커피",true));

        MenuInfo menuInfo = new MenuInfo("라떼",3500,"커피","우유",true);
        menuList.add(menuInfo);

        menuList.add(new MenuInfo("BlackTea",4500,"Tea","홍차",false));
        for (MenuInfo info : menuList) {
            System.out.println(info.getJsonFormat());
        }
        /* JSON은 JavaScript Object Notation 의 약자입니다.
        직역하면 '자바 스크립트 객체 표기법'으로
        데이터를 쉽게 ' 교 환 ' 하고 ' 저 장 ' 하기 위한 텍스트 기반의 데이터 교환 표준 입니다.
        JSON은 텍스트 기반이기 때문에 다양한 프로그래밍 언어에서 데이터를 읽고 사용할 수 있습니다. */
    }
}
class MenuInfo{
    String name;
    int price;
    String category;
    String desc;
    boolean isTax;

    public MenuInfo(String name, int price, String category, String desc, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
        this.isTax = isTax;
    }
    public String getJsonFormat() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}
