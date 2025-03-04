<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Account Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
        }

        .container {
            width: 40%;
            margin: 50px auto;
            background: white;
            padding: 20px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        h2 {
            color: #333;
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        label {
            font-size: 16px;
            margin-top: 10px;
            display: block;
            text-align: left;
            width: 100%;
        }

        input, select {
            width: 90%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button {
            margin-top: 15px;
            padding: 10px 15px;
            background-color: #007BFF;
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
        <h2>Bank Account Details</h2>
        <form action="addUser" method="post">
            <label for="accountNumber">Account Number:</label>
            <input type="text" id="accountNumber" name="accountNumber" pattern="{11}"required><br>

            <label for="accountHolderName">Account Holder Name:</label>
            <input type="text" id="accountHolderName" name="accountHolderName" required><br>

            <label for="balance">Balance:</label>
            <input type="text" id="balance" name="balance" required><br>

            <label for="accountType">Account Type:</label>
            <select id="accountType" name="accountType" required>
                <option value="#"></option>
                <option value="Savings">Savings</option>
                <option value="Current">Current</option>
            </select><br>

            <button type="submit">Submit</button>
        </form>
        <br>
        <a href="viewAll" class="view-link">View All Users</a>
    </div>
</body>
</html>