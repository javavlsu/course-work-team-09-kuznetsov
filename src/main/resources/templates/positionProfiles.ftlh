<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Просмотр профилей должностей !</title>
</head>
<body>
<a href="/login">Войти</a>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Выйти">
</form>
<h1>Список профилей</h1><hr>

<#list positionProfiles as positionProfile>
    <div>
        <p><b>${positionProfile.name_post}</b> | ${positionProfile.description} | <a href="/positionProfile/${positionProfile.id}">Подробнее</a></p>
    </div>
</#list>
<hr>
<h3>Создать новый профиль должности:</h3>
<form action="/positionProfile/create" method="post" enctype="multipart/form-data">
    Наименование должности: <input type="text" name="name_post"/><br><br>
    Описание: <input type="text" name="Description"/><br><br>
    Заработная плата: <input type="number" name="Wage"/><br><br>
    График: <input type="text" name="Schedule"/><br><br>
    Требования: <input type="text" name="Requirements"/><br><br>
    Опыт работы: <input type="text" name="Experience"/><br><br>
    Первая фотография: <input type="file" name="file1"/><br><br>
    Вторая фотография: <input type="file" name="file2"/><br><br>
    Третья фотография: <input type="file" name="file3"/><br><br>
    <input type="submit" value="Добавить профиль должности"/>
</form>
</body>
</html>