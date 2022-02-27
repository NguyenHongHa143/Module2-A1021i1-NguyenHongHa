package b16_IO_Text_File.thuc_hanh.tinh_tong_cac_so_trong_file_CSV;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    static Scanner sc = new Scanner(System.in);
    public static void readFileCSV(String filePath){
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String number = "";
            int sum=0;
            while ((number=bufferedReader.readLine())!=null){
                System.out.println(number);
                sum+=Integer.parseInt(number);

            }
            System.out.println("tổng trong file là: "+sum);
        } catch (FileNotFoundException e) {
            System.out.println("file không tồn tại!!!");}
           catch (Exception e) {
               System.out.println("File có nội dung lỗi!!! Không thể tính tổng!");;
        }
    }

    public static void writerFileCSV(String filePath){
        try {
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.print("Bạn muốn nhập bao nhiêu số nguyên? ");
            int n = Integer.parseInt(sc.nextLine());
            int i=0;
            while (i<n){
                System.out.print("Mời bạn nhập số: ");
                String string = sc.nextLine();
                bufferedWriter.write(string);
                bufferedWriter.newLine();
                i++;
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn file: ");
        String path = sc.nextLine();
        writerFileCSV(path);
        readFileCSV(path);
    }
}
