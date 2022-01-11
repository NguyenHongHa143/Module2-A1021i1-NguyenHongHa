package b4_lop_va_doi_tuong.thuc_hanh;

import java.util.Scanner;

public class class_Rectangle {
    double height;
    double width;

    public class_Rectangle() {
    }

    public class_Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle{ width = " +this.width + "cm height = "+this.height+"cm}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật (cm): ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều rộng hình chữ nhật (cm): ");
        double height = Double.parseDouble(sc.nextLine());
        class_Rectangle rectABC = new class_Rectangle(width,height);
        System.out.println("Diện tích hình chữ nhật ABC là: "+rectABC.getArea()+" cm^2");
        System.out.println("Chu vi hình chữ nhật là: "+rectABC.getPerimeter()+" cm");
        System.out.println("Thông tin hình CN ABC: "+rectABC.display());

    }
}
