<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/15/2022
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table{
        padding: 5px;
        text-align: left;
    }
</style>
<body>
    <h2>Product Discount Calculator</h2>
    <form action="result_product" method="get">
        <table>
            <tr>
                <th>Product Description</th>
                <td>
                    <input type="text" size="25" name="Description" placeholder=" Enter" value=${description}>
                </td>
            </tr>
            <tr>
                <th>List Price</th>
                <td>
                    <input type="text" size="25" name="Price" placeholder=" Enter" value=${price}>
                </td>
            </tr>
            <tr>
                <th>Discount Percent</th>
                <td>
                    <input type="text" size="25" name="Percent" placeholder=" Enter" value=${percent}%>
                </td>
            </tr>
            <tr>
                <th>Discount Amount</th>
                <td>
                    <input type="text" size="25" name="Amount" placeholder=" Enter" value=${amount}>
                </td>
            </tr>
            <tr>
                <th>Discount Price</th>
                <td>
                    <input type="text" size="25" name="Price_After" placeholder=" Enter" value=${price_After}>
                </td>
            </tr>
            <tr>
                <td>
                    <button>Submit</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
