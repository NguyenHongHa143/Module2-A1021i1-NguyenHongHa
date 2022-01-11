package b5_access_modifier_static_method_and_static_property.bai_tap.xay_dung_lop_chi_ghi;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        st2.setClasses("A02");
        st2.setName("Manchester");
        System.out.println("Student 1 { name: "+st1.getName()+" ,class: "+st1.getClasses()+" }");
        System.out.println("Student 1 { name: "+st2.getName()+" ,class: "+st2.getClasses()+" }");
    }
}
