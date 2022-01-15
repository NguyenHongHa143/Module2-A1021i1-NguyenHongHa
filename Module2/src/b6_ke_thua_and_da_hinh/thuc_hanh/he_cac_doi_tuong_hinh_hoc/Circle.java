package b6_ke_thua_and_da_hinh.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape{
    private double radius = 4.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    public String toString(){
        return "A Circle with radius = "+this.getRadius()+" which is a subclass of "+super.toString();
    }
}
