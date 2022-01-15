package b7_abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

import b7_abstract_class_and_interface.bai_tap.hinh_hoc.Circle;
import b7_abstract_class_and_interface.bai_tap.hinh_hoc.Rectangle;
import b7_abstract_class_and_interface.bai_tap.hinh_hoc.Shape;
import b7_abstract_class_and_interface.bai_tap.hinh_hoc.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0]= new Square("Blue",true,2.5);
        shape[1] = new Circle(3.0);
        shape[2] = new Rectangle(4.0,2.0,"Red",false);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
        }
        ((Square)shape[0]).resize(50);
        ((Circle)shape[1]).resize(50);
        ((Rectangle)shape[2]).resize(50);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
        }
     }

}
