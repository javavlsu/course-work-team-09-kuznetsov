<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Список заявок</h1><hr>
<form action="/" method="get">
    Поиск по наименованию заявки: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list applications as application>
    <div>
        <p><b>${application.title}</b> ${application.name_post} | <a href="/application/${application.id}">Подробнее</a></p>
    </div>
    <#else>
    <h3>Заявок нет !</h3>
</#list>
<hr>
<h3>Создать новую заявку</h3>
<form action="/application/create" method="post">
    Наименование заявки: <input type="text" name="title"/><br><br>
    Наименование должности: <input type="text" name="name_post"/><br><br>
    Количество людей: <input type="number" name="number_people"/><br><br>
    Требования: <input type="text" name="requirements"/><br><br>
    Заработная плата: <input type="number" name="wage"/><br><br>
    График: <input type="text" name="schedule"/><br><br>
    Дата создания заявки: <input type="text" name="date_of_completion"/><br><br>
    <input type="submit" value="Добавить заявку"/>
</form>
</body>
</html>