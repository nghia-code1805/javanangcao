package list;

import java.util.List;
import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {
        Person person = new Person(1);
        List<Person> list = new Vector<>();

        list.add(person);
        list.remove(0);
        for (Person p1 : list) {

        }

//        khác nhau giữa LinkedList & ArrayList & Vector là mọi hàm trong Vector đều đồng bộ
    }
}
