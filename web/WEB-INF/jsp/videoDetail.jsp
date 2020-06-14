<%--
  Created by IntelliJ IDEA.
  User: lzr
  Date: 2020/6/14
  Time: 2:09 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>视频介绍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>视频编号</th>
                <th>视频名称</th>
                <th>视频集数</th>
                <th>类型</th>
                <th>评分</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${video.id}</td>
                <td>${video.videoName}</td>
                <td>${video.episode}集</td>
                <td>${video.type}</td>
                <td>${video.score}</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<div class="container">
    <div class="row clearfix">
        <div class="page-header">
            <h1>
                <small>视频介绍</small>
            </h1>
        </div>
    </div>
</div>
<div class="container">
    <p>
        ${video.detail}
    </p>
</div>
<div class="container">
    <a href="${pageContext.request.contextPath}/video/deleteVideo/${video.id}" class="btn btn-primary">删除</a>
    <a href="${pageContext.request.contextPath}/video/goUpdatePage/${video.id}" class="btn btn-primary">修改</a>
</div>


</body>
</html>
