import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vankayab on 7/18/2017.
 */
@WebServlet(name = "ServletContext1")
public class ServletContext1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext s=request.getServletContext();
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        pw.print(s.getInitParameter("Author")+"<br>");
        pw.print(s.getInitParameter("blogname"));
    }
}
