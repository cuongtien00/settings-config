<%--
  Created by IntelliJ IDEA.
  User: Phong Vu
  Date: 11/25/2021
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/save" method="post" modelAttribute="setting">
    Languages:<form:select path="languages" items="${languages}"/><br/>
    Page Size: Show <form:select path="size" items="${sizes}"/><br/> email per page
    Spams filter: <form:checkbox path="spamFilter" /><br/> Enable spams filter
    Signature: <form:textarea path="signature"/><br/>
    <button type="submit">Save</button>
</form:form>
</body>
</html>
