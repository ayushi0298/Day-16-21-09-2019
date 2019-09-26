<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<h3>Student Entry Form</h3>
	<hr>
	<form:form action="up" modelAttribute="updates">
		<pre>
		Employee-no	<form:input path="eno"/>	
		Employee-Name	<form:input path="name"/>	
		Bank-Name	<form:input path="bankName"/>
		Amount    <form:input path="amount"/>  
			
			<input type="submit" value="Save" />
		</pre>

	</form:form>
	<hr>

</body>
</html>
