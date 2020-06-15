<%--
  Created by IntelliJ IDEA.
  User: lzr
  Date: 2020/6/14
  Time: 2:53 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改视频</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="page-header">
            <h1>
                <small>视频列表——————修改视频</small>
            </h1>
        </div>
    </div>
</div>

<form class="form-horizontal" action="${pageContext.request.contextPath}/video/update" method="post">
    <input type="hidden" name="id" value="${video.id}">
    <div class="form-group">
        <label class="col-sm-2 control-label">视频名称:</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name="videoName" value="${video.videoName}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">视频集数:</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name="episode" value="${video.episode}" >
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">类型:</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name="type" value="${video.type}" >
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">简介:</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name="detail" value="${video.detail}" >
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">分数:</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name="score" value="${video.score}" >
        </div>
    </div>

    <div class="form-group">
        <input type="submit" class="form-control btn btn-primary" value="submit">
    </div>


</form>
</body>
</html>
