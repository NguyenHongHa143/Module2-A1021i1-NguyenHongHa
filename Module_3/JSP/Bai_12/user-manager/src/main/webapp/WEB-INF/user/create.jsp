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
    <title>Form User</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>
        Form User
    </h1>
    <form action="${pageContext.request.contextPath}/user" method="post">
        <table border="1px" class="table table-bordered border-primary">
            <tr>
                <td>
                    <label>Name</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="User Name" aria-label="default input example" name="name">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Email</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Email" aria-label="default input example" name="email">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label>Country</label>
                </td>
                <td>
                    <div class="mb-3">
                        <input class="form-control" type="text" placeholder="Country" aria-label="default input example" name="country">
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
