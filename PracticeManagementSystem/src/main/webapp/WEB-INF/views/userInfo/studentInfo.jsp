<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2017/5/6
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>studentInfo</p>
<c:if test="${! empty studentInfo}">
    <p>欢迎您，${studentInfo.sname}${studentInfo.ssex eq 1 ?'女士':'先生'}</p><br>
    <p>您的信息：</p>
    <p>姓名：${studentInfo.sname}</p>
    <p>学号：${studentInfo.snumber}</p>
    <p>性别：${studentInfo.ssex eq 1 ?'女':'男'}</p>
    <p>专业：${studentInfo.smajor}</p>
    <p>简介:${studentInfo.sprofile}</p>
    <input type="button" value="注销" onclick="location.href='/pms/slogout'">
    个人简介：
    <%--<c:if test="${!empty studentInfo.sprofile}">--%>
    <%--<textarea name="sprofile" id="sprofile" cols="30" rows="10">${studentInfo.sprofile}</textarea>--%>
    <%--</c:if>--%>
    <%--<c:if test="${empty studentInfo.sprofile}">--%>
    <form action="/pms/studentInfo" method="post">

        <textarea name="sprofile" id="sprofile" cols="30" rows="10">${studentInfo.sprofile}</textarea>
        <%--<c:if test="${!empty studentInfo.sprofile}">--%>
            <%--<textarea id="sprofile">${studentInfo.sprofile}</textarea>--%>
        <%--</c:if>--%>
        <input type="submit" value="提交">
    </form>
    <%--</c:if>--%>



</c:if>
<c:if test="${ empty studentInfo}">
    对不起，请先<a href="/pms/slogin">登录</a>
</c:if>
</body>
</html>
