import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class lgnserv extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
PrintWriter out=res.getWriter();
try
{
  String name=req.getParameter("t1");
  String pwd=req.getParameter("t2");
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection conn =  DriverManager.getConnection ("jdbc:odbc:bus"); 
     Statement stmt = conn.createStatement ();
	ResultSet rs1=stmt.executeQuery("select * from bus");
         
     out.println("<html><head><script>alert("welcome"+name)</script></head></html>");
 
         stmt.close();
        conn.close();
}
catch (Exception e)
{
System.out.println("Error : "+e);
}	
}
}
