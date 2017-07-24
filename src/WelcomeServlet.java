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
@WebServlet(name = "WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    static boolean sid=false;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        HttpSession session ;

        if(!sid && Servlet1.islog )
        {session=request.getSession(true);
        sid=true;
              response.setContentType("text/html");
            session.setAttribute("username", (String) request.getParameter("username"));
            session.setAttribute("password", (String) request.getParameter("password"));
            pw.print("<form action=\"logout\" method=\"get\"><p align=\"right\"><input type=\"submit\" value=\"logout\" name=\"submit\" ></p><br>");
            pw.print(session.getAttribute("username") + " is logged in successfully<br> </form>");
            pw.print("<a href=Servlet2>home page</a><br><a href=WelcomeServlet>Welcome page</a>");
        }
        else if(Servlet1.islog==false)
        {
            pw.print("<form>please login to continue <a href=\"ln.html\">login page</a></form>");
        }
        else if(sid)
        {
           HttpSession session1=request.getSession(false);
            pw.print("<form action=\"logout\" method=\"get\"><p align=\"right\"><input type=\"submit\" value=\"logout\" name=\"submit\" ></p><br>");
            pw.print(session1.getAttribute("username") + " is logged in successfully<br> </form>");
            pw.print("<a href=Servlet2>home page</a><br><a href=WelcomeServlet>Welcome page</a>");
        }

    }
}