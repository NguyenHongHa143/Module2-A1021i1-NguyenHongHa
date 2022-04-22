<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/22/2022
  Time: 1:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<body>
<div class="container">
    <h1>
        Form Customer
    </h1>
    <form action="${pageContext.request.contextPath}/customer" method="post">
        <table border="1px" class="table table-bordered border-primary">
            <tr>
                <td>
                    <label>ID</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="${id}" aria-label="Disabled input example" name="id" value="${id}">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Name</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Customer Name" aria-label="default input example" name="name">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Email</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Customer Email" aria-label="default input example" name="email">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Address</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Customer Address" aria-label="default input example" name="address">
                    </div>
                </td>
            </tr>
        </table>
        <input type="hidden" name="action" value="update">
        <button type="submit" class="btn btn-secondary btn-lg">Submit</button>
    </form>
</div>
</body>
</body>
</html>
