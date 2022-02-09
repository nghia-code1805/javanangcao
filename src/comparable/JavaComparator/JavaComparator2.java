package comparable.JavaComparator;

import java.util.ArrayList;
import java.util.List;

public class JavaComparator2  {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(3, "A", 20));
        persons.add(new Person(1, "E", 18));
        persons.add(new Person(2, "G", 25));
        persons.add(new Person(4, "B", 30));
        persons.add(new Person(5, "S", 31));

        System.out.println("list of person before sorting Java < 1.8");
        persons.forEach((p) ->{
            System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
        });

        persons.sort((p1, p2)-> {
            if (p1.getName().compareTo(p2.getName()) > 0) {
                return 1;
            } else if (p1.getName().compareTo(p2.getName()) < 0){
                return -1;
            } else {
                return p1.getAge() - p2.getAge();
            }
        });
        System.out.println("list of person after sorting");
        persons.forEach((p) ->{
            System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
        });
    }
}
