<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Подбор персонала</title>
    </head>
<body>
<h3>Подробная информация о заявке</h3>
    <b>Наименование заявки: </b> ${application.title}<br>
    <b>Наименование должности: </b> ${application.name_post}<br>
    <b>Количество людей: </b> ${application.number_people}<br>
    <b>Требования: </b> ${application.requirements}<br>
    <b>Заработная плата: </b> ${application.wage}<br>
    <b>График: </b> ${application.schedule}<br>
    <b>Дата создания заявки: </b> ${application.date_of_completion}<br>
<hr>
<form action="/application/delete/${application.id}" method="post">
    <input type="submit" value="Удалить заявку"/>
</form>
</body>
</html>