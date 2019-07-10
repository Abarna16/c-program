<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:html>
<jsp:include page="profile.jsp"/>
<br>
<br><html:form action="/edit1" method="get">
Enter employee name:<br>
<html:text property="empName"/><br><br>
Enter employee Id:<br>
<html:text property="empid"/><br><br>
Enter date of birth:<br>
<html:text property="dob"/><br><br>
Enter basic salary:<br>
<html:text property="basic"/><br><br>
Enter HRA:<br>
<html:text property="hra"/><br><br>
Enter TA:<br>
<html:text property="ta"/><br><br>
Enter Email<br>
<html:text property="email"/><br>


<center><html:submit>submit</html:submit></center>
</html:form>
</html:html>


</body>
</html>