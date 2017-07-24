/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//To view cookies in IE, General tab->In Browsing History section,select Settings->select View Files
@WebServlet("/cookie/SetCookie")
public class egServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 //       PrintWriter out = response.getWriter();

//        int count = 0;

        //get cookies stored on browser
      /*  Cookie[] requestCookies = request.getCookies();

        out.println("Hello Browser");

        int cnt = 0;
        if(requestCookies != null){
            out.write("Request Cookies:");
            for(Cookie c : requestCookies)
            {
                out.write("Name="+c.getName()+", Value="+c.getValue());
                    /* +", Domain="+c.getDomain()+", MaxAge="+c.getMaxAge()+
                    ", Path="+c.getPath()
                    +", Version="+c.getVersion());


                cnt = Integer.parseInt(c.getValue());

                out.write("<br>");
            }
        }

        //Set cookies for counter, accessible to only this servlet
        cnt=cnt+2;
*/
        //create and store cookie on browser
        Cookie counterCookie = new Cookie("Counter", "hello");
        //add some description to be viewed in browser cookie viewer
        counterCookie.setComment("SetCookie Counter");
        //setting max age to be 1 day
        counterCookie.setMaxAge(24/*hrs*/*60*60);//in seconds
        //set path to make it accessible to only this servlet

        //adding cookie to the response
        response.addCookie(counterCookie);
    }
}