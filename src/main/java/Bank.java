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
        PrintWriter writer = response.getWriter();
        writer.print("<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\"\n" +
                "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>reslut</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div style=\"text-align: center; padding-top: 30px\" align=\"center\">\n" +
                "<h2>Origin money: " + money + "</h2>\n" +
                "<h2>Rate: " + rate + "</h2>\n" +
                "<br>\n" +
                "<h2>Extra Money you will get: " + extraMoney + " (after: " + time + " month)</h2>\n" +
                "<h2>Total Money: " + (extraMoney + money) + "</h2>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}
