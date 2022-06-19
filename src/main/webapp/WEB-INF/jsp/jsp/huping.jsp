<%@ page import="com.linkstudio.entity.Student" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ccc" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page language="java" pageEncoding="UTF-8" %>


<%
	int state = ((Student)request.getAttribute("stu")).getState();
	int identity = ((Student)request.getAttribute("stu")).getIdentity();
	//int zb = (Integer) session.getAttribute("huping");
	int bb = 1;
	String string = "";
	String unstring = "display:none";
	if (state ==1 ) {
		string = "display:none";
		unstring = "";
	}
	String stringidentity = "";
	if (identity ==1 ) {
		stringidentity = "党员";

	}
	else
		stringidentity = "群众";
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
	<link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css"
		  rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="css/dashboard.css" rel="stylesheet">
	<link href="css/result.css" rel="stylesheet">

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
	<script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>

<body>
<!-- navbar -->
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header" style="width: 200px;">
			<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<div class="header_logo">
				<img src="icon/fudan.png" class="header_pic">
			</div>
			<h4>研究生党建测评系统</h4>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">

				<li><a href="http://pingyi.fudan.edu.cn">退出系统</a></li>
			</ul>
		</div>
	</div>
	<div id="global-message">
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<span style="font-size: 12px;">${stu.name}同学，您好！当前支部：${stu.branch}</span>
				</div>
			</div>
		</div>
	</div>
</nav>

<div class="container">
	<!-- Illustration -->
	<h1 class="page-header">2021年研究生党员测评问卷</h1>
	<p>
		亲爱的同学：您好。研究生党员测评是对研究生党支部内每一位党员2020年11月至今表现所进行的测评，鼓励大家增进彼此了解、密切联系，互相取长补短。其中，每一位党员（含预备党员）必须测评所在党支部的所有其他党员，对应集体的非党员同学可以对所在集体的党员进行测评。测评题目为客观题。必须完成所有题目，方可提交。谢谢您的配合和支持！</p>
	<!-- Current information -->
	<div class="row">
		<div class="col-sm-4">
			<p>
				测评人：${stu.name}</p>
		</div>
		<div class="col-sm-8">
			<p>
				测评人身份：<%=stringidentity%></p>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-4">
			<p>测评类别：党员测评</p>
		</div>
		<div class="col-sm-8">
			<p>
				所在党支部：${stu.branch}</p>
		</div>
	</div>
	<!--
    <table class="table table-noborder">
        <tbody>
            <td>测评人：${stu.name}</td>
            <td>测评人身份：<%=stringidentity%></td>
            <td>所在党支部：${stu.branch}</td>
            <td>测评类别：党员互评 </td>
        </tbody>
    </table>
    -->
	<h2 class="sub-header">问卷内容</h2>
	<p>
		<!--  MODIFIED  -->
		请对以下党员在思想引领、学习科研、志愿服务、联系群众等方面所起到的模范带头作用进行综合评价
	</p>

	<div class="panel panel-danger" style="<%=string%>">
		<form class="form-inline col-sm-12" role="form"
			  action="huping" method="post">
			<!--  MODIFIED  -->
			<div class="panel-body ">
				<div>
					<table class="table table-striped ">
						<tbody>
						<ccc:forEach items="${students}" var="student">
							<tr>
								<th>${student.name}${student.stuId}
									:${student.duty}
								</th>
								<th><input type="radio" name="item_${student.stuId}" value="5" >
									很好
								</th>
								<th><input type="radio" name="item_${student.stuId}" value="4">
									较好
								</th>
								<th><input type="radio" name="item_${student.stuId}" value="3" checked="checked">
									一般
								</th>
								<th><input type="radio" name="item_${student.stuId}" value="2">
									较差
								</th>
								<th><input type="radio" name="item_${student.stuId}" value="1">
									很差
								</th>
								<th><input type="radio" name="item_${student.stuId}" value="0">
									不了解
								</th>
							</tr>
						</ccc:forEach>
						</tbody>
					</table>
				</div>


			</div>
			<button style="<%=string%>" id="btna" type="submit" class="btn btn-default">下一步</button>
		</form>
		<div class="panel panel-danger" style="<%=unstring%>">
			<div class="panel-body ">

				<p align="center">
					您已成功提交党员测评问卷！</p>
			</div>
		</div>
	</div>
	<footer class="footer">
		<hr style="height: 2px;">
		<p align="center">&copy;2015 复旦大学版权所有</p>
	</footer>

</div>

<!-- container -->

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        $('input[type=checkbox]').click(function(){
            var type = $(this).attr("class");
            var threshold = Math.round(${students.size()} / 10);
			if(threshold == 0)
			    threshold = 1;
            if($("input[class="+type+"]:checked").length > threshold && type != 'contact')
            {
                alert("该项选择数量不能超出支部人数10%");
                $(this).removeAttr("checked");
            }
            if (type != "contact") {
                var name = $(this).attr("name");
                var length = type.length;
                var stuId = name.substring(length+1);
                var anotherName;
                if ($("input[name="+anotherName+"]").is(':checked')) {
                    $("input[name="+anotherName+"]").removeAttr("checked");
                }
            }
        });
    })
</script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</body>
</html>
