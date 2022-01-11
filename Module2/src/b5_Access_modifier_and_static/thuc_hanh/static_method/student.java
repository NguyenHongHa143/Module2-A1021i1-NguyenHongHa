package b5_access_modifier_static_method_and_static_property.thuc_hanh.static_method;

public class student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "Codegym";
    }
    void display(){
        System.out.println(this.rollno + " "+this.name+" "+college);
    }
}
