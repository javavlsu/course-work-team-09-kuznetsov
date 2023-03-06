<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
</head>
<body>
    <h1>Добро пожаловать на страницу соискателя!</h1>
    <h2>Выберите действие:</h2>

    <a href='${pageContext.request.contextPath}/Applicant/CreatingQuestionnaire'>
        <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer;" type="button">Создать анкету</button>
     </a>
     <a href='${pageContext.request.contextPath}/Applicant/profileSearchPost'>
        <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer;" type="button">Поиск профиля должности</button>
     </a>
</body>
</html>