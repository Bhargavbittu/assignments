import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by vankayab on 7/20/2017.
 */
@WebServlet(name = "A8Servlet")
public class A8Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

/**
 * Created by vankayab on 7/21/2017.
 */
class Database {
    static Connection ct;
    static Statement st;

    public static void connect(String s) {


        try {
            Class.forName("com.mysql.jdbc.Driver");

            ct = DriverManager.getConnection("jdbc:mysql://localhost/cdk", "root", "CDKcdk11");

            Statement st = ct.createStatement();

            st.executeUpdate(s);

            st.close();
            ct.close();
        } catch (Exception et) {
            et.printStackTrace();
        }

    }

    public static void insertdb(String name, long time) {
        time = time / 1000;
        connect("insert into timelog values('" + name + "'," + time + ")");
    }
}