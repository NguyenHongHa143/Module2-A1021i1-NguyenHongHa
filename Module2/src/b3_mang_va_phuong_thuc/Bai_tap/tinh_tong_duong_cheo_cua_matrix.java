package b3_mang_va_phuong_thuc.bai_tap;

public class tinh_tong_duong_cheo_cua_matrix {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*21);
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if (i+j==(arr.length-1)){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Tổng 2 đường chéo là: "+sum);
    }
}
