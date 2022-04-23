<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/22/2022
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>
        Form Product
    </h1>
    <form action="${pageContext.request.contextPath}/product" method="post">
        <table border="1px" class="table table-bordered border-primary">
            <tr>
                <td>
                    <label>ID</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Product ID" aria-label="default input example" name="id">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Name</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Product Name" aria-label="default input example" name="name">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Price</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Product Price" aria-label="default input example" name="price">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Quantity</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Product Quantity" aria-label="default input example" name="quantity">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Manufacturer</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Product Manufacturer" aria-label="default input example" name="manufacturer">
                    </div>
                </td>
            </tr>
        </table>
        <input type="hidden" name="action" value="create">
        <button type="submit" class="btn btn-secondary btn-lg">Submit</button>
    </form>

</div>
</body>
</html>
