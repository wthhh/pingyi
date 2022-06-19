<%@ page import="com.alibaba.fastjson.JSONArray" %>
<%@ page import="com.alibaba.fastjson.JSONObject" %>
<%@ page import="java.text.DecimalFormat" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ccc" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	
	
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">
<title>研究生评议系统</title>
<link href="icon/fp.ico" rel="shortcut icon">
<!-- Bootstrap core CSS -->
<link
	href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/index.css" rel="stylesheet">



<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<!--CONTEXT CHANGED!!!!!!!
  把后面的header改到前面来了！

  -->

	<!--  MODIFIED(added)  -->

	<%String alert=null;
alert= request.getParameter("alert");
if("alert".equals(alert)){
%>
	<script type="text/javascript">
alert("您不在我们的问卷数据库中，请与您所在党支部联系");
</script>
	<%} %>

	<div class="navbar navbar-fixed-top header header-narrow-fixed">

		<nav>
			<ul class="nav nav-pills pull-right">
				<li role="presentation" class="active2"><a
						href="/pingyi/adminlogin">管理员登录</a>
				<li role="presentation" class="active2"><a
					href="/pingyi/zhibuindex">统计</a>
				<li role="presentation" class="active2"><a
						href="/pingyi/questionindex">查看评议题目</a>
<%--				<li role="presentation" class="active"><a--%>
<%--						href="https://tac.fudan.edu.cn/oauth2/authorize.act?client_id=b30379a5-cebf-468e-9120-0ed974b3e604&response_type=code&redirect_uri=http://pingyi.fudan.edu.cn/welcome">登录</a ></li>--%>

			</ul>

		</nav>
		<div class="header_logo">
			<img src="icon/fudan_red.png" class="header_pic">
		</div>
		<h3 class="text-muted">研究生评议系统</h3>

	</div>

	<div class="container">
		<div class="jumbotron">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>院系单位</th>
						<th>党员评议率</th>
						<th>总评议率</th>
					</tr>
				</thead>
				<tbody>
				<th>全校</th>
				<th><div class="bar-chart-box">
								<span class="bar-chart" style="width:${mapall['percentofdangyuan']}">(${mapall['percentofdangyuan']})
								</span>
				</div> <span class="count">${mapall['percentofdangyuan']}</span></th>
				<th><div class="bar-chart-box">
								<span class="bar-chart" style="width: ${mapall['percentofall']}">(${mapall['percentofall']})
								</span>
				</div> <span class="count">${mapall['percentofall']}</span></th>

				<ccc:forEach items="${newlist}" var="newlists">


					<tr>
						<td><a href="school?school=${newlists['school']}">${newlists['school']}</a></td>

						<td>
							<!--  MODIFIED(added)可以改表格的列宽  -->
							<div class="bar-chart-box">
								<span class="bar-chart" style="width:${newlists['percentofdangyuan']}">(${newlists['percentofdangyuan']})
								</span>
							</div> <span class="count">${newlists['percentofdangyuan']}</span>
						</td>
						<td>
							<div class="bar-chart-box">
								<span class="bar-chart" style="width: ${newlists['percentofall']}">(${newlists['percentofall']})
								</span>
							</div> <span class="count">${newlists['percentofall']}</span>
						</td>
					</tr>


</ccc:forEach>
				</tbody>
			</table>
		</div>

		<footer class="footer">
			<hr style="height: 2px;">
			<p align="center">&copy;2015复旦大学版权所有</p>
		</footer>

	</div>
	<!-- /container -->



</body>
</html>
