<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h3>List-of-Students-Using-JSTL</h3>
	<hr>
	<table border="2">

		<tr>
			<th>Employee-Number</th>
			<th>Employee-Name</th>
			<th>Bank-Name</th>
			<th>Account</th>
		<tr>
			<c:forEach var="employee" items="${employees}">
				<tr>
					<td>${employee.eno}</td>
					<td>${employee.name}</td>
					<td>${employee.bankName}</td>
					<td>${employee.amount}</td>
					<td><a href="delete?eno=${employee.eno}">[DELETE]</a></td>
					<td><a href="update?eno=${employee.eno}">[UPDATE]</a></td>
				</tr>
			</c:forEach>
	</table>


	<hr>
</body>
</html>