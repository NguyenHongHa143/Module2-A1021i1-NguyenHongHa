package b3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class dao_nguoc_cac_phan_tu_cua_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số phần tử của mảng (không quá 20): ");
            n = sc.nextInt();
            if (n>20){
                System.out.println("Phần tử của mảng quá lớn!!");
            }
        } while (n>20);
        int arr[];
        arr = new int[n];
        int i=0;
        while (i<n){
            System.out.print("Mời nhập phần tử thứ "+(i+1)+" của mảng ");
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("Các phần tử của mảng ban đầu là: ");
        for (int j =0;j<n;j++){
            System.out.print(+arr[j]+" ");
        }
        System.out.println();
        System.out.println("Các phần tử của mảng sau khi đảo ngược là: ");
        for (int j=0;j<n;j++){
            int temp = arr[j];
            arr[j]=arr[n-1-j];
            arr[n-1-j]=temp;
            if (j>=n/2)
                break;
        }
        for (int j =0;j<n;j++){
            System.out.print(+arr[j]+" ");
        }


    }
}
