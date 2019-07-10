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

<html:form action="/userview11" method="get">

Enter employee Id:<br>
<html:text property="empid"/><br>
Enter date of birth:<br>
<html:text property="dob"/>

<html:submit>submit</html:submit>
</html:form>
</html:html>


</body>
</html>