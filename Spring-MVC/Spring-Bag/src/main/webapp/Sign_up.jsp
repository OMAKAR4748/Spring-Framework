<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bag Details</title>
    <style>body {
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

           input {
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
        <h2>Bag Details</h2>
        <form action="addBags" method="post" target="_blank">
            <label for="brand">Brand:</label>
            <input type="text" id="brand" name="brand" required><br>

            <label for="color">Color:</label>
            <input type="text" id="color" name="color" required><br>

            <label for="capacity">Capacity:</label>
            <input type="number" id="capacity" name="capacity" required><br>

            <label for="price">Price:</label>
            <input type="number" id="price" name="price" required><br>

            <button type="submit">Submit</button>
        </form>
        <a href="getAll" class="view-link">View All</a>
    </div>
</body>
</html>
