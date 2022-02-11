package b10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_LinkedList;

public class MyLinkedListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
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
    }
    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student st1 = new Student(1,"Ha");
        Student st2 = new Student(2,"Hai");
        Student st3 = new Student(3,"Hau");
        Student st4 = new Student(4,"Hang");
        Student st5 = new Student(5,"Hoang");

        myLinkedList.addFirst(st1);
        myLinkedList.addLast(st5);
        myLinkedList.addFirst(st2);
        myLinkedList.add(2,st4);
        System.out.println(myLinkedList.indexOf(st3));
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
