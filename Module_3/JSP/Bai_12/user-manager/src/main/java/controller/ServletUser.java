package controller;

import bean.User;
import service.ServiceUser;
import service.ServiceUserImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletUser", urlPatterns = "/user")
public class ServletUser extends HttpServlet {
    ServiceUser serviceUser = new ServiceUserImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action = "view";
        }
        switch (action){
            case "create":
                showCreate(request, response);
                break;
            case "update":
                showUpdate(request, response);
                break;
            case "delete":
                showDelete(request, response);
                break;
            case "findByName":
                showFindByName(request, response);
                break;
            case "sort":
                showSort(request,response);
                break;
            case "view":
            default:
                showList(request, response);
        }
    }
    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list = serviceUser.getAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("/WEB-INF/user/view.jsp").forward(request,response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/user/create.jsp").forward(request,response);
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id",id);
        request.getRequestDispatcher("/WEB-INF/user/update.jsp").forward(request,response);
    }

    private void showDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        serviceUser.delete(id);
        response.sendRedirect(request.getContextPath()+"/user?action=view");
    }

    private void showFindByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list = new ArrayList<>();
        String name = request.getParameter("name");
        list =  serviceUser.findByCountry(name);
        request.setAttribute("list",list);
        request.getRequestDispatcher("/WEB-INF/user/search.jsp").forward(request,response);
    }
    private void showSort(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sortStyle = request.getParameter("sortStyle");
        String tmp=null;
        List<User> list = serviceUser.sort(sortStyle);
        request.setAttribute("list",list);
        if (sortStyle==null){
            tmp = "asc";
        }else if (sortStyle.equals("asc")){
            tmp = "desc";
        }else {
            tmp = "asc";
        }
        request.setAttribute("sortStyle",tmp);
        request.getRequestDispatcher("/WEB-INF/user/view.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":
                create(request,response);
                break;
            case "update":
                update(request,response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        serviceUser.create(new User(0,name,email,country));
        response.sendRedirect(request.getContextPath()+"/user?action=view");
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        serviceUser.update(new User(id,name,email,country));
        response.sendRedirect(request.getContextPath()+"/user?action=view");
    }
}
