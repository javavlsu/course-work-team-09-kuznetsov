<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"
    <meta charset="UTF-8">
    <title>Отдел подбора</title>
</head>
<body>
<hr>
<h4>Панель администратора</h4>
<table class="table">
    <thead class="thead-light">
    <tr>
        <th scope="col">Email</th>
        <th scope="col">Номер телефона</th>
        <th scope="col">Активность</th>
        <th scope="col">Роли</th>
        <th scope="col">Бан</th>
        <th scope="col">Редактирование</th>
    </tr>
    </thead>
    <#list users as user>
    <tr>
        <th>${user.email}</th>
        <th>${user.numberPhone}</th>
        <th><#if user.active>true<#else>false</#if></th>
        <th><#list user.roles as role>${role}</#list></th>
        <th>
            <form action="/admin/user/ban/${user.id}" method="post">
                <input type="hidden" name="_csrf" value="${_csrf.token}">
                <input type="submit" value="Бан">
            </form>
        </th>
        <th><a href="/admin/user/edit/${user.id}">Назначить роль</a></th>
    </tr>
    <#else>
    <h3>Пользователей нет</h3>
</#list>
</table>
</body>
</html>