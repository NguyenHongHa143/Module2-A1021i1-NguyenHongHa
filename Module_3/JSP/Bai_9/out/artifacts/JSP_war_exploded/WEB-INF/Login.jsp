<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/14/2022
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        input{
            height: 20px;
            padding: 5px 0;
            margin: 5px;
            border: 1px solid #333;
            border-radius: 20px;
        }
        button{
            height: 30px;
            width: 100px;
            margin: 5px;
            border-radius: 10px;
        }
    </style>
</head>
<body>
    <h1>
        LOGIN
    </h1>
    <form action="Form_Servlet" method="get">
        <input type="text" size="20px" name="username" placeholder=" Username"> </br>
        <input type="password" size="20px" name="password" placeholder=" Password"> </br>
        <button>Sign in</button>
    </form>

</body>
</html>
