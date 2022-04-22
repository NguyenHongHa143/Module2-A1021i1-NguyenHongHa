<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/19/2022
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        .img{
            width: 100px;
            height: 80px;
        }
        table tr{
            justify-content: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <table class="table table-striped">
            <tr>
                <th colspan="4" style="text-align: center">DANH SÁCH KHÁCH HÀNG</th>
            </tr>
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Ngày Sinh</th>
                <th>Ảnh</th>
            </tr>
            <c:forEach items="${list}" var="customer">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>
                        <fmt:formatDate value="${customer.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate>
                    </td>
                    <td>
                        <img src="${customer.img}" class="img-thumbnail rounded img">
                    </td>
                </tr>
            </c:forEach>
        </table>

    </div>
</body>
</html>
