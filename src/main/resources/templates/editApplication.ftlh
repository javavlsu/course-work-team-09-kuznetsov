<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Подбор персонала</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/shards.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
<div class="container my-5">
    <h2 class="mb-5">Обновление данных заявки</h2>
    <div class="row">
        <div class="col-md-6">
            <form action="/update/${application.id}" method="post" object="${application}">
                <div class="row">
                    <div class = "form-group">
                        <label for="title">Наименование заявки</label>
                        <input type="text" class="form-control" id="title"/>
                    </div>
                    <div class = "form-group">
                        <label for="name_post">Наименование должности</label>
                        <input type="text" class="form-control" id="name_post"/>
                    </div>
                    <div class = "form-group">
                        <label for="number_people">Количество людей</label>
                        <input type="number" class="form-control" id="number_people"/>
                    </div>
                    <div class = "form-group">
                        <label for="wage">Заработная плата</label>
                        <input type="number" class="form-control" id="wage"/>
                    </div>
                    <div class = "form-group">
                        <label for="schedule">График</label>
                        <select id="schedule" required name="schedule" class="form-control">
                            <option value="">График не выбран</option>

                            <option value="1/3">График: 1/3</option>
                            <option value="2/2">График: 2/2</option>
                            <option value="2/4">График: 2/4</option>
                        </select>
                    </div>
                    <div class = "form-group">
                        <label for="date_of_completion">Дата заключения</label>
                        <input type="text" class="form-control" id="date_of_completion"/>
                    </div>
                    <div class = "form-group">
                        <label for="result_visirovanya">Результат визирования</label>
                        <select id="result_visirovanya" required name="result_visirovanya" class="form-control">
                            <option value="">Выберите состояние заявки:</option>

                            <#if user.isDepartmentHead()>
                                <option value="1/3">Отправлена на визирование!</option>
                            </#if>
                            <#if user.isDirector()>
                                <option value="2/2">Визирована!</option>
                            </#if>
                    </select>
                    </div>
                <div class="row">
                    <div class="col-md-6 mt-5">
                        <input type="submit" class="btn btn-primary" value="Обновить данные">
                    </div>
                </div>
                </div>
            </form>
        </div>
    </div>
</div>
<a href="/application">Вернуться назад</a>
</body>
</html>