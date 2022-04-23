package Controller;

import Model.Product;
import Service.ServiceProduct;
import Service.ServiceProductImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletProduct", urlPatterns = "/product")
public class ServletProduct extends HttpServlet {
    private ServiceProduct serviceProduct = new ServiceProductImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action ;
        action = request.getParameter("action");
        switch (action){
            case "create":
                showCreate(request, response);
                break;
            case "update":
                showUpdate(request, response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "findByID":
                showByID(request,response);
                break;
            case "findByName":
                showByName(request, response);
                break;
            case "view":
            default:
                showProduct(request, response);
        }
    }
    private void showProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> list = serviceProduct.findAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("view.jsp").forward(request,response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request,response);
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id",id);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        serviceProduct.delete(id);
        response.sendRedirect(request.getContextPath()+"/product?action=view");
    }
    private void showByID(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Product> products = new ArrayList<>();
         products.add(serviceProduct.findByID(id));
         request.setAttribute("products",products);
         request.getRequestDispatcher("search.jsp").forward(request,response);
    }

    private void showByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        List<Product> products = new ArrayList<>();
        products = serviceProduct.findByName(name);
        request.setAttribute("products",products);
        request.getRequestDispatcher("search.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":
                create(request,response);
                break;
            case "update":
                update(request, response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String manufacturer = request.getParameter("manufacturer");
        serviceProduct.create(new Product(id,name,price,quantity,manufacturer));
        response.sendRedirect(request.getContextPath()+"/product?action=view");
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String manufacturer = request.getParameter("manufacturer");
        serviceProduct.update(id,new Product(id,name,price,quantity,manufacturer));
        response.sendRedirect(request.getContextPath()+"/product?action=view");
    }
}
