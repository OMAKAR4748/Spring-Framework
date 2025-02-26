<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
    <%@ page isELIgnored="false" %><!DOCTYPE html>
<html>
<head>
    <title>Index Page</title>
    <style>
     nav {
         background-color: #333;
         overflow: hidden;
     }

     nav li {
         float: left;
         list-style-type: none;
     }

     nav li a {
         display: block;
         color: white;
         text-align: center;
         padding: 14px 20px;
         text-decoration: none;
     }

     nav li a:hover {
         background-color: #111;
     }

    </style>

</head>
<body>

    <nav>
        <li><a href="Sign_up.jsp">Sign Up</a></li>
        <li><a href="viewAll">View All Users</a></li>
        <li><a href="updateUser">Update User</a></li>
    </nav>

</body>
</html>
