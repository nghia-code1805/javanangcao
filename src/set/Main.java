package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();

        setString.add("B");
        setString.add("A");
        setString.add("E");
        setString.add("C");
        setString.add("B");

        for (String s: setString){
            System.out.println(s);
        }

        Iterator<String> itr = setString.iterator();
        while (itr.hasNext()){
            String s = itr.next();
            System.out.println(s);
            if (s.equals("A")){
                itr.remove();
            }
        }
        setString.remove("A");
        for (String s : setString){
            System.out.println(s);
        }
    }
}
