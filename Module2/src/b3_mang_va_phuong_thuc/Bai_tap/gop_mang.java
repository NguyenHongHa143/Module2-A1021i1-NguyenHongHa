package b3_mang_va_phuong_thuc.bai_tap;

public class gop_mang {
    static void gop_mang(int a[],int b[],int mang_new[]){
        for (int i=0;i<a.length;i++){
            mang_new[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            mang_new[a.length+i]=b[i];
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10,11};
        int arrGop[] = new int[arr1.length+arr2.length];
        gop_mang(arr1,arr2,arrGop);
        for (int i=0;i<arrGop.length;i++){
            System.out.print(arrGop[i]+" ");
        }

    }
}
