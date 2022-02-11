package b12_Java_Collection_Framework.thuc_hanh.sap_xep_voi_Comparable_va_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNameStudent().compareTo(o2.getNameStudent());
    }

    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
//        Collections.sort(lists);
//        for(Student st : lists){
//            System.out.println(st.toString());
//        }
        AgeComparator ageComparator = new AgeComparator();

        System.out.println();
        for(Student st : lists){
            System.out.println(st.toString());
        }
        System.out.println();
        Collections.sort(lists,ageComparator);
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
