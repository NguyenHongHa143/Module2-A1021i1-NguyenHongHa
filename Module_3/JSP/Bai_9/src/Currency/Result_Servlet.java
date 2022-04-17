package Currency;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Result_Servlet", urlPatterns = "/Display_Currency")
public class Result_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double rate = Double.parseDouble(request.getParameter("rate"));
        double usd = Double.parseDouble(request.getParameter("usd"));
        double result = rate*usd;
        request.setAttribute("result",result);
        request.setAttribute("rate",rate);
        request.setAttribute("usd",usd);
        request.getRequestDispatcher("/WEB-INF/Display_Currency.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
