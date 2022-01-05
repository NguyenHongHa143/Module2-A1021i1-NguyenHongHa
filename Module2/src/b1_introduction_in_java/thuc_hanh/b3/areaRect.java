package b1_introduction_in_java.thuc_hanh.b3;

import java.util.Scanner;

public class areaRect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật a = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chiều rộng hình chữ nhật b = ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Diện tích hình chữ nhật ab là:  "+a*b);
    }
}
