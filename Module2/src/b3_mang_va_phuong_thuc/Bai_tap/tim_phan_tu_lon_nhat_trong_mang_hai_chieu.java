package b3_mang_va_phuong_thuc.bai_tap;

public class tim_phan_tu_lon_nhat_trong_mang_hai_chieu {
    public static void main(String[] args) {
        double matrix[][] = new double[5][5];
        int row=0;
        int col=0;
        double max=matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (double)(Math.random() * 100);
            }
        }
        System.out.println("Ta có matrix random sau: ");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]>max){
                    row = i+1;
                    col = j+1;
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong matrix là: "+max);
        System.out.println( max+" nằm ở dòng thứ "+(row)+" và cột thứ "+ col);
    }
}
