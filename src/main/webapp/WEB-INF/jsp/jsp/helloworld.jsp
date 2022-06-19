<%@ page import="com.linkstudio.entity.Student" %>
<%@ page contentType="text/html;charset=utf-8"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<%
    int identity = ((Student)request.getAttribute("stu")).getIdentity();
    //int zb = (Integer) session.getAttribute("huping");
    String stringidentity = "";
    if (identity ==1 ) {
        stringidentity = "党员";

    }
    else
        stringidentity = "群众";

%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-CN">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>研究生党建测评系统</title>
    <link href="icon/fp.ico" rel="shortcut icon">


    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/result.css" rel="stylesheet">

    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/Chart.min.js"></script>

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

            <!--

        CONTEXT CHANGED!!!!!!!

        -->

            <!--  MODIFIED(added)  -->

            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                    aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>

            <!--

        CONTEXT CHANGED END

        -->

            <div class="header_logo">
                <img src="icon/fudan.png" class="header_pic" alt="">
            </div>
            <h4>研究生党建测评系统</h4>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="zhibu">开始测评</a></li>

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


<div class="container">
    <!-- Illustration -->
    <h2 class="page-header">欢迎您参加本次研究生党建测评！</h2>



    <div class="panel panel-danger">
        <!--  MODIFIED  -->

        <div class="panel-body" style="line-height: 25px; text-indent: 25px">
            <p>为了提升研究生党支部建设水平，加强党员联系群众，我们在全校研究生中开展党建测评调查。</p>
            <p>

                每位研究生可以对所在党支部及其党员进行测评，“党支部测评”根据2020年11月至今党支部活动的开展情况进行测评，“党员测评”及“党员自评”根据2020年11月至今党员活动参与度及各方面表现进行测评。</p>
            <p>
                其中，党员及预备党员须填写“党支部测评”“党员自评”和“党员测评”三部分，对应集体的非党员同学可填写“党支部测评”，“党员测评”两部分，对所在集体的党支部以及党员进行测评。</p>
            <p>为了方便大家作答，我们将全部采用客观题形式，作答时间约为5分钟。</p>
            <p>

                本次党建测评系统12月27日9时开通，12月31日16时关闭（如有变化，另行通知）。请同学在规定时间内填写。</p>
            <p>您的意见对我们非常重要，请您认真作答。我们希望根据统计结果，更有针对性的加强党支部的建设和提升党员的素质。</p>
            <p>如您对本系统有任何意见和建议，欢迎大家联系研工部范佳秋老师 电话：65643825。我们会及时回复。</p>
            <p>再次对您的合作表示真诚的感谢！</p>
            <p></p>
        </div>

    </div>


    <footer class="footer">
        <hr style="height: 2px;">
        <p align="center">
            &copy;2015。
            复旦大学版权所有
        </p>
    </footer>
</div>





</body>
</html>