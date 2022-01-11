package b5_access_modifier_static_method_and_static_property.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle cr1 = new Circle();
        Circle cr2 = new Circle(3.0);
        System.out.println("Circle 1 {"+"radius: "+cr1.getRadius()+" and color: "+cr1.getColor()+"}");
        System.out.println("Circle 2 {"+"radius: "+cr2.getRadius()+" and color: "+cr2.getColor()+"}");
    }
}
