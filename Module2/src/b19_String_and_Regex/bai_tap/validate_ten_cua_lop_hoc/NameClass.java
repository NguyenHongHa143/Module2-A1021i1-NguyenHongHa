package b19_String_and_Regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameClass {
    public static boolean checkName(String regex){
        return Pattern.matches("^[CAP]{1}[0-9]{4}[G-M]$",regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên lớp học: ");
        String regex = sc.nextLine();
        System.out.println("Tên lớp "+ (checkName(regex)?"Hợp lệ":"Không hợp lệ"));
    }
}
