import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by vankayab on 7/18/2017.
 */
@WebFilter(filterName = "PageTimeFilter")
public class PageTimeFilter implements Filter {
    public void destroy() {
    }
static long time=0;
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        time=System.currentTimeMillis();
        if(resp.isCommitted())System.out.print(System.currentTimeMillis()-time);

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
