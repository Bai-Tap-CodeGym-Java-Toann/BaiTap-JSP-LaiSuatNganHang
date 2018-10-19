import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Bank extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double rate = Double.parseDouble(request.getParameter("rate")) / 100;
        int time = Integer.parseInt(request.getParameter("time"));
        double money = Double.parseDouble(request.getParameter("money"));
        double extraMoney = money * rate * time;
        RequestDispatcher rq = request.getRequestDispatcher("/reslutIndex.jsp");
        request.setAttribute("extra", extraMoney);
        rq.forward(request,response);
    }
}
