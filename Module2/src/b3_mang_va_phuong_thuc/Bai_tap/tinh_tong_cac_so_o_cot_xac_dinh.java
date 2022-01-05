package b3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class tinh_tong_cac_so_o_cot_xac_dinh {
    static int sumCol(int a[][],int col){
        int sum=0;
        for (int i=0;i<a.length;i++){
                    sum+= a[i][col];
            }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][4];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*21);
            }
        }
//        Hiện mảng
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.print("Nhập cột bạn cần tính tổng: ");
        int colum = sc.nextInt();
        System.out.println("Tổng của cột "+(colum)+" là sum =  "+sumCol(arr,(colum-1)));
    }
}
