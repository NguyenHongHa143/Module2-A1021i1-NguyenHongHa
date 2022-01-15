package b6_ke_thua_and_da_hinh.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "+color+" and "+ (filled?"filled":"not filled");
    }

}
