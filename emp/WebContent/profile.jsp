<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page session="false" %>
    
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 
<logic:match name="username1"> --%>

<%-- <center>Welcome <%=session.getValue("username") %></center> --%>
<a href="Link.do?method=add">Add Details</a> 
  <a href="Link.do?method=edit">Update Details</a>
    <a href="Link.do?method=view1">View Details</a>
   <a href="Link.do?method=delete">Delete Details</a>
    <a href="Link1.do?method=logout">Logout</a>


<%--  </logic:present> --%>
<%--  <logic:notPresent name="username1"> --%>

<%--  </logic:notPresent> --%>
<%-- <c:choose>
        <c:when test="${not empty sessionScope.username}">
     <center>Welcome 1<%=session.getValue("username") %></center> 
     
        </c:when>
        <c:otherwise>
            <center>Please Login First.</center>
        </c:otherwise>
</c:choose> --%>
</body>
</html>