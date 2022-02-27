package b16_IO_Text_File.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    static Scanner sc = new Scanner(System.in);
    public static List<Integer> readFile(String path){
        List<Integer> numbers = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String number = "";
            while ((number=bufferedReader.readLine())!=null){
                numbers.add(Integer.parseInt(number));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Lỗi không đúng định dạng!!");
        }
        return numbers;
    }
    public static void writeFile(String newPath, int max){
        try {
            FileWriter fileWriter = new FileWriter(newPath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Số lớn nhất là: "+max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for (int i=0;i<list.size();i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn file: ");
        String path = sc.nextLine();
        List<Integer> list = readFile(path);
        int maxValue = findMax(list);
        writeFile("result.csv",maxValue);
        System.out.println("số lớn nhất là: "+maxValue);
    }
}
