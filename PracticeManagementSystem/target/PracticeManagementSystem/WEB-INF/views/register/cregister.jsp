<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2017/5/9
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
this is a cregister jsp
<form id="cregister" action="/pms/cregister" method="post">
    <label for="cname">*公司名：</label><input type="text" required id="cname" name="cname"><br>
    <%--id自动分配--%>
    <%--好评率自动更新--%>
    <label for="cpassword">*密码：</label> <input type="password" required id="cpassword" name="cpassword"><br>
    <label for="address">地址：</label> <input type="text" id="address" name="address"><br>
    <label for="telephone">电话：</label> <input type="text" id="telephone" name="telephone"><br>

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
            location.href='/pms/clogin'
        }
        if ('${result}' == 0) {
            alert('未知错误，注册失败！')
        }
        if ('${result}' == 2) {
            alert('该账号已被注册！')
        }

    }


</script>
</html>