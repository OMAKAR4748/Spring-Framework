<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Details</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
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
           background: linear-gradient(135deg, #56ab2f, #a8e063);
           display: flex;
           justify-content: center;
           align-items: center;
           height: 100vh;
           padding: 20px;
       }

       /* Form Container */
       .container {
           background: rgba(255, 255, 255, 0.95);
           padding: 30px;
           border-radius: 12px;
           box-shadow: 0 6px 15px rgba(0, 0, 0, 0.2);
           text-align: center;
           max-width: 400px;
           width: 100%;
           animation: fadeIn 0.8s ease-in-out;
       }

       /* Heading */
       h2 {
           color: #2c3e50;
           font-size: 24px;
           font-weight: bold;
           margin-bottom: 15px;
       }

       /* Home Link */
       h3 {
           margin-bottom: 15px;
       }

       .back-link {
           text-decoration: none;
           font-weight: bold;
           font-size: 16px;
           color: #e74c3c;
           transition: all 0.3s ease;
       }

       .back-link:hover {
           color: #c0392b;
       }

       /* Form */
       .form-group {
           margin-bottom: 15px;
           text-align: left;
       }

       input[type="text"], input[type="submit"] {
           width: 100%;
           padding: 12px;
           border: 1px solid #ccc;
           border-radius: 6px;
           font-size: 16px;
           transition: border 0.3s ease-in-out;
       }

       input[type="text"] {
           background: #f9f9f9;
       }

       input[type="text"]:focus {
           border-color: #27ae60;
           outline: none;
       }

       /* Submit Button */
       input[type="submit"] {
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

       /* View Users Link */
       .view-link {
           display: inline-block;
           margin-top: 15px;
           color: #2980b9;
           text-decoration: none;
           font-size: 16px;
           font-weight: bold;
           transition: all 0.3s ease;
       }

       .view-link:hover {
           color: #1b4f72;
       }

       /* Animations */
       @keyframes fadeIn {
           from { opacity: 0; transform: translateY(-10px); }
           to { opacity: 1; transform: translateY(0); }
       }

    </style>
</head>
<body>

    <div class="container">
        <h2>Enter Your Details</h2>
        <h3><a href="home.jsp" class="back-link">Home</a></h3>
        <form action="userPage" method="post">
            <div class="form-group">
                <input type="text" name="firstName" placeholder="Enter Your First Name" required>
            </div>
            <div class="form-group">
                <input type="text" name="lastName" placeholder="Enter Your Last Name" required>
            </div>
            <div class="form-group">
                <input type="text" name="email" placeholder="Enter Your Email ID" required>
            </div>
            <div class="form-group">
                <input type="text" name="phoneNumber" placeholder="Enter Your phone Number" required>
            </div>
            <input type="submit" value="Confirm">
        </form>
        <a href="getAll" class="view-link">View All Users</a>
    </div>

</body>
</html>
