<!-- обратите внимание на spring тэги -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet">
</head>

<body>
<spring:form method="post" modelAttribute="userJSP" action="check-user">
    Name:<spring:input path="login"/><br/>
    Pass:<spring:input path="pass"/><br/>
    <spring:button>Check</spring:button>
</spring:form>
</body>
</html>
