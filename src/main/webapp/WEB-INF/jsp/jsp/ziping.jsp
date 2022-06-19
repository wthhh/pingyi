<%@ page contentType="text/html;charset=utf-8"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="com.linkstudio.entity.Student" %>


<%
	//bb表示状态，1说明已经填写过
	int state = ((Student)request.getAttribute("stu")).getState();
	int identity = ((Student)request.getAttribute("stu")).getIdentity();
	int bb = state ;
	String string="";

	if(bb == 1|| identity == 2)
	    //如果已经填过 或者是群众 则不显示
	{
		string = "display:none";

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
	<link
			href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css"
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
				<!--
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
            -->
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
	<%
		String unstring = "";
		String unstring1 = "display:none";
		if(bb == 1)//如果是党员且填过则显示成功
		{
				unstring = "display:none";
				unstring1 = "";
		}


	%>
	<div class="container">
		<!-- Illustration -->
		<div style="<%=string%>">
		<h1 class="page-header">2021年研究生党员自我测评问卷</h1>
		<p>
			亲爱的同学：您好。研究生党员自评是每位党员对2020年11月至今自身表现的综合测评，用来促进同学们自我管理、自我教育、自我提醒、不断提升自身素质和能力。党员、预备党员必须填写，非党员同学无须填写。测评题目都为客观题，选项分为很好、较好、一般、较差和很差五项或者是、否两项。必须完成所有题目，方可提交。谢谢您的配合和支持！</p>
			<h2 class="sub-header">问卷内容</h2>
		</div>

		<!-- Current information -->
		<div class="row">
			<div class="col-sm-4">
				<p>
					测评人：${stu.name}</p>
			</div>
			<div class="col-sm-8">
				<p>
					测评人身份:<%=stringidentity%></p>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-8">
				<p>测评类别：党员自评</p>
				<h2 class="page-header"style="<%=unstring%>">(非党员无需进行）！请完成全部测评后点击提交</h2>
			</div>
		</div>
		<!--
    <table class="table table-noborder">
        <tbody>
          <td>测评人：${stu.name}</td>
            <td>测评人身份：<%=stringidentity%></td>
            <td>被测评党支部：${stu.branch}</td>
            <td>测评类别：党支部测评 </td>
        </tbody>
    </table>
    -->
	<form class="form-inline" role="form" action="dangyuanziping"
			  method="post">
			<div class="panel panel-danger" style="<%=string%>">

				<input type="hidden" name="xuehao" id="id">

				<div class="panel-heading">
					<h3 class="panel-title">政治素质</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">党性强，政治立场坚定，自觉学习党的理论，带头弘扬正气，具有大局意识。</p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ1" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ1" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ1" value="3" checked="checked">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ1" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ1" value="1">
								很差
							</label>
						</div>

					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">

				<input type="hidden" name="xuehao" id="id">

				<div class="panel-heading">
					<h3 class="panel-title">理论学习</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">认真参与党史学习，对党的宗旨、初心和使命有了更深刻的理解，更加坚定对马克思主义的信仰、对中国特色社会主义的信念和投身强国伟业的决心。</p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ2" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ2" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ2" value="3" checked="checked">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ2" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ2" value="1">
								很差
							</label>
						</div>

					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">学习科研</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">带头刻苦钻研、勤奋学习，发挥先锋模范作用。</p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="3" checked="checked">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="1">
								很差
							</label>
						</div>

					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">联系群众</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">
						具有较强的集体意识和奉献精神，积极落实党群联系“1+1”制度，主动关心帮助有困难的同学，乐于为同学服务，在学生中有威信。</p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ4" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ4" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ4" value="3" checked="checked">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ4" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ4" value="1">
								很差
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">志愿服务</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">
						积极参加社会志愿服务活动，为群众办实事、办好事，主动维护校园和谐稳定。</p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ5" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ5" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ5" value="3"checked="checked">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ5" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ5" value="1">
								很差
							</label>
						</div>
					</div>
				</div>
			</div>
			<button style="<%=unstring%>" type="submit" class="btn btn-default">提交</button>

		</form>
		

		<div class="panel panel-danger" style="<%=unstring1%>">
			<div class="panel-body ">

				<p align="center">
					您已成功提交党员测评问卷！</p>
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
	<script
			src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
	<script src="../../assets/js/vendor/holder.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>

</html>
