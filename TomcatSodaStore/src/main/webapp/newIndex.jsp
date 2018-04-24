<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Soda Store</title>
</head>
<body>
<center>
<style>
table, th, td {
	border: 1px solid black;
}
th, td{
	padding: 15px;
}
</style>
	<h2>Search for your soda</h2>

	<form method="post" action="SearchResult">
		<br>
		<input type="search" name="search">

	</form>

	<h2>or Select a Soda Company</h2>
	<form method="post" action="SelectSoda">
		<br>
		
		<select name="Type" size="1">
		<%
			List result= (List) request.getAttribute("Company");
			Iterator it = result.iterator();
			while(it.hasNext()){
				out.println("<option>"+it.next()+"</option>");
			}
		%>
		</select>
		<br><br>
		<input type="submit">
	</form>
</center>
</body>
</html>
