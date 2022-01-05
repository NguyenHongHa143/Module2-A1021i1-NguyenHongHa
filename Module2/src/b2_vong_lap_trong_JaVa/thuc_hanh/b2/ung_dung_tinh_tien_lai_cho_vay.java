package b2_vong_lap_trong_JaVa.thuc_hanh.b2;

import java.util.Scanner;

public class ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền bạn cho vay(tr): ");
        float tienVay = sc.nextFloat();
        System.out.print("Nhập lãi suất hằng năm (%): ");
        float laiSuat = sc.nextFloat();
        System.out.print("Nhập số tháng cho vay: ");
        float thang = sc.nextFloat();
        float tienLai = (tienVay*(laiSuat/100)*thang)/12;
        float tongTienTra = tienLai+tienVay;
        System.out.println("Số tiền phải trả sau khi hết hạn là: "+tongTienTra+" tr");
    }
}
