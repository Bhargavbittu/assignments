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
@WebServlet(name = "A9Servlet")
public class A9Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        pw.print("this is from servlet<br>");
        Enumeration<String> e=request.getParameterNames();


        while (e.hasMoreElements())
        {

                pw.print(e.nextElement()+"<br>");

        }


    }
}
