package b1_introduction.bai_tap;

import java.util.Scanner;

public class tinh_gia_tri_tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ty_giaVND = 23000;
        System.out.print("Nhập tỷ giá USD cần đổi: ");
        int tienUSD = sc.nextInt();
        int tienVND = tienUSD*ty_giaVND;
        System.out.println("Tiền VND được quy đổi ra "+tienVND+" đồng");
    }
}
