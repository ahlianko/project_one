
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
</head>
<meta charset="UTF-8">
<body>
    <h2 align="center">Airlines</h2>
    <form  align="center" action="ShowAirlineServlet">
        <p><input  align="center" type="submit" value="Show All Planes"></p>
    </form>
    <br>
    <br>
    <p>Enter passenger aircraft</p>
    <form width="flex" class="form-inline" action="AirlineServlet">
        <p>Enter name of plane</p>
        <p><input type="text" name="aircraft_name"></p>
        <p>Enter number of passengers of plane</p>
        <p><input type="text" name="aircraft_passengers"></p>
        <p>Enter volume of cargo of plane</p>
        <p><input type="text" name="aircraft_cargo"></p>
        <p>Enter fly range of plane</p>
        <p><input type="text" name="aircraft_flyRange"></p>
        <p>Enter fuel consumption of plane</p>
        <p><input type="text" name="aircraft_fuel"></p>
        <p><input type="submit" value="SEND"></p>
    </form>

    <br>
    <br>
    <p>Enter the range for fuel consumtion to display</p>
    <form class="form-inline" action="FuelConsumptionServlet">
        <p>Enter minimum of fuel cosumption</p>
        <p><input type="text" name="fuel_min"></p>
        <p>Enter maximum of fuel cosumption</p>
        <p><input type="text" name="fuel_max"></p>
        <p><input type="submit" value="SEND"></p>
    </form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
        integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"
        integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
        crossorigin="anonymous"></script>
</body>
</html>
