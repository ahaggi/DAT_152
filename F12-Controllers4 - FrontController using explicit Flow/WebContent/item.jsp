<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

	<p><a href="viewshoppinglist">Back to shopping list</a></p>
	
    <p>Id: ${item.id}</p>
    <p>Nane: ${item.name}</p>
    <p>Price: ${item.price}</p>
    <p>Description: ${item.description}</p>

	<p><a href="updateitemform?id=${item.id}">Update item</a></p>

</body>
</html>