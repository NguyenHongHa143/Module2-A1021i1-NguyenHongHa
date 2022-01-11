package b5_access_modifier_static_method_and_static_property.thuc_hanh.static_method;

public class testStaticMethod {
    public static void main(String[] args) {
        student st1 = new student(001,"Hà");
        student st2 = new student(002,"Hùng");
        student.change();
        st1.display();
        st2.display();
    }

}
