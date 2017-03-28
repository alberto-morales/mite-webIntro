<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Bienvenido</title>
</head>
<%
  WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
  pageContext.setAttribute("beanMessage", context.getBean("message"));
%>
<body>
It has been started.<BR/>
<c:out value="${beanMessage.text}"/>
</body>
</html>