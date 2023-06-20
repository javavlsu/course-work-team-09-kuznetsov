<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Отдел подбора</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"
</head>
<body style="margin-left:10%; margin-right:10%">
<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a style="text-decoration: none" href="/">
            <span class="navbar-brand mb-0 h1">Отдел подбора</span>
        </a>
        <#if user.email??>
        <div class="dropdown text-end">
            <#if user.isAdmin()>
            <a href="/profile">
                <img src="/static/images/avatar3.jpg" alt="mdo"
                     width="32" height="32" class="rounded-circle">
            </a>
        </#if>
        <#if user.isRecruter()>
        <a href="/profile">
            <img src="/static/images/avatar2.JPG" alt="mdo"
                 width="32" height="32" class="rounded-circle">
        </a>
    </#if>
    <#if user.isDirector()>
    <a href="/profile">
        <img src="/static/images/avatar5.jpg" alt="mdo"
             width="32" height="32" class="rounded-circle">
    </a>
</#if>
<#if user.isDepartmentHead()>
<a href="/profile">
    <img src="/static/images/avatar6.JPG" alt="mdo"
         width="32" height="32" class="rounded-circle">
</a>
</#if>
<#if user.isApplicant()>
<a href="/profile">
    <img src="/static/images/avatar4.jpg" alt="mdo"
         width="32" height="32" class="rounded-circle">
</a>
</#if>
<#if user.isUser()>
<a href="/profile">
    <img src="/static/images/avatar.png" alt="mdo"
         width="32" height="32" class="rounded-circle">
</a>
</#if>
</div>
<#else>
<button class="btn btn-light my-2 my-sm-0" type="button"
        onclick="window.location.href = '/login'">
    Войти
</button>
</#if>
</div>
</nav>
<hr>
<#if user.isRecruter()>
<hr>
<#list treatys as treaty>
<div class="list-group">
    <p><b>${treaty.id}</b> ${treaty.name_post} | <a href="/treaty/${treaty.id}">Подробнее...</a></p>
</div>
<#else>
<h3>Заявок нет !</h3>
</#list>
</#if>
<hr>
<h2>Оформить договор</h2><hr>
<form action="/treaty/create" method="post" enctype="multipart/form-data">
    <div class="form-group">
        <label for="name_post">Наименование должности</label>
        <input type="text" required class="form-control"
               id="name_post" name="name_post">
    </div>
    <div class="form-group">
        <label for="fio">ФИО</label>
        <input type="text" required class="form-control"
               id="fio" name="fio">
    </div>
    <div class="form-group">
        <label for="StatusTreaty">Статус договора</label>
        <input type="text" required class="form-control"
               id="StatusTreaty" name="StatusTreaty">
    </div>
    <div class="form-group">
        <label for="PersonalData">Персональные данные (паспорт и т.д)</label>
        <textarea required class="form-control" id="PersonalData" name="PersonalData"></textarea>
    </div>
    <div class="form-group">
        <label for="Wage">Заработная плата</label>
        <div class="input-group mb-3">
            <input type="number" required class="form-control" id="Wage" name="Wage">
            <div class="input-group-append">
                <span class="input-group-text">₽</span>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label for="date_of_conclusion">Дата заключения</label>
        <div class="input-group mb-3">
            <input type="text" required class="form-control" id="date_of_conclusion" name="date_of_conclusion">
        </div>
    </div>

    <input type="hidden" name="_csrf" value="${_csrf.token}"/>

    <button type="submit" style="width: 100%" class="btn btn-dark">Добавить</button>
</form>
<hr>
<br>
<a href="/positionProfile">Вернуться назад</a>
</body>
</html>