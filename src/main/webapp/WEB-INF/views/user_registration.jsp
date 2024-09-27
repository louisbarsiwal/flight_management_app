<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh; /* Use min-height for better centering */
            margin: 0;
            background-color: #f4f4f4;
            padding: 20px; /* Add padding to the body */
            box-sizing: border-box; /* Include padding in height calculations */
        }
        .registration-container {
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 100%; /* Make the form responsive */
            max-width: 400px; /* Set a maximum width */
            box-sizing: border-box; /* Include padding in width calculations */
        }
        .registration-container label {
            display: block;
            margin-bottom: 5px;
        }
        .registration-container input {
            width: calc(100% - 22px); /* Account for padding and border */
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        .gender-container {
            margin-bottom: 15px;
        }
        .gender-container label {
            display: inline-block;
            margin-right: 10px;
        }
        .registration-container button {
            width: 100%;
            padding: 10px;
            background-color: #5cb85c;
            color: white;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        .registration-container button:hover {
            background-color: #4cae4c;
        }
    </style>
</head>
<body>

<div class="registration-container">
	<form action="/businessOwner_Registration/register" method="post" enctype="multipart/form-data">

        <label for="firstname">First Name:</label>
        <input type="text" id="firstname" name="firstName" required>

        <label for="lastname">Last Name:</label>
        <input type="text" id="lastname" name="lastName" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="emailId" required>

        <label for="mobile">Mobile Number:</label>
        <input type="tel" id="mobile" name="mobileNo" required>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dateOfBirth" required>

        <div class="gender-container">
            <label>Gender:</label>
            <label><input type="radio" name="gender" value="male" required> Male</label>
            <label><input type="radio" name="gender" value="female"> Female</label>
            <label><input type="radio" name="gender" value="other"> Other</label>
        </div>

        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>

        <label for="newpassword">New Password:</label>
        <input type="password" id="newpassword" name="password" required>

        <label for="image">Upload Image:</label>
		<input type="file" name="profileImage" accept=".jpg, .jpeg, .png, .pdf" required>

        <button type="submit" value="submit">Register</button>
		
    </form>
</div>

</body>
</html>
