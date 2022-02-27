package b17_IO_binaryFile_and_Serializion.bai_tap.quan_ly_san_pham_luu_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String manufacturer;
    private int price;

    public Product(int code, String name, String manufacturer, int price) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public Product() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
