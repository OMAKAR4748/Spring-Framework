<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <style>body {
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
               width: 300px;
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
           }

           button {
               margin-top: 15px;
               padding: 10px;
               background-color: #28a745;
               color: white;
               border: none;
               border-radius: 5px;
               cursor: pointer;
               font-size: 16px;
           }

           button:hover {
               background-color: #218838;
           }
</style>

</head>
<body>
    <div class="container">
        <h2>User Registration</h2>
        <form action="addUser" method="POST" target="_blank">

            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required>

            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="phoneNumber">Phone Number:</label>
            <input type="number" id="phoneNumber" name="phoneNumber" pattern="[0-9]{10}" required>

            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>
