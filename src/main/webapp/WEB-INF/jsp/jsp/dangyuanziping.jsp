<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ccc" %>
<%@ page import="java.text.DecimalFormat"%>

<%@ page import="java.io.*"%>
<%!
	private final static int PIE_WIDTH=500;//生成的饼图的宽
	private final static int PIE_HEIGHT=500;//生成的饼图的高
%>
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
<title>研究生党建测评系统</title>
<link href="icon/fp.ico" rel="shortcut icon">
<!-- Bootstrap core CSS -->
<link
	href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="stylesheet">

<link href="css/index.css" rel="stylesheet">
<link href="css/bootstrap2.css" rel="stylesheet">
<script type="text/javascript" src="js/huping.js"></script>

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
	<%
	} %>
	
	<div class="navbar navbar-fixed-top header header-narrow-fixed">

		<nav>
			<ul class="nav nav-pills pull-right">
				<li role="presentation" class="active2"><a
						href="/zhibuindex">支部测评</a>
				<li role="presentation" class="active2"><a
						href="/hupingindex">党员测评</a>
				<li role="presentation" class="active2"><a
						href="#">党员自评</a>
				<li role="presentation" class="active"><a
						href="/teacherlogin">院系登录</a></li>
			</ul>
		</nav>
		<div class="header_logo">
			<img src="icon/fudan_red.png" class="header_pic">
		</div>
		<h3 class="text-muted">研究生党建测评系统</h3>
	</div>

	<div class="container">
		
		<div class="jumbotron">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>院系单位</th>
						<th>政治素质</th>
						<th>理论学习</th>
						<th>学习科研</th>
						<th>联系群众</th>
						<th>志愿服务</th>
					</tr>
				</thead>
				<tbody>
				<tr>
					<th>全校</th>
					<td>
						<img src="<%=basePath%>DisplayChart?filename=${mapall['fileNamePie1']}" width=100 height=100 border=0 usemap="#map0">
					</td>
					<th><img src="<%=basePath%>DisplayChart?filename=${mapall['fileNamePie2']}" width=100 height=100 border=0 usemap="#map0">
					</th>
					<th><img src="<%=basePath%>DisplayChart?filename=${mapall['fileNamePie3']}" width=100 height=100 border=0 usemap="#map0">
					</th>
					<th><img src="<%=basePath%>DisplayChart?filename=${mapall['fileNamePie4']}" width=100 height=100 border=0 usemap="#map0">
					</th>
					<th><img src="<%=basePath%>DisplayChart?filename=${mapall['fileNamePie5']}" width=100 height=100 border=0 usemap="#map0">
					</td></th>
				</tr>
				<tr>


				</tr>
				<ccc:forEach items="${newlist}" var="newlists">
					<tr>

						<td class="mth">${newlists['school']}
						</td>
						<td>
							<img src="<%=basePath%>DisplayChart?filename=${newlists['fileNamePie1']}" width=100 height=100 border=0 usemap="#map0">
						</td>
						<td>
							<img src="<%=basePath%>DisplayChart?filename=${newlists['fileNamePie2']}" width=100 height=100 border=0 usemap="#map0">
						</td>
						<td>
							<img src="<%=basePath%>DisplayChart?filename=${newlists['fileNamePie3']}" width=100 height=100 border=0 usemap="#map0">
						</td>
						<td>
							<img src="<%=basePath%>DisplayChart?filename=${newlists['fileNamePie4']}" width=100 height=100 border=0 usemap="#map0">
						</td>
						<td>
							<img src="<%=basePath%>DisplayChart?filename=${newlists['fileNamePie5']}" width=100 height=100 border=0 usemap="#map0">
						</td>


					</tr>
					<tr>


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


	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
