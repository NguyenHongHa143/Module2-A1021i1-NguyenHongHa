package b16_IO_Text_File.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileCSV {
    public static List<Country> readFile(String path){
        List<Country> countryList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = "";
            while ((string = bufferedReader.readLine())!=null){
                String[] strings = string.split(",");
                Country country = new Country(Integer.parseInt(strings[0]),strings[1],strings[2]);
                countryList.add(country);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập đường dẫn tới file : ");
        String path = sc.nextLine();
        List<Country> countryList = readFile(path);
        for (Country country:countryList){
            System.out.println(country);
        }


    }
}
