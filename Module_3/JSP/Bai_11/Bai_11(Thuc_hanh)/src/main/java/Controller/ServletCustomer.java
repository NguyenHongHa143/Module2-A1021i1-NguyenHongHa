package Controller;

import Model.Customer;
import Service.ServiceCustomer;
import Service.ServiceCustomerImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletCustomer", urlPatterns = "/customer")
public class ServletCustomer extends HttpServlet {
    ServiceCustomer serviceCustomer = new ServiceCustomerImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action = "list";
        }
        switch (action){
            case "create":
                createCustomer(request,response);
                break;
            case "update":
                updateCustomer(request,response);
                break;
            case "findByID":
                System.out.println("hello");
                findByID(request,response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "list":
            default:
                viewCustomer(request,response);

        }
    }
    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Customer> customers = serviceCustomer.findAll();
        request.setAttribute("customer",customers);
        request.getRequestDispatcher("view.jsp").forward(request,response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("create.jsp").forward(request,response);
    }
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id",id);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        serviceCustomer.delete(id);
        response.sendRedirect(request.getContextPath()+"customer?action=list");
    }

    private void findByID(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = serviceCustomer.findByID(id);
        request.setAttribute("customer",customer);
        request.getRequestDispatcher("search.jsp").forward(request,response);
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "update":
                update(request, response);
                break;
        }
    }
    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        serviceCustomer.create(new Customer(id,name,email,address));
        response.sendRedirect(request.getContextPath()+"customer?action=list");
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        serviceCustomer.update(id,new Customer(id,name,email,address));
        response.sendRedirect(request.getContextPath()+"customer?action=list");
    }
}
