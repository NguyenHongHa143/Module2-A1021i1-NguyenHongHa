package b1_introduction;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng bạn muốn kiểm tra: ");
        int mounth = Integer.parseInt(scanner.nextLine());
        while (mounth>12) {
            System.out.print("Mời bạn nhập lại tháng bạn muốn kiểm tra: ");
            mounth = Integer.parseInt(scanner.nextLine());
        }
        switch (mounth){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Tháng "+mounth+" có 31 ngày");break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");break;
            default:
                System.out.println("Tháng "+mounth+" có 30 ngày");
        }
    }
}
