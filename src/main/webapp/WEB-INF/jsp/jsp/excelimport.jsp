<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%

%>


<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <title>导入学生</title>
</head>

<body>
<p>使用excel导入学生</p>


<form action="import" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="file">
    <input type="submit" value="提交">
</form>
<br/>

</body>
</html>