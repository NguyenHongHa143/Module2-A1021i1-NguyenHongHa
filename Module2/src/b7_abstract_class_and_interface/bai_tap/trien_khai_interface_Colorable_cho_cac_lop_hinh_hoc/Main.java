package b7_abstract_class_and_interface.bai_tap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

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
            System.out.print(" the area is: ");
            if (shape[i] instanceof Circle){
                System.out.println(((Circle)shape[i]).getArea());;
            }
            else if (shape[i] instanceof Rectangle){
                System.out.println(((Rectangle)shape[i]).getArea());
            }
            else if (shape[i] instanceof Colorable){
                ((Square) shape[i]).howToColor();
            }
        }
    }
}
