package b13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindStringLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String randomStr = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for (int i=0;i<randomStr.length();i++){
            List<Character> list1 = new ArrayList<>();
            list1.add(randomStr.charAt(i));
            for (int j=i+1;j<randomStr.length();j++){
                if (randomStr.charAt(j)>list1.get(list1.size()-1)){
                    list1.add(randomStr.charAt(j));
                }
            }
            if (list1.size()>list.size()){
                list.clear();
                list.addAll(list1);
            }
            list1.clear();

        }
        for (Character i:list){
            System.out.print(i);
        }
    }
}
