package b14_Sort.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertSort {
    public static void insertSort(int[] array){
        int n= array.length;
        for (int i=1;i<n;i++){
            int j = i-1;
            int key = array[i];
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }

    public static void displaySort(int[] array){
        for (int i:array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {-20,20,8,-2};
        insertSort(array);
        displaySort(array);
    }
}
