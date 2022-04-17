<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/15/2022
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    input{
        height: 30px;
    }
    button{
        height: 30px;
        width: 90px;
        border: 1px solid #333;
    }
</style>
<body>
    <h2>Vietnamese Dictionary</h2>
    <form action="result" method="get">
        <input type="text" size="30" name="word" placeholder="  Enter your word">
        <button value="Search">  Search</button> <br><br>
        Vietnamese: ${result}
    </form>
</body>
</html>
