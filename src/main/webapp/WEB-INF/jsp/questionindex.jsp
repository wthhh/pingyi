
<%@ page contentType="text/html;charset=utf-8"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<% String string = "";%>


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
					<img src="fudan.png" class="header_pic">
				</div>
				<h4>研究生评议系统</h4>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">


					<li><a href="/pingyi/">返回首页</a></li>
				</ul>
	<!--
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
     -->
			</div>
		</div>


	</nav>

	<div class="container">
		<!-- Illustration -->
		<h1 class="page-header">2020年研究生党支部评议问卷</h1>
		<p>
			亲爱的同学：您好。研究生党支部评议是对2019年11月至今研究生党支部工作开展情况所进行的评议，便于促进党支部的自我管理、自我建设、自我完善。党员、预备党员必须对所在党支部进行评议，对应集体的非党员同学可以对所在集体的党支部进行评议。题目都为客观题，选项分为好、较好、一般、较差、很差和不了解六项。必须完成所有题目，方可提交。谢谢您的配合和支持！
		</p>
		<!-- Current information -->
		<div class="row">
			<div class="col-sm-4">
				<p>
					评议人：姓名</p>
			</div>
			<div class="col-sm-8">
				<p>
					评议人身份身份</p>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4">
				<p>评议类别：党支部评议</p>
			</div>
			<div class="col-sm-8">
				<p>
					被评议党支部：支部</p>
			</div>
		</div>
		<!--

    -->
		<h2 class="sub-header">支部评议问卷内容</h2>


		<form class="form-inline"  action="zhibupingyi"
			method="post">


			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">支部班子</h3>
				</div>



				<div class="panel-body">


					<p class="panel-txt">
						支委班子健全，定期召开支委会，支部建设思路清晰，能认真执行党的路线方针政策和上级组织的决定决议，成为引领学生刻苦学习、团结进步、健康成长的核心。
					</p>
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
							<label> <input type="radio" name="ScoreQ1" value="3">
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
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ1" value="0" checked="checked">
								不了解
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">支部书记</h3>
				</div>



				<div class="panel-body">


					<p class="panel-txt">
						政治素质高，品学兼优，工作扎实，关心服务同学，学习、科研、生活各方面都能发挥表率作用。</p><br><br><br>
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
							<label> <input type="radio" name="ScoreQ2" value="3">
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
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ2" value="0" checked="checked">
								不了解
							</label>
						</div>
					</div>
				</div>

			</div>
			<div class="panel panel-danger" style="<%=string%>">

				<div class="panel-heading">
					<h3 class="panel-title">党员队伍</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt">
						党员有较强的党性意识，能做到带头学习提高、带头服务同学、带头参加志愿服务活动、带头弘扬正气，在广大学生中起到示范引领作用。</p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="5">
								很好		
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="4" >
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="3">
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
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ3" value="0"  checked="checked">
								不了解
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">工作机制</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt">
						支部设置合理，规模适当（一般不超过30人）；定期开展组织生活，“有主题、有讨论、有共识、有记录”，每学期不少于5次，出席率达60%以上；党支部日常管理等各项工作制度完善、执行到位；重视做好优秀学生中发展党员工作，工作规范，机制健全。
					</p>
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
							<label> <input type="radio" name="ScoreQ4" value="3">
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
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ4" value="0" checked="checked">
								不了解
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">工作业绩</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt">
						党支部充分履行工作职责，积极引导学生党员思想上入党、行动上入党，发挥支部战斗堡垒作用，带动班级建设，促进学生全面成长。</p>
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
							<label> <input type="radio" name="ScoreQ5" value="3">
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
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ5" value="0" checked="checked">
								不了解
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">群众反映</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">党支部在班级中有较高威信，党员在师生中有良好形象。<br/></p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="3">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="1">
								很差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="0" checked="checked">
								不了解
							</label>
						</div>
					</div>
				</div>



			</div>

		</form>
		<h2 class="sub-header">互评问卷内容</h2>
		<form class="form-inline col-sm-12" role="form"
			  action="huping" method="post">
			<!--  MODIFIED  -->
			<div class="panel-body ">
				<div>
					<table class="table table-striped ">
						<tbody>

							<tr>
								<th>（范例）学生姓名；学号；职务；
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
								<th>| 该党员：</th>
								<th><input type="checkbox" class="best" name="best_${student.stuId}" value="1">
									表现优秀</th>
								<th><input type="checkbox" class="worst" name="worst_${student.stuId}" value="1">
									有待改进</th>
								<th>| <input type="checkbox" class="contact" name="contact_${student.stuId}" value="1">
									我的联系人</th>
							</tr>

						</tbody>
					</table>
				</div>


			</div>

		</form>

		<h2 class="sub-header">自评问卷内容</h2>
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
				<div class="panel-heading">
					<h3 class="panel-title">学习科研</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">带头刻苦钻研、勤奋学习，发挥先锋模范作用。</p>
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
					<h3 class="panel-title">联系群众</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">
						具有较强的集体意识和奉献精神，主动关心帮助有困难的同学，乐于为同学服务，在学生中有威信。</p>
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
					<h3 class="panel-title">志愿服务</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">
						积极参加班（年）级集体活动与事务管理，积极参加社会志愿服务活动，主动维护校园和谐稳定。</p>
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
							<label> <input type="radio" name="ScoreQ4" value="3"checked="checked">
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
					<h3 class="panel-title">年度组织生活出勤率</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">好（90%以上） 较好（80%以上） 一般（60%以上） 较差（50%以上）
						差（50%以下）</p>
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
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">园区表现</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">带头遵守园区管理规定，寝室干净整洁，积极参与和谐园区建设。</p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="3"checked="checked">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ6" value="1">
								很差
							</label>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">参与学生组织情况</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">是否参加学生会、社团等各级各类学生组织。</p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ7" value="5" >
								是
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ7" value="0" checked="checked">
								否
							</label>
						</div>
					</div>
				</div>
			</div>

		</form>


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
