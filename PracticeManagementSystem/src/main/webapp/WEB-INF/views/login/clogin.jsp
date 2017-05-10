<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2017/5/6
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>id
</head>
<body>
<form id="clogin" action="/pms/clogin" method="post">
    <%--二期实现，用公司id，电话，或者邮箱登陆--%>
    <label for="cid">公司：</label> <input type="number" required id="cid" name="cid"><br>
    <label for="cpassword">密码：</label> <input type="password" required id="cpassword" name="cpassword"><br>
    <input type="submit" value="登录">
    <input type="button" value="注册" onclick="location.href='/pms/cregister'">
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
            location.href = '/pms/companyInfo'
        }
    }
</script>
</html>

