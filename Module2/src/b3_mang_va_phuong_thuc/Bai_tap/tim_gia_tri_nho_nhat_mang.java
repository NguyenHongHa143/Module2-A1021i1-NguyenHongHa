package b3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class tim_gia_tri_nho_nhat_mang {
    static double findMin(double a[]){
        double min = a[0];
        for (int i=0;i< a.length;i++){
            if (a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = sc.nextInt();
        double arr[] = new  double[size];
        for (int i=0;i< arr.length;i++){
            arr[i] = (double)(Math.random()*100);
        }
        System.out.println("Ta có mảng số thực sau: ");
        for (double a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        double min = findMin(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+min);
    }
}
