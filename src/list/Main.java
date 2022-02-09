package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);

        List<Person> list = new ArrayList<Person>();

        list.add(p1);
        list.add(p2);
        list.add(p3);

        Person person = list.get(2); // get() vị trí phần tử trong list

        System.out.println(person.getId());

        for (Person p : list){
            System.out.println(p.getId());
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getId());
        }
    }
}
