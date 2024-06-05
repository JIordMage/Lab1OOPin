<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Тригонометрический калькулятор</title>
</head>
<body>
<h2>Тригонометрический калькулятор</h2>
<form action="trigonometry-servlet" method="post">
    <label for="function">Выберите функцию:</label>
    <select name="function" id="function">
        <option value="sin">Sin</option>
        <option value="cos">Cos</option>
        <option value="tan">Tan</option>
    </select><br><br>
    <label for="angle">Введите значение угла:</label>
    <input type="text" name="angle" id="angle"><br><br>
    <label for="precision">Введите точность:</label>
    <input type="text" name="precision" id="precision" value="2"><br><br>
    <input type="submit" value="Calculate">
</form>
</body>
</html>