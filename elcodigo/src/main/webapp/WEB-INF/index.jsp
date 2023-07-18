<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Secret Code</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2 id="msj"><c:out value="${error}"/></h2>
    <h2>What is the code?</h2>
    <div class="formulario">
        <form action="/code" method="post">
            <input type="text" id="fname" name="code"><br><br>
            <input type="submit" id="btn" value="Try Code">
          </form> 
    </div>
</body>
</html>