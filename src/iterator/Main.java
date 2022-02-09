package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("E");
        list.add("D");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String s = itr.next();
            if (s.equals("A")){
                itr.remove();
            }
        }
        for (String s : list){
            System.out.println(s);
        }
    }
}
