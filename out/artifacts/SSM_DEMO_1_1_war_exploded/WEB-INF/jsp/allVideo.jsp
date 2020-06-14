<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: lzr
  Date: 2020/6/14
  Time: 9:31 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有视频</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="page-header">
                <h1>
                    <small>视频列表——————所有视频</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-8 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/video/goAddVideoPage">增加视频</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/video/goAllVideoPage">所有视频</a>
            </div>
            <div class="col-md-4 column">
                <form  action="${pageContext.request.contextPath}/video/queryByLikeName" method="post" class="form-inline">
                    <div class="form-group">
                        <label>Query Video</label>
                        <input name="name" type="text" class="form-control"  placeholder="请输入要查询的视频名">
                    </div>

                    <button type="submit" class="btn btn-default">Query</button>
                </form>
            </div>
        </div>


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
                    <c:forEach var="video" items="${allVideo}">
                        <tr>
                            <td>${video.id}</td>
                            <td><a href="${pageContext.request.contextPath}/video/goVideoDetail/${video.id}">${video.videoName}</a></td>
                            <td>第${video.episode}集</td>
                            <td>${video.type}</td>
                            <td>${video.score}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>



</body>
</html>
