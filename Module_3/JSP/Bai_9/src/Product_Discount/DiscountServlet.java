package Product_Discount;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet_Product", urlPatterns = "/result_product")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Description");
        float price = Float.parseFloat(request.getParameter("Price"));
        int percent = Integer.parseInt(request.getParameter("Percent"));
        float amount = price*percent/100;
        float price_after = price-amount;
        request.setAttribute("description",description);
        request.setAttribute("price",price);
        request.setAttribute("percent",percent);
        request.setAttribute("amount",amount);
        request.setAttribute("price_After",price_after);

        request.getRequestDispatcher("/WEB-INF/Form_Product.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
