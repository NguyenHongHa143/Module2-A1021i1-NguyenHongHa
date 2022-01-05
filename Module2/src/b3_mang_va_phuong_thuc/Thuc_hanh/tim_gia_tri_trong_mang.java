package b3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String student[] = {"Ha","Hieu","Sy","Lam","Tuan"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên bạn muốn tìm kiếm: ");
        String findStudent = sc.nextLine();
        boolean check = false;
        for (int i =0;i<student.length;i++){
            if (student[i].equals(findStudent)){
                check = true;
                System.out.println(student[i]+" nằm ở vị trí thứ "+(i+1)+" trong danh sách");
            }
        }
        if (check==false){
            System.out.println("Không tìm thấy tên "+findStudent+" trong danh sách");
        }
    }
}
