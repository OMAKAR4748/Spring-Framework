<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home | User Management</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css">
    <style>/* Reset and Base Styles */
           * {
               margin: 0;
               padding: 0;
               box-sizing: border-box;
               font-family: 'Poppins', sans-serif;
           }

           /* Header - Navigation Bar */
           header {
               display: flex;
               justify-content: space-between;
               align-items: center;
               padding: 15px 10%;
               background: #2c3e50;
               box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
           }

           .logo {
               font-size: 24px;
               font-weight: bold;
               color: #fff;
           }

           .logo span {
               color: #27ae60;
           }

           nav ul {
               list-style: none;
               display: flex;
               gap: 20px;
           }

           nav ul li {
               display: inline;
           }

           nav ul li a {
               text-decoration: none;
               color: #fff;
               font-size: 16px;
               padding: 8px 12px;
               transition: all 0.3s ease-in-out;
           }

           nav ul li a:hover, .active {
               background: #27ae60;
               border-radius: 5px;
               padding: 8px 12px;
           }

           /* Hero Section */
           .hero {
               display: flex;
               justify-content: center;
               align-items: center;
               height: 90vh;
               background: linear-gradient(135deg, #56ab2f, #a8e063);
               text-align: center;
               padding: 20px;
           }

           .hero-content {
               color: white;
               max-width: 600px;
               animation: fadeIn 1s ease-in-out;
           }

           .hero-content h1 {
               font-size: 36px;
               margin-bottom: 10px;
           }

           .hero-content p {
               font-size: 18px;
               margin-bottom: 20px;
           }

           .btn {
               display: inline-block;
               padding: 12px 20px;
               background: #2c3e50;
               color: white;
               text-decoration: none;
               font-size: 16px;
               font-weight: 500;
               border-radius: 8px;
               transition: all 0.3s ease;
           }

           .btn:hover {
               background: #1a252f;
               transform: scale(1.05);
           }

           /* Footer */
           footer {
               background: #2c3e50;
               color: white;
               text-align: center;
               padding: 10px 0;
               font-size: 14px;
           }

           /* Animations */
           @keyframes fadeIn {
               from { opacity: 0; transform: translateY(-10px); }
               to { opacity: 1; transform: translateY(0); }
           }
</style>
</head>
<body>
    <!-- Navigation Bar -->
    <header>
        <div class="logo">User <span>Management</span></div>
        <nav>
            <ul>
                <li><a href="index.jsp" class="active">Home</a></li>
                <li><a href="getAll">View Users</a></li>
            </ul>
        </nav>
    </header>

    <!-- Hero Section -->
    <section class="hero">
        <div class="hero-content">
            <h1>Welcome to User Management System</h1>
            <p>Effortlessly manage users, update details, and view records in a seamless experience.</p>
            <a href="Sign_up.jsp" class="btn">Get Started</a>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <p>&copy; 2025 User Management. All Rights Reserved.</p>
    </footer>
</body>
</html>
