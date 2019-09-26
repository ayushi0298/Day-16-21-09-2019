<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<h3>Student Entry Form</h3>
	<hr>
	<form:form action="insertconfirm" modelAttribute="employee">
		<pre>
		Employee-no	<form:input path="eno"/>  <form:errors path="eno"/>
		Employee-Name	<form:input path="name"/>	 <form:errors path="name"/> 
		Bank-Name	<form:input path="bankName"/>   <form:errors path="bankName"/>
		Amount    <form:input path="amount"/>   <form:errors path="amount"/>
			
			<input type="submit" value="Save" />
		</pre>

	</form:form>
	<hr>

</body>
</html>
