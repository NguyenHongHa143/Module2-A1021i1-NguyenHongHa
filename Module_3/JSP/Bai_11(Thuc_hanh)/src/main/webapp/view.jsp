<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/22/2022
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        table{
            margin-top: 20px;
        }
        h1{
            text-align: center;
        }
        a{
            width: 100px;
            text-decoration: none;
            font-size: 20px;
            color: black;
        }
        .create{
            float: left;
            padding-right: 10px ;
            margin-bottom: 20px;
            margin-top: 20px;
        }
        .search{
            /*float: left;*/
            position: absolute;
            right: 120px;
            width: 50%;
            margin-bottom: 20px;
            margin-top: 20px;
        }
    </style>


</head>
<body>
    <div class="container">
        <h1>Customer Table</h1>
        <button type="button" class="btn btn-outline-secondary create">
            <a href="${pageContext.request.contextPath}/customer?action=create">Create</a>
        </button>
        <form action="${pageContext.request.contextPath}/customer" method="get">
            <div class="input-group mb-3 search">
                <input type="text" class="form-control" placeholder="Customer ID" aria-label="Recipient's username" aria-describedby="button-addon2" name="id">
                <button class="btn btn-outline-secondary" type="submit" id="button-addon2">Search</button>
            </div>
            <input type="hidden" name="action" value="findByID">
        </form>
        <table class = "table table-dark table-hover">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th></th>
            </tr>
            <c:forEach items="${customer}" var="customer" >
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>${customer.email}</td>
                    <td>${customer.address}</td>
                    <td>
                        <div class="d-grid gap-2 d-md-block">
                            <button class="btn btn-primary" type="button"><a href="${pageContext.request.contextPath}/customer?action=update&id=${customer.id}" >Update</a></button>
                            <button class="btn btn-primary" type="button"><a href="${pageContext.request.contextPath}/customer?action=delete&id=${customer.id}" >Delete</a></button>
                        </div>
                    </td>
                </tr>
            </c:forEach>

        </table>

    </div>
</body>
</html>
