package b6_ke_thua_and_da_hinh.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect);

        rect = new Rectangle(2.3, 5.8);
        System.out.println(rect);

        rect = new Rectangle("orange", true, 5.8, 2.3);
        System.out.println(rect);
    }
}
