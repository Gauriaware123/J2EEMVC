import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Controller extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        String oper=request.getParameter("oper");

        if(oper.equals("List"))
         {
           Student s=new Student();
           ResultSet rs=s.getStudList();
           
           request.setAttribute("List", rs);

           RequestDispatcher rd=request.getRequestDispatcher("../List.jsp");
           rd.forward(request, response);  
         }
 
        out.println("</body>");
        out.println("</html>");
    }
}



