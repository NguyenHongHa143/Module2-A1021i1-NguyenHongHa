package Service;

import Model.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceCustomerIpm implements ServiceCustomer {
    private static Map<Integer,Customer> customerMap=new HashMap<>();
    static {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        try {
            customerMap.put(1,new Customer(1,"Mai Văn Hoàng",format.parse("08/20/1983"),
                    "data:image/jpeg;base64,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"));

            customerMap.put(2,new Customer(2,"Nguyễn Văn Nam",format.parse("08/21/1983"),
                    "https://pdp.edu.vn/wp-content/uploads/2021/01/hinh-anh-cute-de-thuong.jpg"));
            customerMap.put(3,new Customer(3,"Nguyễn Thái Hòa",format.parse("08/22/1983"),
                    "https://pdp.edu.vn/wp-content/uploads/2021/01/hinh-anh-cute-de-thuong.jpg"));
            customerMap.put(4,new Customer(4,"Trần Anh Khoa",format.parse("08/23/1983"),
                    "https://pdp.edu.vn/wp-content/uploads/2021/01/hinh-anh-cute-de-thuong.jpg"));
            customerMap.put(5,new Customer(5,"Nguyễn Đình Thi",format.parse("08/24/1983"),
                    "https://pdp.edu.vn/wp-content/uploads/2021/01/hinh-anh-cute-de-thuong.jpg"));

        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void add(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Customer> findName(String name) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> list = new ArrayList<>(customerMap.values());
        return list;
    }
}
