
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="java.text.NumberFormat"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setCharacterEncoding("UTF-8");

	String param = request.getParameter("redirect");	
	System.out.println(param);
%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>院系登录</title>
  <link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>
  <link rel="stylesheet" href="login.css">
  <script src="js/jquery-3.2.1.min.js"></script>
  <script src="js/js/md5.js"></script>
</head>

<body>
    <div class="wrapper">
    <form class="form-signin" action="findStu" method="post">

      <h2 class="form-signin-heading">学生登录</h2>
      <input type="text" class="form-control" name="id" placeholder="用户名" required="" autofocus="" />

      <!--label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label-->
        <button type="submit" class="btn btn-default" >提交</button>
    </form>
  </div>

  
  
</body>
</html>
