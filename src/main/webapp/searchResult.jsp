<%@ page import = "java.util.*"%>
<!DOCTYPE html>
<html>
<body>
<center>
<style>
table, th, td {
	border: 1px solid black;
}
th, td {
	padding: 15px;
}
</style>
	<h1>Search Results<\h1>
	<table>
		<tr>
			<th> Soda Company </th>
			<th> Soda Brand </th>
		</tr>
	<%
	
		
	{
		List result=(List) request.getAtribute("brands");
		Iterator it = result.iterator();
		out.print("<tr><td>PEPSICO</td><td>Mountain Dew</td></tr>");
		out.print("<tr><td>COCACOLA</td><td>Sprite</td></tr>");
//		out.print("<tr><td>"+it.next()+"</td><td>"=it.next()+"</td></tr>");
	}
	%>
	</table>
</center>
</body>
</html>	



