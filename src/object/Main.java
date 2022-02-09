package object;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1, "nghia");
        Person p2 = new Person(1, "nghia");

        System.out.println(p1.equals(p2));
    }
}
