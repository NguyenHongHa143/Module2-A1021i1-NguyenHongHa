<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 4/15/2022
  Time: 6:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>

</style>
<body>
    <h2>Currency Converter</h2>
    <form action="converter.jsp" method="get">
        <label>Rate:</label>
        <input type="text" size="25" name="rate" placeholder=" Enter the value"> <br>
        <label>USD</label>
        <input type="text" size="25" name="usd" placeholder="0"> <br> <br>
        <button>Converter</button>
    </form>
</body>
</html>
