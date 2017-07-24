import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "A3Servlet")
public class A3Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        pw.print("this is in the processing servlet");
        RequestDispatcher rd=request.getRequestDispatcher("login.html");
        RequestDispatcher rd1=request.getRequestDispatcher("ln.html");
        rd.include(request,response);
        rd1.include(request,response);
    }
}
