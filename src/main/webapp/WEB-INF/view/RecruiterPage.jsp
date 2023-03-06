<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
</head>
<body>
    <h1>Добро пожаловать на страницу рекрутера!</h1>
    <h2>Выберите действие:</h2>

    <a href='${pageContext.request.contextPath}/Recruiter/ApplicationAnalysis'>
        <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer;" type="button">Анализирование заявок</button>
     </a>
     <a href='${pageContext.request.contextPath}/Recruiter/ResumeCheck'>
        <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer;" type="button">Проверка резюме</button>
     </a>
     <a href='${pageContext.request.contextPath}/Recruiter/SendingQuestionnairesToSecurityService'>
        <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer;" type="button">Отправка анкет в СБ</button>
     </a>
     <a href='${pageContext.request.contextPath}/Recruiter/FormationProfilesPost'>
        <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer;" type="button">Формирование профилей должностей</button>
     </a>
     <a href='${pageContext.request.contextPath}/Recruiter/ExecutionTreaty'>
        <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer;" type="button">Оформление договора</button>
     </a>
</body>
</html>