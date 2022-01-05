package b1_introduction;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm bạn cần kiểm tra: ");
        int year = Integer.parseInt(scanner.nextLine());
        boolean check =false;
        if (year%4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    check = true;
            }
            else
                check=true;
        }
        if (check)
            System.out.printf("%d Năm là năm nhuận", year);
        else
            System.out.println("Năm "+year+" không phải là năm nhuận");

    }
}
