<%@ page import="com.linkstudio.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>导出学生</title>
    <link href="icon/fp.ico" rel="shortcut icon">

</head>
<body>
<%

    String unstring1 = "display:none";



%>
<div id="export">
    <a data-type="csv" href="javascript:;">导出csv</a>
</div>
<div style="<%=unstring1%>">
<table id="table" >

    <thead>
    <tr>
        <td>学生</td>
        <td>学号</td>
        <td>院系</td>
        <td>支部</td>
        <td>身份</td>
        <td>状态</td>
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
            statech = "已经完成评议";
        else
            statech = "未评议";

        //need to change to state
    %>
    <tr style="display: none">
        <td><%=name%></td>
        <td><%=stuid%></td>
        <td><%=school%></td>
        <td><%=branch%></td>
        <td><%=identitych%></td>
        <td><%=statech%></td>

    </tr>
    <%}%>

    </tbody>
</table>

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

</body>

</html>