import java.sql.*;

class Student
{
  ResultSet getStudList()
   {
    Connection con=null;

    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
     
      String query="Select * from student";

      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery(query);

      return rs;
   }
  catch(Exception e)
   {
     System.out.println(e);
     return null;
    }

   }
}