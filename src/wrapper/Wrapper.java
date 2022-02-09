package wrapper;

public class Wrapper {
//    wrapper class chuyển đổi trạng thái dữ liệu
    public static void main(String[] args) {
        int x = 10;
        Integer y = new Integer(10);

        int z = x + y;

        System.out.println(z);

        int z1 = Integer.valueOf("45");
        int z2 = Integer.parseInt("12");

        System.out.println(z2);

        Integer k1 = new Integer(10);
        Integer k2 = new Integer(10);

        System.out.println(k1 == k2);// false: 2 đối tượng tồn tại độc lập trong bộ nhớ int. so sánh 2 đối tượng 2 vị trí khác nhau , so sánh địa chỉ bộ nhớ
        System.out.println(k1.equals(k2));// equals là so sánh 2 giá trị

    }
}
