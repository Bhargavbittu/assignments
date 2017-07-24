import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    static boolean islog=false;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String u=(String)request.getParameter("username");
        String p=(String)request.getParameter("password");
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
      //  pw.print("<a href=Servlet2>home page</a><br><a href=WelcomeServlet>Welcome page</a>");
        if(u.equals("bhargav") && p.equals("cdkglobal")){
            islog=true;
            RequestDispatcher rd=request.getRequestDispatcher("/WelcomeServlet");


            rd.forward(request,response);

        }
        else
        {
            RequestDispatcher rd=request.getRequestDispatcher("/login.html");
            rd.forward(request,response);
        }


    }
}
