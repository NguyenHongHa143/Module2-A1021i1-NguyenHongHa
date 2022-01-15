package b7_abstract_class_and_interface.bai_tap.hinh_hoc;

import b7_abstract_class_and_interface.bai_tap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Colorable;
import b7_abstract_class_and_interface.bai_tap.trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Resizeable;

public class Square extends Shape implements Resizeable, Colorable {
    private double Side = 1.0;
    public Square() {
    }
    public Square(double side){
        this.Side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        Side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()+(getSide()*percent/100));
    }

    public double getSide(){
        return Side;
    }
    public void setSide(double side){
        this.Side = side;
    }
    public double getArea(){
        return Math.pow(Side,2);
    }
    public double getPerimeter(){
        return Side*4;
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", the area is "
                + getArea()+" and the Perimeter is "+getPerimeter();
    }
}
