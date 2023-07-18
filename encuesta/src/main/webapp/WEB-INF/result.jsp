<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
	<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<div class="container">
		<h1>Submitted Info</h1>
	    <p>Name: <c:out value="${name}"/></p>
	    <p>Dojo Location: <c:out value="${location}"/></p>
	    <p>Favorite Language: <c:out value="${language}"/>!!</p>
	    <p>Comment: <c:out value="${comment}"/></p>
	    <form action="/" method="post">
			<input type="submit" id="btn" value="Go Back">
		</form>
    </div>

</body>
</html>