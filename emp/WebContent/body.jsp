
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

</style>
<body>

<logic:messagesPresent property="userName">
invalid userName<br>
</logic:messagesPresent>
<logic:messagesPresent property="password" >
Password is invalid , it should be a-z, A-Z, 0-9.
</logic:messagesPresent>
<%-- <html:errors property="userName"/>
<html:errors property="password"/> --%>
</body>
</html>