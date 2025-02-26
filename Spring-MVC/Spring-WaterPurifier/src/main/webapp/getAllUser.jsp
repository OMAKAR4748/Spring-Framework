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
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Action</th>
        </tr>
        <c:forEach var="dto" items="${listOfUser}">
            <tr>
                <td>${dto.id}</td>
                <td>${dto.firstName}</td>
                <td>${dto.lastName}</td>
                <td>${dto.email}</td>
                <td>${dto.phoneNumber}</td>
                <td>
                     <a href="delete?id=${dto.id}">Delete</a>
                     &nbsp <a href="fetchUser?id=${dto.id}">Edit</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
