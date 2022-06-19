<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ccc" %>
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

<!-- Custom styles for this template -->
<link href="css/index.css" rel="stylesheet">



<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<div class="navbar navbar-fixed-top header header-narrow-fixed">

		<nav>

		</nav>
		<div class="header_logo">
			<img src="icon/fudan_red.png" class="header_pic">
		</div>
		<h3 class="text-muted">研究生党建测评系统</h3>

	</div>
	<div class="container">
<!-- 
		<div class="jumbotron">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>支部</th>
						<th>党员测评率</th>
						<th>总测评率</th>
					</tr>
				</thead>
				<tbody>
				<tr>
				<th>全校</th>
				<th><div class="bar-chart-box">
								<span class="bar-chart" style="width:${mapall['percentofdangyuan']}">(${mapall['percentofdangyuan']})
								</span>
				</div> <span class="count">${mapall['percentofdangyuan']}</span></th>
				<th><div class="bar-chart-box">
								<span class="bar-chart" style="width: ${mapall['percentofall']}">(${mapall['percentofall']})
								</span>
				</div> <span class="count">${mapall['percentofall']}</span></th>
				</tr>
				<tr>
					<th>${mapschool['school']}</th>
					<th><div class="bar-chart-box">
								<span class="bar-chart" style="width:${mapschool['percentofdangyuan']}">(${mapschool['percentofdangyuan']})
								</span>
					</div> <span class="count">${mapschool['percentofdangyuan']}</span></th>
					<th><div class="bar-chart-box">
								<span class="bar-chart" style="width: ${mapschool['percentofall']}">(${mapschool['percentofall']})
								</span>
					</div> <span class="count">${mapschool['percentofall']}</span></th>
				</tr>
				</tr>
				<ccc:forEach items="${newlist}" var="newlists">


					<tr>
						<td>${newlists['branch']}</td>

						<td>
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
		</div> -->

		<footer class="footer">
			<p align="center">&copy;2015 复旦大学版权所有</p>
		</footer>

	</div>
	<!-- /container -->


	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->

</body>
</html>