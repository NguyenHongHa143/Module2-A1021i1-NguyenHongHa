package b7_abstract_class_and_interface.thuc_hanh.trien_khai_interface_Comparable_cho_cac_lop_hinh_hoc;


import b6_ke_thua_and_da_hinh.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, Boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius()>o.getRadius()){
            System.out.println(getRadius());
            return 1;
        }
        else if (getRadius()<o.getRadius()){
            System.out.println(getRadius());
            return -1;
        }
        else {
            System.out.println(getRadius());
            return 1;
        }
    }
}
