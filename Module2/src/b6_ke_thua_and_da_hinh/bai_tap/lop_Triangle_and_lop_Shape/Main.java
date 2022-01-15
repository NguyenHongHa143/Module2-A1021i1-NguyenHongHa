package b6_ke_thua_and_da_hinh.bai_tap.lop_Triangle_and_lop_Shape;

public class Main {
    public static void main(String[] args) {
        Shape triangle1 = new Shape();
        triangle1 = new Triangle("Blue",false,3.0,4.0,5.0);
        System.out.println(triangle1.toString());
    }
}
