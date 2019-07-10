<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@ page import="java.sql.DriverManager,java.sql.Connection,java.sql.PreparedStatement,java.sql.ResultSet,java.sql.SQLException,java.sql.Statement" %>  
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<jsp:include page="profile.jsp"/><br><br><br><br>
<html:html>
 <html:form action="Link.do" method="post">
 
 
<%-- <input type="hidden" name="method" value="view11"/>
Enter employee Id:<br>
<html:text property="empid"/><br>


<html:submit>submit</html:submit>  --%>

<%



Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abar","root","root");
System.out.println("Connection established");

try
{
	try
	{
	Statement st=con.createStatement();
	
	
	ResultSet rs=st.executeQuery("select * from detail ");  
	
	//System.out.println(rsmd);
	while(rs.next()) {
		out.print("<center><b>Details!!!</b></center><br>");
		
		out.println("Employee id is   : "+rs.getString(1)+"<br>");
		out.println("Employee Name    : "+rs.getInt(2)+"<br>");
		out.println("Date of birth    : "+rs.getString(3)+"<br>");
		out.println("Basic            : "+rs.getInt(4)+"<br>");
		out.println("HRA        	  : "+rs.getInt(5)+"<br>");
		out.println("TA        	      : "+rs.getInt(6)+"<br>");
		out.println("Email Id         : "+rs.getString(7)+"<br>");
		out.println("Total salary is  : "+rs.getInt(8)+"<br>");

		  
		  }
	
	}
	catch(SQLException ex)
	{
		System.out.println(ex);
		
	}
	con.close();
}catch(Exception e)
{
	
	System.out.println(e);
}









%>



</html:form>
</html:html>


</body>
</html>