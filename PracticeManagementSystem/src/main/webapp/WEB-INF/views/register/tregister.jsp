<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2017/5/9
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
this is a sregister jsp
<form id="sregister" action="/pms/tregister" method="post">
    <label for="sname">姓名：</label><input type="text" required id="sname" name="sname"><br>
    <label for="spassword">密码：</label> <input type="password" required id="spassword" name="spassword"><br>
    <label for="snumber">学号：</label> <input type="text" required id="snumber" name="snumber"><br>
    <label for="smajor">专业：</label> <input type="text" required id="smajor" name="smajor"><br>
    性别： <input type="radio" required value="0" name="ssex">男 <input type="radio" value="1" required name="ssex">女<br>
    <br>
    <input type="submit" value="注册">
    <input type="reset" value="重置"/>
</form>
</body>
<script>
    //对应后台返回的提示
    if ('${result}' != '') {
        if ('${result}' == 1) {
            alert('注册成功，将跳转到登录页面！')
            location.href='/pms/slogin'
        }
        if ('${result}' == 0) {
            alert('未知错误，注册失败！')
        }
        if ('${result}' == 2) {
            alert('该账号已有人注册！')
        }

    }


</script>
</html>