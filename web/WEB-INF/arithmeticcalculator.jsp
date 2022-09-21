<%-- 
    Document   : arithmeticcalculator
    Created on : 20-Sep-2022, 6:09:53 PM
    Author     : sowmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <button type="submit" name="add" onclick="add()">+</button>
            <button type="submit" name="subtract" onclick="">-</button> 
            <button type="submit" name="multiply" onclick="">*</button>
            <button type="submit" name="remainder" onclick="">%</button>
            
        </form>
            <p>Result: ${message}</p>
            <a href="age">Age Calculator</a>
    </body>
</html>
