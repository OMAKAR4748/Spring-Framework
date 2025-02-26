
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <title>Get All Details</title>
    <style>
    /* Reset and Base Styles */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: 'Poppins', sans-serif;
    }

    /* Body */
    body {
        background: #f4f6f7;
        text-align: center;
        padding: 20px;
    }

    /* Home Link */
    .back-link {
        display: inline-block;
        text-decoration: none;
        font-size: 16px;
        font-weight: bold;
        color: #e74c3c;
        transition: all 0.3s ease;
        position: absolute;
        top: 20px;
        right: 20px;
    }

    .back-link:hover {
        color: #c0392b;
    }

    /* Heading */
    h2 {
        color: #2c3e50;
        font-size: 24px;
        font-weight: bold;
        margin: 20px 0;
        text-transform: uppercase;
    }

    /* Table Styles */
    table {
        width: 90%;
        margin: 20px auto;
        border-collapse: collapse;
        background: #ffffff;
        border-radius: 8px;
        overflow: hidden;
        box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
    }

    th, td {
        padding: 14px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }

    th {
        background: #2c3e50;
        color: #ffffff;
        font-weight: bold;
    }

    tr:hover {
        background: #f8f9fa;
    }

    td {
        color: #34495e;
    }

    /* Action Icons */
    a {
        text-decoration: none;
        font-size: 18px;
        transition: 0.3s;
    }

    .bi-trash3 {
        color: #e74c3c;
        margin-right: 10px;
    }

    .bi-trash3:hover {
        color: #c0392b;
        transform: scale(1.1);
    }

    .bi-pencil-square {
        color: #2980b9;
    }

    .bi-pencil-square:hover {
        color: #1f618d;
        transform: scale(1.1);
    }

    /* Responsive Table */
    @media (max-width: 768px) {
        table {
            width: 100%;
        }

        th, td {
            padding: 10px;
            font-size: 14px;
        }

        .back-link {
            font-size: 14px;
            top: 10px;
            right: 10px;
        }
    }


    </style>
</head>
<body>
    <h6><a href="index.jsp" class="back-link">Home</a></h6>
    <h2>USER DETAILS</h2>
    <table border="1">
        <thead>
            <tr>
                <th>S.NO</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.firstName}</td>
                    <td>${item.lastName}</td>
                    <td>${item.email}</td>
                    <td>${item.phoneNumber}</td>
                    <td>
                        <a href="deleteUser?id=${item.id}"><i class="bi bi-trash3"></i></a> &nbsp;
                        <a href="editUser?id=${item.id}"><i class="bi bi-pencil-square"></i></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
