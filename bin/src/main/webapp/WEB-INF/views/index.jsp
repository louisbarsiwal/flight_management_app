<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="CSS/index.css">
</head>
<body>

<div class="header" id="header">
  <button class="openbtn" onclick="openNav()">☰</button>
  <span id="companyName">XYZ FLIGHTS</span>
  <div class="profile-icon" onclick="toggleDropdown()">
    <img src="images/profile-icon.png" alt="Profile Icon">
    <div id="dropdown" class="dropdown-content">
      <a href="/user/openLoginPage">Business Owner</a>
      <a href="#flightManager">Flight Manager</a>
      <a href="#customer">Customer</a>
    </div>
  </div>
</div>

<div id="mySidebar" class="sidebar">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
  <a href="#addFlight">ADD FLIGHT</a>
  <a href="#deleteFlight">DELETE FLIGHT</a>
  <a href="#addAirline">ADD AIRLINE</a>
  <a href="#displayFlight">DISPLAY FLIGHT</a>
  <a href="#bookFlight">BOOK A FLIGHT</a>
</div>

<div id="main">
  <div class="booking-form">
    <form>
      <select name="source" required>
        <option value="" disabled selected>Source</option>
        <option value="New Delhi">New Delhi</option>
        <option value="Mumbai">Mumbai</option>
        <!-- Add more options as needed -->
      </select>

      <select name="destination" required>
        <option value="" disabled selected>Destination</option>
        <option value="New Delhi">New Delhi</option>
        <option value="Mumbai">Mumbai</option>
        <!-- Add more options as needed -->
      </select>

      <select name="tripType" id="tripType" onchange="toggleReturnDate()" required>
        <option value="oneway">One Way</option>
        <option value="return">Return</option>
      </select>

      <input type="date" name="departureDate" id="departureDate" required>
      <input type="date" name="returnDate" id="returnDate" style="display:none;">

      <input type="number" name="passengers" min="1" value="1" placeholder="Adults" required>

      <select name="class" required>
        <option value="economy">Economy</option>
        <option value="business">Business</option>
      </select>

      <button type="submit">Search</button>
    </form>
  </div>
</div>

<script>
function openNav() {
  document.getElementById("mySidebar").style.display = "block";
  document.getElementById("header").style.marginLeft = "250px";
  document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
  document.getElementById("mySidebar").style.display = "none";
  document.getElementById("header").style.marginLeft = "0";
  document.getElementById("main").style.marginLeft = "0";
}

function toggleDropdown() {
  document.getElementById("dropdown").classList.toggle("show");
}

function toggleReturnDate() {
  var tripType = document.getElementById("tripType").value;
  var returnDate = document.getElementById("returnDate");
  if (tripType === "return") {
    returnDate.style.display = "inline-block";
  } else {
    returnDate.style.display = "none";
  }
}

function setMinDate() {
  var today = new Date().toISOString().split('T')[0];
  document.getElementById("departureDate").setAttribute('min', today);
  document.getElementById("returnDate").setAttribute('min', today);
}

window.onload = setMinDate;

window.onclick = function(event) {
  if (!event.target.matches('.profile-icon img')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    for (var i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>

</body>
</html>
