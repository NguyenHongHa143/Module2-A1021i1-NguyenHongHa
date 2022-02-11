package b12_Java_Collection_Framework.thuc_hanh.phan_biet_HashMap_va_HashSet;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Hà",19,"Đà Nẵng");
        students[1] = new Student("Hải",19,"Hà Nội");
        students[2] = new Student("Hằng",19,"Hải Phòng");
        Map<Integer,Student> mapStudent = new HashMap<>();
        Set<Student> setStudent = new HashSet<>();
        for (int i = 0; i < students.length; i++) {
            mapStudent.put(i+1,students[i]);
            setStudent.add(students[i]);
        }
        for (Map.Entry<Integer,Student> student: mapStudent.entrySet()){
            System.out.println(student.toString());
        }
        for (Student student:setStudent){
            System.out.println(student.toString());
        }
    }

}
