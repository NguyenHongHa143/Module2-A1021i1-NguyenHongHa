package b3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class ung_dung_dem_so_luong_SV_thi_do {
    public static int dem_SV_dau(float a[]){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]>=5.0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng SV (không quá 30): ");
        int size;
        do {
            size = sc.nextInt();
            if (size>30)
                System.out.print("Quá lớn! mời nhập lại: ");
        } while (size>30);
        float arr[] = new float[size];
        for (int i=0;i<size;i++){
            System.out.print("Nhập điểm của Sv thứ "+(i+1)+" ");
            arr[i]=sc.nextFloat();
        }
        System.out.println("Số Sv thi đỗ là: "+dem_SV_dau(arr)+" bạn!");

    }
}
