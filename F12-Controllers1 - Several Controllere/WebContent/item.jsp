<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

	<p><a href="viewshoppinglist">Back to shoppinglist</a></p>
	
    <p>Id: ${item.id}</p>
    <p>Name: ${item.name}</p>
    <p>Price: ${item.price}</p>
    <p>Description: ${item.description}</p>

	<p><a href="updateitem?id=${item.id}">Update item</a></p>

</body>
</html>
