<%--
  Created by IntelliJ IDEA.
  User: Alphabet
  Date: 2017/11/9
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div>
    <form class="form-control">
        <label>用户名:</label>
        <input type="text" id="name" name="name" placeholder="用户名/邮箱/手机号"/>

        <label>密码:</label>
        <input type="password" id="password" name="password"/>

        <label>验证码:</label>
        <input type="submit" value="登录"/>
        <button value="注册"></button>
    </form>
</div>
</body>
</html>
