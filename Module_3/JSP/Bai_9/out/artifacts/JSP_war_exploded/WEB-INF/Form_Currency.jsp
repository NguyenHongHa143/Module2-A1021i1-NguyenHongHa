<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/15/2022
  Time: 9:16 AM
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
        margin: 5px;
    }
    button{

    }
</style>
<body>
    <h1>
        Currency Converter
    </h1>
    <form action="Display_Currency" method="get">
        Rate: <br> <input type="text" size="20px" name="rate" placeholder="0"> <br>
        USD: <br> <input type="text" size="20px" name="usd" placeholder="0"> <br>
        VND: <br> <input type="text" size="20px" name="vnd" placeholder="0"> <br>
        <button>Converter</button>
    </form>
</body>
</html>
