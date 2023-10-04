<html>
<body>
<h2>Hello User!</h2>
<form action="GetPersonController">
	Get by person by id: <input type="text" name = "getPid">
			   		<input type="submit">
</form>
<form action="AddPersonController" method="POST">
	Add Person: <br>
	ID: 		<br><input type="number" name = "pid"><br>
	Name: 		<br><input type="text" name = "pname"><br>
	Password: 	<br><input type="password" name = "pass"><br><br>
	&emsp;&emsp;&emsp;<input type="submit" value="Add Person"/>
</form>
</body>
</html>
