import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vankayab on 7/19/2017.
 */
@WebServlet(name = "A10Servlet1")
public class A10Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Enumeration<String> e=request.getParameterNames();
        RequestDispatcher rd=request.getRequestDispatcher("A10Servlet2");
        rd.forward(amethod(request,e),response);

    }
    public HttpServletRequest amethod(HttpServletRequest req,Enumeration<String> enumeration)
    {
        Map<String,String> paramsmap=new HashMap<String,String>();
        while(enumeration.hasMoreElements())
        {
            String a=enumeration.nextElement();
            paramsmap.put(a,req.getParameter(a));
        }
        paramsmap.put("param1","added in servlet");
        paramsmap.put("param2","added in servlet");
        return new HttpServletRequestWrapper(req){
           public Enumeration<String> getParameterNames()
            {
                return Collections.enumeration(paramsmap.keySet());
            }
            public String getParameter(String s)
            {
                return paramsmap.get(s);
            }
        };

    }
}
