package b1_introduction.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class ung_dung_doc_so_thanh_chu {

    String readDAndT (int num){
        String read = "";
        switch (num){
            case 0:
                read="zero";break;
            case 1:
                read="one";break;
            case 2:
                read = "two";break;
            case 3:
                read = "three";break;
            case 4:
                read = "four";break;
            case 5:
                read = "five";break;
            case 6:
                read = "six";break;
            case 7:
                read = "seven";break;
            case 8:
                read = "eight";break;
            case 9:
                read = "nine";
        }
        return read;
    }
    String readChuc(int chuc,int donvi){
        String strChuc="";
        if (chuc==1){
            switch (donvi){
                case 0:
                    strChuc = "ten";break;
                case 1:
                    strChuc = "eleven";break;
                case 2:
                    strChuc = "twelve";break;
                case 3:
                    strChuc = "thir";break;
                case 4:
                    strChuc = "four";break;
                case 5:
                    strChuc = "fif";break;
                case 6:
                    strChuc = "six";break;
                case 7:
                    strChuc = "seven";break;
                case 8:
                    strChuc = "eigh";break;
                case 9:
                    strChuc = "nine";break;
            }
        }
        else {
            switch (chuc){
                case 2:
                    strChuc = "twen";break;
                case 3:
                    strChuc = "thir";break;
                case 4:
                    strChuc = "four";break;
                case 5:
                    strChuc = "fif";break;
                case 6:
                    strChuc = "six";break;
                case 7:
                    strChuc = "seven";break;
                case 8:
                    strChuc = "eigh";break;
                case 9:
                    strChuc = "nine";break;
            }
        }
        return strChuc;
    }
    public static void main(String[] args) {
        ung_dung_doc_so_thanh_chu a = new ung_dung_doc_so_thanh_chu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số có tối đa 3 chữ số bạn muốn: ");
        int number = scanner.nextInt();
        int donvi,chuc,tram;
        if (number<0||number>1000)
            System.out.println("out of ability");
        else{
            if (number<10){
                System.out.print(a.readDAndT(number));
            }
            else if (number<20){
                donvi = number%10;
                chuc = number/10;
                if (donvi<3){
                    System.out.print(a.readChuc(chuc,donvi));
                }
                else {
                    System.out.print(a.readChuc(chuc,donvi)+"teen");
                }
            }
            else if (number<100){
                donvi = number%10;
                chuc = number/10;
                if (donvi==0){
                    System.out.print(a.readChuc(chuc,donvi)+"ty");
                }
                else {
                    System.out.print(a.readChuc(chuc,donvi)+"ty "+a.readDAndT(donvi));
                }
            }
            else {
                donvi = number%10;
                number = number/10;
                chuc = number%10;
                tram = number/10;
                if (donvi==0&&chuc==0){
                    System.out.print(a.readDAndT(tram)+" hundred ");
                }
                else if (chuc==1){
                    if (donvi<3){
                        System.out.print(a.readDAndT(tram)+" hundred "+a.readChuc(chuc,donvi));
                    }
                    else {
                        System.out.print(a.readDAndT(tram)+" hundred "+a.readChuc(chuc,donvi)+"teen "+a.readDAndT(donvi));
                    }

                }
                else {
                    if (donvi==0){
                        System.out.print(a.readDAndT(tram)+" hundred "+a.readChuc(chuc,donvi)+"ty");
                    }
                    else {
                        System.out.print(a.readDAndT(tram)+" hundred "+a.readChuc(chuc,donvi)+"ty and "+a.readDAndT(donvi));
                    }
                }
            }
        }
    }
}



