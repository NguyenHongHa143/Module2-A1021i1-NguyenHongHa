package Model;

import java.util.Date;

public class Customer {
    private int id;
    private String name;
    private Date birthday;
    private String img;

    public Customer() {
    }

    public Customer(int id, String name, Date birthday, String img) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
