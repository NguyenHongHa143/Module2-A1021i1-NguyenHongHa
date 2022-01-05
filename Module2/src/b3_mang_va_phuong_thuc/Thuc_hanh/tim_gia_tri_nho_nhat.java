package b3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri_nho_nhat {
    public static int findMin(int a[]){
        int min=a[0];
        for (int i:a){
            if (min>i)
                min=i;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Mời bạn nhập số lượng phần tử của mảng (nhỏ hơn 20): ");
        do {
            size = sc.nextInt();
            if(size>20)
                System.out.print("Quá lớn!!! Mời bạn nhập lại: ");
        }while (size>20);
        int arr[] = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Mời bạn nhập giá trị thứ "+(i+1)+" của mảng: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập là: ");
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: "+findMin(arr));
    }
}
