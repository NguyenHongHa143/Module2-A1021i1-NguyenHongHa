package b1_introduction_in_java.thuc_hanh.b4;

import java.util.Scanner;

public class pt_bac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc 1 có dạng ax+b=0");
        System.out.print("Nhập hệ số a = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập hệ số b = ");
        int b = Integer.parseInt(scanner.nextLine());
        if (a==0&&b==0)
            System.out.println("Phương trình vô số nghiệm!!");
        else if (a==0)
            System.out.println("Phương trình vô nghiệm!!");
        else
            System.out.println("Phương trình có nghiệm x= "+(-b/a));

    }
}
