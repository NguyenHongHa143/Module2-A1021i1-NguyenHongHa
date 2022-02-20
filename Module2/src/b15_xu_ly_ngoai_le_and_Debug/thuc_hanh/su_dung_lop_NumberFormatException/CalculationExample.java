package b15_xu_ly_ngoai_le_and_Debug.thuc_hanh.su_dung_lop_NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void calculate(int x, int y){
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }
        catch (Exception e){
            System.out.println("xảy ra lỗi ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số nguyên y: ");
        int y = Integer.parseInt(sc.nextLine());
        calculate(x,y);
    }
}
