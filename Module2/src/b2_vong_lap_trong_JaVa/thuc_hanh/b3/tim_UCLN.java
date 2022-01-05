package b2_vong_lap_trong_JaVa.thuc_hanh.b3;

import java.util.Scanner;

public class tim_UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a= ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b= ");
        int b = sc.nextInt();
        a= Math.abs(a);
        b= Math.abs(b);
        if(a==0&&b==0){
            System.out.println("Hai số trên không có UCLN");
        }
        else if (a==0||b==0){
            System.out.print("UCLN của hai số trên là "+Math.abs(a-b));
        }
        else if (a==b){
            System.out.println("UCLN của hai số trên là "+a);

        }
        else {
            do {
                if(a>b){
                    a=a-b;
                }
                else {
                    b=b-a;
                }
            } while (a!=b);
            System.out.println("UCLN của hai số trên là "+a);
        }
    }
}
