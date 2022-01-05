package b1_introduction;

import java.util.Scanner;

public class tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập cân nặng của bạn (kg): ");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập chiều cao của bạn (mét): ");
        float height = Float.parseFloat(scanner.nextLine());
        float bmi;
        bmi = weight/(height*height);
        System.out.println((bmi));
        if (bmi>=30.0)
            System.out.println("Obese");
        else if (bmi>=25.0)
            System.out.println("Overweight");
        else if (bmi>=18.5)
            System.out.println("Normal");
        else
            System.out.println("Underweight");
    }
}
