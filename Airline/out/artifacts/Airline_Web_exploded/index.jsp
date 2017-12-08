<!DOCTYPE html>
<html>
<head>index.jsp</head>
<meta charset="UTF-8">
<body>
<h2>Hello World!</h2>
    <a href ="AirlineServlet"> press me</a>

<%
    out.println("Your ip : " + request.getRemoteAddr());
%>
<p>Enter passenger aircraft</p>
<form action="AirlineServlet">
    <p>Enter name of plane</p>
    <p><input type="text" name ="aircraft_name"></p>
    <p>Enter number of passengers of plane</p>
    <p><input type="text" name ="aircraft_passengers"></p>
    <p>Enter volume of cargo of plane</p>
    <p><input type="text" name ="aircraft_cargo"></p>
    <p>Enter fly range of plane</p>
    <p><input type="text" name ="aircraft_flyRange"></p>
    <p>Enter fuel consumption of plane</p>
    <p><input type="text" name ="aircraft_fuel"></p>
    <p><input type="submit" value="SEND"> </p>
</form>
</body>
</html>
