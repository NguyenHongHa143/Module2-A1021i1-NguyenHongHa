package b3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Nhập độ dài của mảng (không quá 20): ");
        do {
            size = sc.nextInt();
            if (size>20)
                System.out.println("Mời bạn nhập lại ");
        }while (size>20);
        int arr[] = new int[size];
        int i=0;
        while (i<size){
            System.out.print("Nhập giá trị của phần tử thứ "+(i+1)+" của mảng: ");
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("Các phần tử của mảng là: ");
        for (int j=0;j<size;j++){
            System.out.print( arr[j]+" ");
        }
        int max = arr[0];
        int index = 0;
        for (int j = 0;j<size;j++){
            if (max<arr[j]){
                max = arr[j];
                index=j+1;
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: "+max+" nằm ở vị trí: "+index);
    }
}
