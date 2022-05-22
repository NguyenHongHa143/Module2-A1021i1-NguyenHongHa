<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/21/2022
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/result" method="post">
    <span>Ty gia: </span> <input type="text" name ="rate" value="${rate}" size="10"><br><br>
    <span>USD: </span> <input type="text" name ="USD" value="${USD}" > <span>----> VND: </span> <input type="text" value="${VND}">
    <input type="submit" value="Submit">
  </form>
  </body>
</html>
