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

<jsp:include page="profile.jsp"/><br><br><br>
<br>
<html:form action="/delete11" method="get">

Enter employee Id:<br>
<html:text property="empid"/><br>


<html:submit>submit</html:submit>
</html:form>
</html:html>


</body>
</html>