package Comparator예제;

import java.util.Iterator;
import java.util.TreeSet;

// 객
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> list = new TreeSet<>(new DescendingComparator());
        list.add(new Fruit("포도",3000));
        list.add(new Fruit("수박",10000));
        list.add(new Fruit("딸기",6000));

        Iterator<Fruit> iterator = list.iterator();
        while (iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name+" : "+fruit.price);
        }

        for (Fruit fruit : list) {
            System.out.println(fruit.name+" : "+fruit.price);
        }
    }
}
