package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {
        Person person = new Person(1);

        List<Person> list = new LinkedList<>();

        list.add(person);

        for (Person p : list){
            System.out.println(p.getId());
        }
        list.remove(0);

        // giống nhau : đều được implements từ List Interface và duy trì thứ tự của phần tử được thêm vào
        // khác nhau : nó implements những hàm của Interface
//        về LinkedList phù hợn cho viêc thêm sửa xoá dữ liệu
        // về ArrayList lưu dữ liệu và truy xuất dữ liệu

    }
}
