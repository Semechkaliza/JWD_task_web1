<%@ page language ="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title> Insert title here </title>
</head>
<body>
<table>
    <c:forEach items="${requestScope.mybean}" var="users">
        <tr>
            <td>${users.name}</td>
            <td>${users.surname}</td>
            <td>${users.phone}</td>
            <td>${users.email}</td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
