package b6_ke_thua_and_da_hinh.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class TestSquare {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq);

        Square sq1 = new Square(3.7);
        System.out.println(sq1);

        Square sq2 = new Square("blue",true,2.0);
        System.out.println(sq2);
    }
}
