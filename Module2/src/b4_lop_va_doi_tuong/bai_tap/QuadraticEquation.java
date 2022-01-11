package b4_lop_va_doi_tuong.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return (this.b*this.b)-4*this.a*this.c;
    }
    public double getRoot1(){

        return ((-this.b)-Math.sqrt(getDiscriminant()))/(2*this.a);
    }
    public double getRoot2(){
        return ((-this.b)+Math.sqrt(getDiscriminant()))/(2*this.a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số cho phương trình bậc 2:  ax^2 +bx+c=0 ");
        System.out.print("a = ");
        int a,b,c;
        double delta;
        a = Integer.parseInt(sc.nextLine());
        System.out.print("b = ");
        b = Integer.parseInt(sc.nextLine());
        System.out.print("c = ");
        c = Integer.parseInt(sc.nextLine());
        QuadraticEquation equa1 = new QuadraticEquation(a,b,c);
        delta = equa1.getDiscriminant();
        if (delta<0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if (delta==0){
            System.out.println("Phương trình có nghiệm x1=x2= "+equa1.getRoot1());
        }
        else {
            System.out.println("Phương trình có 2 nghiệm x1 = "+equa1.getRoot1()+" x2 = "+equa1.getRoot2());
        }

    }
}
