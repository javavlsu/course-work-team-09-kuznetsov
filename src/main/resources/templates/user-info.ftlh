<!DOCTYPE html>
<html>
<head>
    <title>����� �������</title>
</head>
<body>
<h1>����� �������</h1><hr>
<h3>��������� ���������� � ������������ ${user.name}</h3>
<b>����� ��������: </b> ${user.phoneNumber}<br>
<b>Email: </b> ${user.email}<br>
<h4>������ ������������ ${user.name}</h4>
<#list products as product>
<div>
    <p><b>${product.title}</b> ${product.price} ���. | <a href="/product/${product.id}">���������...</a></p>
</div>
<#else>
<h3>������� ���</h3>
</#list>
<#if errorMessage??>
<h2 style="color: red">${errorMessage}</h2>
</#if>
</body>
</html>