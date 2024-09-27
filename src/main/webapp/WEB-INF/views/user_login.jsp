<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Login Page</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh; /* Center the form vertically */
            margin: 0;
            background-color: #f4f4f4; /* Light background color */
            padding: 20px; /* Add padding to the body */
            box-sizing: border-box; /* Include padding in height calculations */
        }
        form {
            text-align: center;
            background-color: white; /* White background for the form */
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 100%; /* Responsive width */
            max-width: 300px; /* Maximum width */
            box-sizing: border-box; /* Include padding in width calculations */
        }
        input {
            width: calc(100% - 20px); /* Full width minus padding */
            padding: 10px; /* Add padding for input fields */
            margin-bottom: 10px; /* Space between inputs */
            border: 1px solid #ccc; /* Border for input fields */
            border-radius: 3px; /* Rounded corners */
        }
        input[type="submit"] {
            background-color: #5cb85c; /* Green background for submit button */
            color: white; /* White text color */
            border: none; /* No border */
            cursor: pointer; /* Pointer cursor on hover */
        }
        input[type="submit"]:hover {
            background-color: #4cae4c; /* Darker green on hover */
        }
        p {
            margin-top: 15px; /* Space above the paragraph */
        }
    </style>
</head>
<body>

    <form action="/businessOwner_Registration/login" method="post">
        <input type="text" name="username" placeholder="Username" required /><br/>
        <input type="password" name="password" placeholder="Password" required /><br/>
        <input type="submit" value="Submit" /><br/>
		<p><a href="/businessOwner_Registration/openRegistrationPage">Don't have an account? Register here</a></p>
    </form>
    
  
    
</body>
</html>
