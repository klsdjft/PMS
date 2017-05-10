<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2017/5/6
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="slogin" action="/pms/slogin" method="post">
    <label for="snumber">学号：</label> <input type="text" required id="snumber" name="snumber"><br>
    <label for="spassword">密码：</label> <input type="password" required id="spassword" name="spassword"><br>
    <input type="submit" value="登录">
    <input type="button" value="注册" onclick="location.href='/pms/sregister'">
</form>
</body>
<script>

    //对应后台返回的提示
    if ('${result}' != '') {
        if ('${result}' == 0)
            alert('该账户不存在！')
        if ('${result}' == 1)
            alert('密码错误！')
        if ('${result}' == 2) {
            alert('登录成功！')
            location.href = '/pms/studentInfo'
        }
    }
</script>
</html>
