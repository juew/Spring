<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2017/5/12
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<%--随便定义了一个表单,action是想后台访问的地址,就是之前在PersonalSignController类中,success方法注解里定义的访问路径,method是请求方式--%>
<form action="/two" method="post">
    <%--定义了一个输入框来接受用户输入的数据--%>
    <p>输入参数：<input type="text" name="test"/></p>
    <p><button type="submit">提交</button></p>
</form>
</body>
</html>
