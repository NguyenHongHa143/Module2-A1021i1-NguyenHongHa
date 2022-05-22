<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/22/2022
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h2>Dictionary</h2>
    <form action="/result" method="get">
      <h4>English :</h4>
      <input type="text" name="english" value="">
      <h4>Vietnamese :</h4>
      <h5>
        ${vietNames}
      </h5>
      <input type="submit" value="Search">
    </form>
  </body>
</html>
