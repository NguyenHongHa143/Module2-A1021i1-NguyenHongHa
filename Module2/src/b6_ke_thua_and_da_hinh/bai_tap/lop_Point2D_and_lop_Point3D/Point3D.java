package b6_ke_thua_and_da_hinh.bai_tap.lop_Point2D_and_lop_Point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public String getXYZ(){
        float[] arrXYZ = new float[]{getX(),getY(),getZ()};
        return Arrays.toString(arrXYZ);
    }
    public String toString(){
        return "("+getX()+","+getY()+","+getZ()+")";
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setXY(4.5f,2.4f);
        System.out.println(a.getX()+" "+a.getY());
        a = new Point3D();
        System.out.println(a.getX()+" "+a.getY());

        a = new Point3D(a.getX(),a.getY(),3.1f);
        System.out.println(a.getX()+" "+a.getY());
        System.out.println(a.toString());    }
}
