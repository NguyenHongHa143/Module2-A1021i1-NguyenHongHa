package b3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void delArray(int[] a, int index){
        for (int i =index;i<a.length;i++){
            if (i==(a.length-1)){
                a[i]=0;
            }
            else
                a[i]=a[i+1];
        }
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
        System.out.print("Mời bạn nhập phần tử cần xóa: ");
        int valueDel = sc.nextInt();
        boolean check =false;
        int a = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==valueDel){
                a = i;
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Mảng của bạn sau khi xóa là: ");
            delArray(arr,a);
            for (int i:arr){
                System.out.print(i+" ");
            }

        }
        else
            System.out.println("Phần tử bạn tìm không có trong mảng!!");
    }
}
