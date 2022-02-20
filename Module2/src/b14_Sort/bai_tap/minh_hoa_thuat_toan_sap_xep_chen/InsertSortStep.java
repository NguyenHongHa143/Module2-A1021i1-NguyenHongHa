package b14_Sort.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

public class InsertSortStep {
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
}
