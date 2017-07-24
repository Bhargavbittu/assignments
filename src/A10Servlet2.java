import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by vankayab on 7/19/2017.
 */
@WebServlet(name = "A10Servlet2")
public class A10Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter pw=response.getWriter();
        response.setContentType("text/html");
        Enumeration<String> e=request.getParameterNames();
        while (e.hasMoreElements())
        {
            String a=e.nextElement();
            pw.print(a+","+request.getParameter(a)+"<br>");
        }
        pw.print("done");
    }
}
