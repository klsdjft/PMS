<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2017/5/10
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>companyInfo</p>
<c:if test="${! empty companyInfo}">
    <p>欢迎您，${companyInfo.cname}</p><br>
    <p>您的信息：</p>
    <p>姓名：${companyInfo.cname}</p>
    <p>公司号：${companyInfo.cid}</p>
    <p>好评率：${companyInfo.praiserate}</p>
    <p>地址:${companyInfo.address}</p>
    <p>电话:${companyInfo.telephone}</p>
    <p>负责人姓名:${companyInfo.managername}</p>
    <input type="button" value="注销" onclick="location.href='/pms/clogout'">


</c:if>
<c:if test="${ empty companyInfo}">
    对不起，请先<a href="/pms/clogin">登录</a>
</c:if>
</body>
</html>
