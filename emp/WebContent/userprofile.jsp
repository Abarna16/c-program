<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>



<%-- <center>Welcome <%=session.getValue("username") %></center> --%>
<!-- <a href="Link1.do?method=userview">View Profile</a>
 --><%out.print(" "); %><a href="Link1.do?method=logout">Logout</a><br>
 

 
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