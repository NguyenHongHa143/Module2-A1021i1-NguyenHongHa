package b17_IO_binaryFile_and_Serializion.bai_tap.quan_ly_san_pham_luu_file_nhi_phan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập đường dẫn file csv: ");
        String path = sc.nextLine();
        while (true){
            System.out.println("1. Thêm\n2. Hiển thị\n3. Thoát");
            System.out.print("Mời bạn chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    service.add(path);
                    break;
                case 2:
                    service.display(path);
                    break;
                case 3: System.exit(1);
            }
        }
    }
}
