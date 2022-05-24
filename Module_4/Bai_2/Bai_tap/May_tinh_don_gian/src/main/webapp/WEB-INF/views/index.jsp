<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/24/2022
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Calculation$</title>
  </head>
  <body>
    <h1>Calculation</h1>
    <form action="caculator" method="post">
      <input type="text" name="number1">
      <input type="text" name="number2"><br><br><hr>
      <input type="submit" value="+" name="caculation">Addition(+)
      <input type="submit" value="-" name="caculation">Subtraction(-)
      <input type="submit" value="X" name="caculation">Multiplication(X)
      <input type="submit" value="/" name="caculation">Division(/)
    </form>
    <h3>Result: ${result}</h3>
  </body>
</html>
