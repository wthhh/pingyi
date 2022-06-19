<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ccc" %>
<%@page import="java.awt.Font"%>
<%@page import="java.awt.Color"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet"%>

<%@ page import="java.text.DecimalFormat"%>
<%@ page import="org.jfree.data.general.DefaultPieDataset"%>
<%@ page import="org.jfree.chart.*"%>
<%@ page import="org.jfree.chart.servlet.*"%>
<%@ page import="java.text.NumberFormat"%>
<%@ page import="java.util.*"%>
<%@ page import="org.jfree.chart.plot.*"%>
<%@ page import="org.jfree.chart.labels.StandardPieSectionLabelGenerator"%>
<%@ page import="org.jfree.chart.servlet.ServletUtilities"%>
<%@ page import="org.jfree.chart.labels.StandardPieToolTipGenerator"%>
<%@ page import="org.jfree.chart.urls.StandardPieURLGenerator"%>
<%@ page import="org.jfree.chart.entity.StandardEntityCollection"%>
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
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>
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
						href="#">党员测评</a>
				<li role="presentation" class="active2"><a
						href="/selfindex">党员自评</a>
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
						<th>对党员总体评价情况</th>
						<th>党员对党员评价情况</th>
						<th>群众对党员评价情况</th>
					</tr>
				</thead>
				<tbody>
				<tr>
					<td>全校</td>
					<td>
						<img src="<%=basePath%>DisplayChart?filename=${mapall['fileNamePie3']}" width=100 height=100 border=0 usemap="#map0">
					</td>
					<td>
						<img src="<%=basePath%>DisplayChart?filename=${mapall['fileNamePie1']}" width=100 height=100 border=0 usemap="#map0">
					</td>
					<td>
						<img src="<%=basePath%>DisplayChart?filename=${mapall['fileNamePie2']}" width=100 height=100 border=0 usemap="#map0">
					</td>

				</tr>
				<tr>

				</tr>


				<ccc:forEach items="${newlist}" var="newlists">
					<tr>

						<td class="mth">${newlists['school']}
						</td>





						<td>
							<img src="<%=basePath%>DisplayChart?filename=${newlists['fileNamePie3']}" width=100 height=100 border=0 usemap="#map0">
						</td>
						<td>
							<img src="<%=basePath%>DisplayChart?filename=${newlists['fileNamePie1']}" width=100 height=100 border=0 usemap="#map0">
						</td>
						<td>
							<img src="<%=basePath%>DisplayChart?filename=${newlists['fileNamePie2']}" width=100 height=100 border=0 usemap="#map0">
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
