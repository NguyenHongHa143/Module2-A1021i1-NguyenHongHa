package b7_abstract_class_and_interface.thuc_hanh.trien_khai_interface_Comparator_de_so_sanh_cac_lop_hinh_hoc;

import b6_ke_thua_and_da_hinh.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle cr1, Circle cr2) {
        if (cr1.getRadius()>cr2.getRadius()){
            return 1;
        }
        else if (cr1.getRadius()<cr2.getRadius()){
            return -1;
        }
        else return 1;
    }
}
