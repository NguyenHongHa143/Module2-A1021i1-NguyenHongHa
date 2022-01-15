package b6_ke_thua_and_da_hinh.bai_tap.lop_Point_and_MoveablePoint;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrXY = new float[]{getxSpeed(),getySpeed()};
        return arrXY ;
    }
    public String toString(){
        return "("+getX()+","+getY()+"),speed = ("+getxSpeed()+","+getySpeed()+")";
    }
    public MoveablePoint move(){
        MoveablePoint a = new MoveablePoint();
        a.setX(getX()+xSpeed);
        a.setY(getY()+ySpeed);
        return a;
    }

    public static void main(String[] args) {
        Point a1 = new Point();
        a1.setX(2);
        a1.setY(3);
        System.out.println(a1.toString());

        a1 = new MoveablePoint(a1.getX(), a1.getY(),0,0);
        System.out.println(a1 instanceof MoveablePoint);
        ((MoveablePoint)(a1)).setSpeed(3,4);
//        System.out.println(a1.toString());
        Point b = new Point();
        b= ((MoveablePoint)(a1)).move();
        a1.setXY(b.getX(),b.getY());
        System.out.println(b.toString());
        System.out.println(a1.toString());

    }
}
