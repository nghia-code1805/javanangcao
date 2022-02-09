package object;

import java.util.Objects;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person){
            Person p2 = ((Person) o);
            if (p2.getId() == this.id){
                return true;
            }else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
