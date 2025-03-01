<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update User Details</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            background-size: cover;
            background-position: center;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            padding: 20px;
        }

        .update-form {
            background: rgba(255, 255, 255, 0.95);
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 6px 15px rgba(0, 0, 0, 0.2);
            text-align: center;
            max-width: 400px;
            width: 100%;
            animation: fadeIn 0.8s ease-in-out;
        }

        h2 {
            color: #2c3e50;
            font-size: 22px;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
            text-align: left;
        }

        label {
            font-size: 14px;
            font-weight: bold;
            color: #333;
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"] {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 16px;
            background: #f9f9f9;
            transition: border 0.3s ease-in-out;
        }

        input[type="text"]:focus {
            border-color: #27ae60;
            outline: none;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background: #27ae60;
            color: white;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background: #1e8449;
            transform: scale(1.05);
        }

        .back-link {
            display: block;
            margin-top: 15px;
            color: #2980b9;
            text-decoration: none;
            font-weight: bold;
            transition: 0.3s;
        }

        .back-link:hover {
            color: #1b4f72;
        }

        /* Fade-in animation */
        @keyframes fadeIn {
            from { opacity: 0; transform: scale(0.9); }
            to { opacity: 1; transform: scale(1); }
        }
    </style>
</head>
<body>

       <h2>${msg}</h2>
    <form action="updateData" method="post" class="update-form">
        <h2>Update Your Details</h2>

        <h2>${msg}

        <input type="hidden" value="${item.id}" name="id"/>

        <div class="form-group">
            <label for="firstName">First Name</label>
            <input type="text" id="firstName" name="firstName" placeholder="Enter your first name" value="${item.firstName}" required>
        </div>

        <div class="form-group">
            <label for="lastName">Last Name</label>
            <input type="text" id="lastName" name="lastName" placeholder="Enter your last name" value="${item.lastName}" required>
        </div>

        <div class="form-group">
            <label for="email">Email</label>
            <input type="text" id="email" name="email" placeholder="Enter your email" value="${item.email}" required>
        </div>

        <div class="form-group">
            <label for="phoneNumber">Phone Number</label>
            <input type="text" id="phoneNumber" name="phoneNumber" placeholder="Enter your phone number" value="${item.phoneNumber}" pattern="[0-9]{10}" required>
        </div>

        <input type="submit" value="Update">

        <a href="getAll" class="back-link">Back to User List</a>
    </form>
</body>
</html>
