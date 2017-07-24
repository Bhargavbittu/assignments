import com.sun.deploy.net.cookie.CookieUnavailableException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vankayab on 7/20/2017.
 */
@WebServlet(name = "A7Servlet")
public class A7Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        pw.print(request.getParameter("col"));
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("col")) {
                    cookie.setValue(request.getParameter("col"));
                    response.addCookie(cookie);
                }
            }
        }
        else
        {
            Cookie cookie = new Cookie("color",request.getParameter("col"));
            cookie.setMaxAge(60*60);
            response.addCookie(cookie);
        }

    }
}
