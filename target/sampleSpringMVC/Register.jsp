<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dungd
  Date: 6/10/2020
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, this is register page</title>
</head>
<body>
    <h2> Please input your info</h2>
    <form:form action="./register" method="GET">
        <form:label path="name">Name</form:label>
        <form:input path="name"></form:input>
        <br/>
        <br/>
        <form:label path="age">Age</form:label>
        <form:input path="age"></form:input>
        <br/>
        <br/>
        <form:label path="username">Username</form:label>
        <form:input path="username"></form:input>
        <br/>
        <br/>
        <form:label path="password">Password</form:label>
        <form:input path="password"></form:input>
        <br/>
        <br/>
        <form:label path="adult">Adult</form:label>
        <form:checkbox path="adult"></form:checkbox>
        <br/>
        <br/>
<form:label path="gender">Gender</form:label>
        <form:radiobutton value="M" label="male" path="gender"/>
        <form:radiobutton value="F" label="female" path="gender"/>
        <form:label path="address">Address</form:label>
        <form:select path="address">
            <form:option value="NONE" label="select"/>
            <form:options items="${countryList}"/>
        </form:select>
        <br/>
        <br/>
        <form:hidden path="hiddenInfor" value="hidenInformation"/>
        <br/>
        <br/>

    </form:form>
</body>
</html>
