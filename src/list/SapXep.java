package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXep {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("b");

        for (String s : list){
            System.out.println(s);
        }

        System.out.println("sau khi sap xep tang dan");
        Collections.sort(list);
        
        for (String s : list){
            System.out.println(s);
        }
    }
}
