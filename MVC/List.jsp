<%@  page  import="java.sql.*"  %>

<html>
<body>

<%
       ResultSet rs=(ResultSet)request.getAttribute("List");
%>

<table border="1" align="center"> 
<tr>
<th>Student No</th>
<th>Student Name</th>
<th>Student Age</th>
</tr>

<%
       while(rs.next())
        {
%>

<tr>
<td> <%=rs.getInt("sno") %> </td>
<td> <%=rs.getString("sname") %> </td>
<td> <%=rs.getInt("age") %> </td>
</tr>      

<%    
        }
%>

</table> 

</body>
</html>



