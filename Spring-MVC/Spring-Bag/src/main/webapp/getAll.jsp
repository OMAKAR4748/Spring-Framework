<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Users</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #333;
            font-size: 40px;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }

        table, th, td {
            border: 2px solid #444;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: grey;
            color: red;
            font-size: 20px;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #e0e0e0;
        }

        a {
            color: blue;
            text-decoration: none;

        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>Registered Users</h1>
    <table border="2">
        <tr>
            <th>Sl.No</th>
            <th>Brand</th>
            <th>Color</th>
            <th>Capacity</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
        <c:forEach var="item" items="${list}">
            <tr>
                <td>${item.id}</td>
                <td>${item.brand}</td>
                <td>${item.color}</td>
                <td>${item.capacity}</td>
                <td>${item.price}</td>
                <td>
                   <a href="deleteBag?id=${item.id}"><i class="bi bi-trash3"></i></a> &nbsp;
                   <a href="editBag?id=${item.id}"><i class="bi bi-pencil-square"></i></a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
