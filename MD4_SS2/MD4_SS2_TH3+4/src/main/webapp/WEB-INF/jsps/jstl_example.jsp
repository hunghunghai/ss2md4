<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/3/2023
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Khai báo sử dụng JSTL Core Tags -->
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSTL Core Tags Example 01</title>
</head>
<body>
<h2>Departments and Employees</h2>

<!-- Dùng for để duyệt trên các phòng ban (departments) -->
<c:forEach items="${departments}" var="dept">
  <h3>${dept.deptName}</h3>
  <ul>
    <!-- Dùng for để duyệt trên các nhân viên
                thuộc phòng ban hiện tại -->
    <c:forEach items="${dept.employees}" var="emp">
      <li>
          ${emp.empName} - (${emp.job})
      </li>
    </c:forEach>
  </ul>

</c:forEach>


</body>
</html>
