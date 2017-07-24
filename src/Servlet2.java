import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vankayab on 7/17/2017.
 */
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        HttpSession session = request.getSession(false);
        if (!Servlet1.islog) {
            pw.print("<form>please login to continue <a href=\"ln.html\">login page</a></form>");
        } else {
            pw.print("<form action=\"logout\" method=\"get\"><p align=\"right\"><input type=\"submit\" value=\"logout\" name=\"submit\" align=></p><br>");
            pw.print(" hi," + session.getAttribute("username") + "<br>this is your home page<br>");
            pw.print("<a href=Servlet2>home page</a><br><a href=WelcomeServlet>Welcome page</a>");
        }

    }
}
