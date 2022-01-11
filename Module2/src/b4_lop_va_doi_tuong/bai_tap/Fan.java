package b4_lop_va_doi_tuong.bai_tap;

public class Fan {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    int speed = Slow;
    boolean on = false;
    double radius = 5.0;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {

    }

    public String toString(){
        if(on){
            return "Fan is on {"+
                    "speed = "+speed +
                    ", color = "+color+
                    ", radius ="+radius+"}";
        }
        else {
            return "Fan is off {"+
                    " color = "+color+
                    ", radius ="+radius+"}";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        System.out.println(fan1);
        fan1.setSpeed(fan1.Fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1);
        System.out.println(fan2);
        fan2.setSpeed(fan2.Medium);
        System.out.println(fan2);

    }
}
