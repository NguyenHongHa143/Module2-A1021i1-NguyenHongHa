package b14_Sort.thuc_hanh.cai_dat_thuat_toan_sap_xep_chon;

public class SelectionSort {
    public static void selectionSort(double[] array){
        int n= array.length-1;
        for (int i=0;i<n;i++){
            int min_index = i;
            for (int j =i+1;j<n+1;j++){
                if (array[j]<array[min_index]){
                    min_index = j;
                }
            }
            if (min_index!=i){
                double temp = array[i];
                array[i]=array[min_index];
                array[min_index]=temp;
            }
        }
    }

    public static void displaySort(double[] array){
        for (double i:array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        displaySort(list);
    }
}
