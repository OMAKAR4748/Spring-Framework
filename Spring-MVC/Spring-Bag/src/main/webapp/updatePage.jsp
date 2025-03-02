<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration Update</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
            width: 350px;
            text-align: center;
        }

        h2 {
            color: #333;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            text-align: left;
            font-weight: bold;
            margin-top: 10px;
        }

        input {
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 100%;
        }

        button {
            margin-top: 15px;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>${msg}</h2>
        <h2>Update Details</h2>
        <form action="updateData" method="POST">
            <input type="hidden" id="id" name="id" value="${item.id}">
            <label for="brand">Brand:</label>
            <input type="text" id="brand" name="brand" value="${item.brand}" required>

            <label for="color">Color:</label>
            <input type="text" id="color" name="color" value="${item.color}" required>

            <label for="capacity">Capacity:</label>
            <input type="text" id="capacity" name="capacity" value="${item.capacity}" required>

            <label for="price">Price:</label>
            <input type="text" id="price" name="price" value="${item.price}" required>

            <button type="submit">Update</button>
        </form>

    </div>
</body>
</html>
