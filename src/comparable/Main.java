package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "a"));
        list.add(new Person(5, "d"));
        list.add(new Person(3, "c"));
        list.add(new Person(2, "b"));
        list.add(new Person(7, "e"));

        System.out.println("trc khi sắp xếp ");
        for (Person p : list){
            System.out.println(p.getId() + p.getName());
        }
        System.out.println("sau khi sắp xếp ");
        Collections.sort(list, new MyCompare());
        for (Person p : list){
            System.out.println(p.getId() + p.getName());
        }
    }
}

class MyCompare implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getId() > o2.getId()){
            return 1;
        }else if (o1.getId() < o2.getId()){
            return -1;
        }else {
            return 0;
        }
    }
}
