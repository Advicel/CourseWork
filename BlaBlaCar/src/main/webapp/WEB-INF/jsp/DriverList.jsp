<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<style>
    <%@include file="/WEB-INF/css/style.css"%>
</style>
<head>

    <meta charset="UTF-8" />
    <title>Employee List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Driver List</h1>
<a href="${pageContext.request.contextPath}/AddDriver">Add Driver</a>

<br/><br/>
<div>
    <form action="DriverList/delete" method="post">
    <table border="1">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>age</th>
            <th>car</th>
        </tr>
        <c:forEach  items="${drivers}" var ="driver">
            <tr>
                <td>${driver.name}</td>
                <td>${driver.age}</td>
                <td>${driver.car}</td>
                <td><button type="submit" name="delete" value="${driver.name}">delete</button></td>
            </tr>
        </c:forEach>
    </table>
    </form>

</div>
<div class="vladmaxi-top">
    <a href="index" target="_blank">Main page</a>
    <div class="clr"></div>
</div>
</body>

</html>