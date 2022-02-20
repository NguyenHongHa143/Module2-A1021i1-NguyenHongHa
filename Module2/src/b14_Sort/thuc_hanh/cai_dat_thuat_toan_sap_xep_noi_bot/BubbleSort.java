package b14_Sort.thuc_hanh.cai_dat_thuat_toan_sap_xep_noi_bot;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean check = true;
        for (int i=0;i<n&&check;i++){
            check = false;
            for (int j=0;j< array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    check = true;
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void displaySort(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(arr);
        displaySort(arr);
    }
}
