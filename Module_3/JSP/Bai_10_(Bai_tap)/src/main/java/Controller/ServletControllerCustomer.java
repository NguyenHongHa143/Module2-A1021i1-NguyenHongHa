package Controller;

import Model.Customer;
import Service.ServiceCustomer;
import Service.ServiceCustomerIpm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletControllerCustomer", urlPatterns = "/view")
public class ServletControllerCustomer extends HttpServlet {
    private static ServiceCustomer customer = new ServiceCustomerIpm();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list = customer.getAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("/view.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
