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
        <form action="/result" method="post">
            <div class="form-row">
                <label>Your name: </label>
                <input type="text" id="fname" name="name"><br>
            </div>

            <div class="form-row">           
                <label>Dojo Location: </label>
                <select name="location" id="opcion">
                    <option value="San Jose">San Jose</option>
                    <option value="cuartel general">cuartel general</option>
                    <option value="Pueblo Paleta">Pueblo Paleta</option>
                    <option value="sur de California">sur de California</option>
                    <option value="Namekusei">Namekusei</option>
                </select><br></div>
 
            <div class="form-row">
            <label>Favorite Language: </label>
            <select id="opcion" name="language">
                <option value="Python">Python</option>
                <option value="c++">c++</option>
                <option value="Java">Java</option>
                <option value="Javascript">Javascript</option>
                <option value="Ruby">Ruby</option>
            </select><br>
            </div>
          
            <label>Comment (optional):</label><br>
            <textarea id="desc" cols='55' rows='8' name="comment"></textarea><br>
            <input type="submit" id="btn" value="Button">
        </form> 
    </div>
</body>
</html>