<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Подбор персонала</title>
</head>
<body>
<#list images as img>
    <img src="/images/${img.id}" height="60px"/><br><br>
</#list>

<h3>Подробная информация о профиле должности</h3>
    <b>Наименование должности: </b> ${positionProfile.name_post}<br>
    <b>Описание: </b> ${positionProfile.description}<br>
    <b>Заработная плата: </b> ${positionProfile.wage}<br>
    <b>График: </b> ${positionProfile.schedule}<br>
    <b>Требования: </b> ${positionProfile.requirements}<br>
    <b>Опыт: </b> ${positionProfile.experience}<br>
<hr>
<form action="/positionProfile/delete/${positionProfile.id}" method="post">
    <input type="submit" value="Удалить профиль"/>
</form>
</body>
</html>