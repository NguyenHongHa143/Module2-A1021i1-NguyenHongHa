package b2_vong_lap_trong_JaVa.bai_tap.b1;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the rectangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice;
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Mời bạn lựa chọn loại tam giác");
                System.out.println("1. Draw the square top-left");
                System.out.println("2. Draw the square top-right");
                System.out.println("3. Draw the square bottom-left");
                System.out.println("4. Draw the square bottom-right");
                System.out.print("Enter your choice: ");
                int num = sc.nextInt();
                System.out.print("mời bạn nhập chiều cao của tam giác h = ");
                int h = sc.nextInt();
                switch (num){
                    case 1:
                        for (int i=0;i<h;i++){
                            for(int j=h;j>0;j--){
                                if(j>i){
                                    System.out.print("*");
                                }
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        for (int i = 0;i<h;i++){
                            for (int j = 0;j<h;j++){
                                if (j>=i){
                                    System.out.print("*");
                                }
                                else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        for (int i = 0;i<h;i++){
                            for (int j =0;j<=i;j++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        for (int i=0;i<h;i++){
                            for (int j=h-1;j>=0;j--){
                                if(j>i){
                                    System.out.print(" ");
                                }
                                else {
                                    System.out.print("*");
                                }
                            }
                            System.out.println();
                        }
                        break;
                }
            case 2:
                System.out.print("Mời bạn nhập chiều dài của hình chữ nhật a = ");
                int a = sc.nextInt();
                System.out.print("Mời bạn nhập chiều rộng ủa hình chữ nhật b = ");
                int b = sc.nextInt();
                for (int i=0;i<a;i++){
                    for (int j=0;j<b;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Mời bạn nhập chiều cao của tam giác cân hc = ");
                int hc = sc.nextInt();
                for(int i=0;i<hc;i++){
                    for (int j =hc;j>0;j--){
                        if (j<=i){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    for (int z=0;z<=i;z++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                break;

        }
    }

}
