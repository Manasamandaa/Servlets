import java.io.*;
import jakarta.servlet.*;
public class Login extends GenericServlet{

    public void service(ServletRequest req ,ServletResponse res) throws ServletException, IOException
    {
        String uname=req.getParameter("username");
        String pwd=req.getParameter("password");
        if(uname.equals("Manasa")&&pwd.equals("123456"))
       {
            res.getWriter().print("<h1>Hello "+uname+"</h1>");
       }
       else
       {    
            res.getWriter().print("<h1>Invalid</h1>");
       }
    }
}
