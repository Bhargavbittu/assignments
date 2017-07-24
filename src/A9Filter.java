import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.*;

/**
 * Created by vankayab on 7/19/2017.
 */
@WebFilter(filterName = "A9Filter")
public class A9Filter implements Filter {

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {


        Enumeration<String> e=req.getParameterNames();
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        Map<String,String> paramsmap=new HashMap<String,String>();
        while (e.hasMoreElements())
        {
            String a=e.nextElement();
            if(!a.equals("a")){
                paramsmap.put(a,req.getParameter(a));
            }
        }
      HttpServletRequest ac= aclass((HttpServletRequest) req,paramsmap);


        chain.doFilter((ServletRequest)ac, resp);
        pw.print("this is in filter");
    }
    public HttpServletRequest aclass(HttpServletRequest a,final Map<String,String> pmap) {
        return new HttpServletRequestWrapper(a) {
            @Override
            public String getParameter(String s) {
                return pmap.get(s);
            }

            @Override
            public Enumeration<String> getParameterNames() {
                return Collections.enumeration(pmap.keySet());
            }

        };
    }
    public void init(FilterConfig config) throws ServletException {

    }

}

