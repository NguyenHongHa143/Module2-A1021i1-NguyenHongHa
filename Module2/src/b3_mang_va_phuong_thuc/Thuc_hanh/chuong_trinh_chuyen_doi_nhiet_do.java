package b3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class chuong_trinh_chuyen_doi_nhiet_do {
    static double Fahrenheit_to_Celsius(double a){
        return (5.0/9)*(a-32);
    }
    static double Celsius_to_Fahrenheit(double b){
        return (9.0 / 5) * b + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH CHUYỂN NHIỆT ĐỘ");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.print("Moi bạn chọn: ");
        int choise ;
        do {
            choise = sc.nextInt();
            switch (choise){
                case 1:
                    System.out.print("Mời bạn nhập độ F: ");
                    double f = sc.nextDouble();
                    double resultF = Fahrenheit_to_Celsius(f);
                    System.out.println(f+" độ F = "+resultF+" °C");
                    break;
                case 2:
                    System.out.print("Mời bạn nhập độ C: ");
                    double c = sc.nextDouble();
                    double resultC = Celsius_to_Fahrenheit(c);
                    System.out.println(c+" độ C = "+resultC+" °F");
                    break;
                case 0:
                    System.out.println("See you again!!");
            }
            if (choise==1||choise==2||choise==0)
                break;
            else
                System.out.print("Số bạn chọn không đúng, mời bạn nhập lại: ");
        }while (true);
    }
}
