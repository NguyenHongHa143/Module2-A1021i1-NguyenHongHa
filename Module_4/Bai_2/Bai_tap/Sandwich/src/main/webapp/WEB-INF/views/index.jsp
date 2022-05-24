<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/24/2022
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Sandwich$</title>
  </head>
  <body>
    <h1>Sandwich Condiments</h1>
    <form action="/sandwich" method="get">
      <input type="checkbox" name="spice" value="Lettuce">Lettuce
      <input type="checkbox" name="spice" value="Tomato">Tomato
      <input type="checkbox" name="spice" value="Mustard">Mustard
      <input type="checkbox" name="spice" value="Sprouts">Sprouts
      <hr>
      <input type="submit" value="save">
    </form>
    <div>You choose: Sandwich and ${spice}</div>
  </body>
</html>
