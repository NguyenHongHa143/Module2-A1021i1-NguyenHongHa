package b17_IO_binaryFile_and_Serializion.bai_tap.quan_ly_san_pham_luu_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    static Scanner sc = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    private static void writerObject(String path, List<Product> products){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path,true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static List<Product> readerObject(String path){
        List<Product> product = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            product = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
    public void add(String path){
        System.out.print("Nhập mã sản phẩm: ");
        int code = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập nơi sản xuất: ");
        String manufacturer = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());

        Product product = new Product(code,name,manufacturer,price);
        products.add(product);
        writerObject(path,products);
        System.out.println("Successfully!!");
    }
    public void display(String path){
        List<Product> products = readerObject("demo1.csv");
        for (Product product : products){
            System.out.println(1);
            System.out.println(product);
        }
    }
}
