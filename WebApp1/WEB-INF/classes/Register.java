import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class Register extends GenericServlet
{
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
    {
        String email=req.getParameter("email");
        String pwd=req.getParameter("password");
        String phno=req.getParameter("PhoneNumber");
        String address=req.getParameter("address");
        /*res.getWriter().print("<h1>"+email+"</h1>");
        res.getWriter().print("<h1>"+pwd+"</h1>");
        res.getWriter().print("<h1>"+phno+"</h1>");
        res.getWriter().print("<h1>"+address+"</h1>");*/
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb", "root", "");
            PreparedStatement pstmt=con.prepareStatement("insert into register values(?,?,?,?)");
            pstmt.setString(1,email);
            pstmt.setString(2,pwd);
            pstmt.setString(3,phno);
            pstmt.setString(4,address);
            int r=pstmt.executeUpdate();
            if(r==1)
            {
                ((HttpServletResponse)res).sendRedirect("index.html");
            }
           else
           {
               ((HttpServletResponse)res).sendRedirect("register.html");
           }

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
    
        