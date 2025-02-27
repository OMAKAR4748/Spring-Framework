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
        <li><a href="#">Home</a></li>
        <li><a href="Sign_up.jsp">Sign Up</a></li>
        <li><a href="getAll">View All</a></li>
        <li><a href="updatePage.jsp">Update</a></li>
    </nav>

</body>
</html>
