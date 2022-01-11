package b5_access_modifier_static_method_and_static_property.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        System.out.println(Car.numberOfCar);
        Car car1 = new Car("BWM","Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCar);

    }
}
