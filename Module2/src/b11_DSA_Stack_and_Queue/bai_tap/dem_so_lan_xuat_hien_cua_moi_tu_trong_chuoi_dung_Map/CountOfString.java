package b11_DSA_Stack_and_Queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_chuoi_dung_Map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần kiểm tra: ");
        String demoString = sc.nextLine();
        String[] arrayString = demoString.split("");
        TreeMap<String,Integer> countString = new TreeMap<>();
        for (String i : arrayString){
            if (countString.containsKey(i)){
                int a =  countString.get(i)+1;
                countString.put(i,a);
                continue;
            }
            countString.put(i,1);

        }
        System.out.println(countString);
    }
}
