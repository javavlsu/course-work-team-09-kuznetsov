<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Отдел подбора</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"
</head>
<body style="margin-left:25%; margin-right:25%">
<h2>Список существующих заявок:</h2><hr>
<form action="/application" method="get">
    Поиск по наименованию заявки: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<hr>
<#list applications as application>
    <div class="list-group">
        <p><b>${application.title}</b> ${application.name_post} | <a href="/application/${application.id}">Подробнее...</a></p>
    </div>
    <#else>
    <h3>Заявок нет !</h3>
</#list>
<hr>
</body>
</html>