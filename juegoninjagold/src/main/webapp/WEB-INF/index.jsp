<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ninja Gold</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <div class="container">
		<h1>Your Gold: <input id="counter" type="text" name="myGold" placeholder="<c:out value="${gold}"/>"></h1>
        <div class="box-container">
            <div class="box">
                <h1>Farm</h1>
                <p>(Earn 10-20 gold)</p>
                <form action="/findgold" method="POST">
                    <input class="button is-warning" type="submit" value="Find Gold!">
                    <input type="hidden" name="place" value="farm">
                </form>
            </div>
            <div class="box">
                <h1>Cave</h1>
                <p>(Earn 5-10 gold)</p>
                <form action="/findgold" method="POST">
                    <input class="button is-warning" type="submit" value="Find Gold!">
                    <input type="hidden" name="place" value="cave">
                </form>
            </div>
            <div class="box">
                <h1>House</h1>
                <p>(Earn 2-5 gold)</p>
                <form action="/findgold" method="POST">
                    <input class="button is-warning" type="submit" value="Find Gold!">
                    <input type="hidden" name="place" value="house">
                </form>
            </div>
            <div class="box">
                <h1>Casino!</h1>
                <p>(Earn 0-50 gold)</p>
                <form action="/findgold" method="POST">
                    <input class="button is-danger" type="submit" value="Find Gold!">
                    <input type="hidden" name="place" value="casino">
                </form>
            </div>
        </div>
		<h2>Activities:</h2>
		<textarea id="activityTextArea" rows="10" cols="100"><%
		    List<String> activities = (List<String>) session.getAttribute("activities");
		    if (activities != null) {
		        Collections.reverse(activities);
		        String activitiesText = String.join("\n", activities);
		        out.print(activitiesText);
		    }
		%></textarea>
        <form action="/reset" method="post">
            <input type="submit" value="Reset">
        </form>
    </div>
</body>
</html>
