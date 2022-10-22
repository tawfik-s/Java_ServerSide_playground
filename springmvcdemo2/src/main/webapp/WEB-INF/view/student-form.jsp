<%--
  Created by IntelliJ IDEA.
  User: tshal
  Date: 10/19/2022
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>student form</title>
    <style>
        .error{
            color:red;
        }
    </style>
</head>
<body>
<h1>please enter your first and last name</h1>

<form:form action="processForm" modelAttribute="student">
    First name:<form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br>
    Last name:<form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br>
    <form:select path="gender">
<%--        <form:option value="male" label="male"/>--%>
<%--        <form:option value="female" label="female"/>--%>
        <form:options items="${student.genderOptions}"/>
    </form:select>
    <br>
    <br>
    java<form:radiobutton path="favouriteLanguage" value="java"/>
    ruby<form:radiobutton path="favouriteLanguage" value="ruby"/>
    C#<form:radiobutton path="favouriteLanguage" value="c#"/>
    node<form:radiobutton path="favouriteLanguage" value="node"/>
    <br>
    Operating systems:
    Linux<form:checkbox path="operatingSystems" value="Linux"/>
    MS windows<form:checkbox path="operatingSystems" value="MS windows"/>
    MacOs<form:checkbox path="operatingSystems" value="MacOs"/>
    <<br>
    <input type="submit" value="Submit">
</form:form>


</body>
</html>
