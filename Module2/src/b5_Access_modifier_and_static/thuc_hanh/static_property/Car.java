package b5_access_modifier_static_method_and_static_property.thuc_hanh.static_property;

public class Car {
    private String name;
    private String engine;
    static public int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
