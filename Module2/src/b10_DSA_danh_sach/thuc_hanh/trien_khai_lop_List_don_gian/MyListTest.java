package b10_DSA_danh_sach.thuc_hanh.trien_khai_lop_List_don_gian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println(myList.get(4));

        myList.add(-1);
        System.out.println(myList.get(-1));
    }
}
