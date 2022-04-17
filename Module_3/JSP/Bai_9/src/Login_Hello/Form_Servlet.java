package Login_Hello;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Form_Servlet", urlPatterns = "/Form_Servlet")
public class Form_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String username;
        if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")){
            username = "Welcom " +user+" to website!!";
        }else username = "Login Error";
        request.setAttribute("username", username);
        request.getRequestDispatcher("/WEB-INF/Display.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
