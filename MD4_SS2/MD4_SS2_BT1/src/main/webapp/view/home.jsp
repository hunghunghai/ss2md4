<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/3/2023
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        h1,table{
            width: 100%;
            text-align: center;
            margin: 0 auto 50px;
        }
      img{
          width: 10%;
          height: 10%;
      }
    </style>
</head>
<body>
<h1>Danh Sách Khách Hàng</h1>
<table border="10" cellspacing="10" cellpadding="20" style="text-align: center">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>DateOfBirth</th>
        <th>Address</th>
        <th>Avatar</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.dateOfBirth}</td>
            <td>${c.address}</td>
            <td><img herf="${c.avatarUrl}"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
