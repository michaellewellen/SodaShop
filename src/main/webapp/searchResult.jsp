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
			<th> Soda Company/SodaBrand </th>
		</tr>
	<%
	
		
		List result=(List) request.getAttribute("result");
		Iterator it = result.iterator();
		while(it.hasNext()){
			out.println("<tr><td>" + it.next().toString() + "</td></tr>");
		}
	%>
	</table>
</center>
</body>
</html>	



