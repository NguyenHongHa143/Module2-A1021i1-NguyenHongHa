package b3_mang_va_phuong_thuc.bai_tap;

import java.util.Locale;
import java.util.Scanner;

public class dem_so_lan_suat_hien_cua_chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "CodegymDaNCancg";
        String str1 = str.toLowerCase();
        System.out.print("Nhập ký tự bạn cần đếm: ");
        char val = sc.nextLine().charAt(0);
        System.out.println(val);
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (val==str1.charAt(i)){
                count++;
            }
        }
        System.out.println("Số ký tự trong mảng là: "+count+" ký tự");

    }
}
