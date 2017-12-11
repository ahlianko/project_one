<!DOCTYPE html>
<html>

<meta charset="UTF-8">
<body>
<h2>Airlines</h2>
    <a href ="AirlineServlet">Link to servlet</a>

<form action="ShowAirlineServlet">
    <p><input type="submit" value="Show All Planes"></p>
</form>

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
    <p><input type="submit" value="SEND"></p>
</form>

</body>
</html>
