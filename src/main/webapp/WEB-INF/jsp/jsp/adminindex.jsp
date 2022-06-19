<%@ page import="com.linkstudio.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=utf-8"%>
<%@ page language="java" pageEncoding="UTF-8"%>





<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-CN">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>研究生测评系统</title>
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
            <h4>研究生测评管理员系统</h4>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">统计信息</a></li>



            </ul>
            <!--
          <li><a href="/pingyi/infoimport">导入学生</a></li>
                <li><a href="/pingyi/info">导出学生测评状态</a></li>
                <li><a href="/pingyi">退出登录</a></li>
        -->
        </div>

    </div>


</nav>


<div class="container">
    <!-- Illustration -->




    <div class="panel panel-danger">
        <!--  MODIFIED  -->

        <div class="panel-body" style="line-height: 25px; text-indent: 25px">
            <table id="table" style="display: none">
                <thead>
                <tr>
                    <td>学生</td>
                    <td>学号</td>
                    <td>院系</td>
                    <td>学院</td>
                    <td>身份</td>
                    <td>状态</td>
                    <td>是否参与测评</td>
                </tr>

                </thead>
                <tbody>
                <%


                    List<Student> list = ((List<Student>)request.getAttribute("stu"));
                    request.setAttribute("list",list);
                    int num = list.size();
                    for( int i = 0 ;i<num ; i++)
                    {
                        String statech = "";
                        String identitych = "";
                        int identity = list.get(i).getIdentity();
                        if(identity == 1)
                        {
                            identitych="党员";
                        }
                        else
                        {
                            identitych = "群众";
                        }
                        String name = list.get(i).getName();
                        String stuid = list.get(i).getStuId();
                        int state = list.get(i).getState();
                        String school = list.get(i).getSchool();
                        String branch = list.get(i).getBranch();
                        if(state == 1)
                            statech = "已经完成测评";
                        else
                            statech = "未测评";
                        String isVoteable="=OR((E"+(i+2)+"=\"群众\"),(AND(E"+(i+2)+"=\"党员\",(OR(RIGHT(B"+(i+2)+")=\"3\",RIGHT(B"+(i+2)+")=\"0\",RIGHT(B"+(i+2)+")=\"6\")))))";

                        //need to change to state
                %>
                <tr>
                    <td><%=name%></td>
                    <td><%=stuid%></td>
                    <td><%=school%></td>
                    <td><%=branch%></td>

                    <td><%=identitych%></td>
                    <td><%=statech%></td>
                    <td><%=isVoteable%></td>

                </tr>
                <%}%>

                </tbody>
            </table>

            <div id="export">
                <a data-type="csv" href="javascript:;">导出学生测评状态</a>
            </div>


            <script src="js/Blob.js"></script>
            <script src="js/FileSaver.js"></script>
            <script src="js/tableExport.js"></script>
            <script>
                var $exportLink = document.getElementById('export');
                $exportLink.addEventListener('click', function (e) {
                    e.preventDefault();
                    if (e.target.nodeName === "A") {
                        tableExport('table', 'info', e.target.getAttribute('data-type'));
                    }
                }, false);
            </script>
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