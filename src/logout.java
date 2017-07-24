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
@WebServlet(name = "logout")
public class logout extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        PrintWriter pw = response.getWriter();
        if (!Servlet1.islog) {
            pw.print("please login to continue <a href=\"ln.html\"></a>");
        } else {
            response.setContentType("text/html");

            pw.print(session.getAttribute("username") + "<br> you are successfully logged out");
            pw.print("you are online for " + (System.currentTimeMillis() - session.getCreationTime()) / 1000 + "seconds");
            Servlet1.islog=false;
            WelcomeServlet.sid=false;
            session.invalidate();
        }
    }
}