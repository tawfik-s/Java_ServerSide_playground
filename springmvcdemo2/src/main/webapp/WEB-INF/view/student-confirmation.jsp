<%--
  Created by IntelliJ IDEA.
  User: tshal
  Date: 10/19/2022
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>confirmation</title>
</head>
<body>

hello mr  ${student.firstName} ${student.lastName}
<br>
gender: ${student.gender}
<br>
favourite language ${student.favouriteLanguage}
<br>
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>

</body>
</html>
