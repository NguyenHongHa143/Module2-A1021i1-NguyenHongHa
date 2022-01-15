package b6_ke_thua_and_da_hinh.bai_tap.lop_Point_and_MoveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
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
        Point pt = new Point();
        pt.setXY(3.4f,5.6f);
        System.out.println(pt.toString());
    }
}
