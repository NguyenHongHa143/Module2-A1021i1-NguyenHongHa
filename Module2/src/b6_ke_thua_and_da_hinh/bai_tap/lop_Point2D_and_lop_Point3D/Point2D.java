package b6_ke_thua_and_da_hinh.bai_tap.lop_Point2D_and_lop_Point3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public String getXY(){
        float[] arrXY = new float[] {this.x,this.y};
        return Arrays.toString(arrXY);
    }
    public String toString(){
        return "("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setXY(3.5f,4.6f);
        System.out.println(a.getX());
        System.out.println(a.getY());
    }

}
