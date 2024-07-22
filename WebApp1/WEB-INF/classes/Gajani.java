mport jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Gajani  extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String uname=req.getParameter("username");
        String pwd=req.getParameter("password");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2", "root", "madhu");
            PreparedStatement pstmt=con.prepareStatement("select * from register where email=? and password=?");
            pstmt.setString(1,uname);
            pstmt.setString(2, pwd);
            ResultSet rs= pstmt.executeQuery();
            if(rs.next())
            {
                out.print("<h1>Welcome "+uname+"</h1>");
            } else{
                out.print("<h1>Invalid Userid/Pwd</h1>");
            }
        }catch(Exception ex)
        {
            out.println(ex);
        }

    }
}