package b15_xu_ly_ngoai_le_and_Debug.bai_tap.su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

public class TestTriangle {
    static Scanner sc = new Scanner(System.in);
    public static void testTriangle(double a, double b, double c) throws IllegalTriangleException{
        if (a<0||b<0||c<0){
            throw new IllegalTriangleException("Lỗi tam giác âm!! Nhập lại!!");
        }
        else if (a+b<c||a+c<b||b+c<a){
            throw new IllegalTriangleException("Đây không phải tam giác!! Nhập lại!!");
        }
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("Nhập 3 cạnh tam giác: ");
            System.out.print("a= ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.print("b= ");
            double b = Double.parseDouble(sc.nextLine());
            System.out.print("c= ");
            double c = Double.parseDouble(sc.nextLine());
            try {
                testTriangle(a,b,c);
                System.out.println("Tam giác của bạn đã được tạo thành công!!");
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e);;
            }
        }
    }
}
