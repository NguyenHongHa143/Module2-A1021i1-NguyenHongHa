package b19_String_and_Regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckTelephone {
    public static boolean checkTelephone(String regex){
        return Pattern.matches("^(\\+84)[)_(][0][0-9]{9}[)]$",regex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String regex = sc.nextLine();
        System.out.println("Tên lớp "+ (checkTelephone(regex)?"Hợp lệ":"Không hợp lệ"));
    }
}
