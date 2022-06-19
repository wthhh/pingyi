
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
					<img src="fudan.png" class="header_pic">
				</div>
				<h4>研究生党建测评系统</h4>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">


					<li><a href="/">返回首页</a></li>
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
		<h1 class="page-header">2021年研究生党支部测评问卷</h1>
		<p>
			亲爱的同学：您好。研究生党支部测评是对2020年11月至今研究生党支部工作开展情况所进行的测评，便于促进党支部的自我管理、自我建设、自我完善。党员、预备党员必须对所在党支部进行评议，对应集体的非党员同学可以对所在集体的党支部进行评议。题目都为客观题，选项分为好、较好、一般、较差、很差和不了解六项。必须完成所有题目，方可提交。谢谢您的配合和支持！
		</p>
		<!-- Current information -->
		<div class="row">
			<div class="col-sm-4">
				<p>
					测评人：姓名</p>
			</div>
			<div class="col-sm-8">
				<p>
					测评人身份身份</p>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4">
				<p>测评类别：党支部测评</p>
			</div>
			<div class="col-sm-8">
				<p>
					被测评党支部：支部</p>
			</div>
		</div>
		<!--

    -->
		<h2 class="sub-header">支部测评问卷内容</h2>

		<form class="form-inline"  action="zhibupingyi"
			method="post">


			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">教育党员有力</h3>
				</div>



				<div class="panel-body">


					<p class="panel-txt">
						所在支部突出政治功能，扎实开展党史学习，认真开展“三会一课”，形式多样、成果突出，支部党员在思想上政治上行动上同以习近平同志为核心的党中央保持高度一致。
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
					<h3 class="panel-title">管理党员有力</h3>
				</div>



				<div class="panel-body">


					<p class="panel-txt">
						支部严格党员发展程序，党员培训、党籍管理、党费收缴、党员激励关怀帮扶等工作扎实有效，支部党员在日常教学科研学习生活中亮出党员身份、立起先进标尺、树立先锋形象，先锋模范作用充分发挥。
					</p>
					<br><br><br>
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
					<h3 class="panel-title">监督党员有力</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt">
						支部坚持把纪律和规矩挺在前面，监督党员履行义务、遵规守纪及时到位。</p><br><br>
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
					<h3 class="panel-title">组织师生有力</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt">
						支部积极支持、指导和帮助团支部、班委会开展工作，引领优良班风学风校风建设，推进社会主义核心价值观培育践行。
					</p><br>
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
					<h3 class="panel-title">宣传师生有力</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt">
						支部面向同学组织开展习近平新时代中国特色社会主义思想宣传教育，充分利用校园内外、网上网下等宣传平台，通过组织宣讲报告、座谈交流、文化文艺活动等形式，广泛宣传典型，充分发挥示范带动作用，引领同学听党话、跟党走。</p>
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
					<h3 class="panel-title">凝聚师生有力</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">支部把思想引领和价值观塑造有机融入学习生活，关心了解同学思想情况，及时回应同学重大关切。<br/></p>
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
			<div class="panel panel-danger" style="<%=string%>">
				<div class="panel-heading">
					<h3 class="panel-title">服务师生有力</h3>
				</div>
				<div class="panel-body">
					<p class="panel-txt" style="width:100%;">支部常态化了解同学困难诉求、倾听意见建议，密切联系群众，党群联系“1+1”制度扎实有效，支部积极开展服务、帮扶、慰问等活动。<br/></p>
					<div class="radio" style="display: inherit">
						<!--  MODIFIED  -->
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ7" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ7" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ7" value="3">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ7" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ7" value="1">
								很差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ7" value="0" checked="checked">
								不了解
							</label>
						</div>
					</div>
				</div>



			</div>
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
							<label> <input type="radio" name="ScoreQ8" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ8" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ8" value="3">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ8" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ8" value="1">
								很差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ8" value="0" checked="checked">
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
							<label> <input type="radio" name="ScoreQ9" value="5" >
								很好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ9" value="4">
								较好
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ9" value="3">
								一般
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ9" value="2">
								较差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ9" value="1">
								很差
							</label>
						</div>
						<div class="col-sm-2">
							<!--  MODIFIED  -->
							<label> <input type="radio" name="ScoreQ9" value="0" checked="checked">
								不了解
							</label>
						</div>
					</div>
				</div>

			</div>
			<button type="submit" class="btn btn-default" style="<%=string%>">下一步</button>
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
