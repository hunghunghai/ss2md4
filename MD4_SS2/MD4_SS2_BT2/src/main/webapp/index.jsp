<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Simple Calculator</h1>
<h3>Calculator</h3>
<form method="post" action="calculator">
    <label>First Number:</label>
    <input type="text" name="first" /></br>
    <label> Action</label>
    <select name="value">
        <option value="1">Cộng</option>
        <option value="2">Trừ</option>
        <option value="3">Nhân</option>
        <option value="4">Chia</option>
    </select></br>
    <label>Second Number:</label>
    <input type="text" name="second"/></br>

    <input type="submit" action="calculator">
</form>
</body>
</html>