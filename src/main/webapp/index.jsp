<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
   <head>
      <title>Главная</title>
   </head>
   <body>
   <h1>Добро пожаловать!</h1>
   <h3>Выберите страницу на которую хотите перейти:</h3>
   <a href='${pageContext.request.contextPath}/acter/departmentHead'>
      <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer;" type="button">Перейти на страницу руководителя</button>
   </a>
   <a href='${pageContext.request.contextPath}/acter/Applicant'>
      <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer; margin-left: 10px;" type="button">Перейти на страницу соискателя</button>
   </a>
   <a href='${pageContext.request.contextPath}/acter/Recruiter'>
      <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer; margin-left: 10px;" type="button">Перейти на страницу рекрутера</button>
   </a>
   <a href='${pageContext.request.contextPath}/acter/Director'>
      <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer; margin-left: 10px;" type="button">Перейти на страницу директора</button>
   </a>
   <a href='${pageContext.request.contextPath}/acter/SecurityOfficer'>
      <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer; margin-left: 10px;" type="button">Перейти на страницу сотрудника СБ</button>
   </a>
   <a href='${pageContext.request.contextPath}/acter/Administrator'>
      <button style="background: #fdeaa8; width: 120px; height: 40px; border-radius: 5px; box-shadow: 0px 1px 3px; font-size: 10px; cursor: pointer; margin-left: 10px;" type="button">Перейти на страницу Администратора</button>
   </a>
</body>
</html>