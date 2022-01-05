package b2_vong_lap_trong_JaVa.thuc_hanh.b1;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số cần kiểm tra: ");
        int number = sc.nextInt();
        boolean checkNT=true;
        for(int i=2;i<number;i++){
            if (number==2){
                break;
            }
            else if (number%i==0){
                checkNT=false;
            }
        }
        if (number<=1){
            checkNT=false;
        }
        if (checkNT){
            System.out.println(number+" là số nguyên tố!");
        }
        else {
            System.out.println(number+" không phải là số nguyên tố");
        }
    }
}
