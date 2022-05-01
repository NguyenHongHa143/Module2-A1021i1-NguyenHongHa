<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Search</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        a{
            width: 100px;
            text-decoration: none;
            font-size: 20px;
            color: black;
        }
        a:hover{
            color: black;
        }
        table{
            margin-top: 15px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Search Table</h1>
    <button type="button" class="btn btn-outline-secondary create">
        <a href="${pageContext.request.contextPath}/user?action=view">Back</a>
    </button>

    <table class = "table table-dark table-hover">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
        </tr>
        <c:forEach items="${list}" var="list" >
            <tr>
                <td>${list.id}</td>
                <td>${list.name}</td>
                <td>${list.email}</td>
                <td>${list.country}</td>
            </tr>
        </c:forEach>

    </table>

</div>
</body>
</html>
