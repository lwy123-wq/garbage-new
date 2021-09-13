<%--
  Created by IntelliJ IDEA.
  User: lwy
  Date: 2021/6/16
  Time: 上午8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <style>
    body{
      text-align:center;
      background: url("image/17.jpg") fixed center center no-repeat;
      background-size: cover;
      width: 100%;
    }
    #center{
      margin:0 auto;
      border:1px soild #000;
      width:300px;
      height:300px
    }
    *{
      padding: 0;
      margin: 0;
    }
    .black_half{
      padding: 25px;
      background-color: rgba(0,0,0,0.5);
    }
    .black_half h1{
      color: #FFFFFF;
    }
    .black_half a{
      text-decoration:none;
      color: #FFFFFF;
    }
    .black_half a:hover{
      text-decoration:underline;
      color: #FFFFFF;
    }
    .white h3{
      color: #FFFFFF;
    }
  </style>
  <title>欢迎——lwy的期末作业</title>
</head>
<body>
<br><br>
<div class="black_half">
  <h1>W E L C O M E !</h1>
</div>
<div class="black_half">
  <h2>
    <a href="login.jsp">用户登陆</a>
    &thinsp;
    <a href="register.jsp" style="font-size:12px;">
      还没有账号？点此注册</a>
  </h2><br>
  <h2>
    <a href="garbage.jsp">我是游客，跳过登录</a>
  </h2>
</div>
<br><br>
<div class="white">
</div>
</body>
</html>

