<%--
  Created by IntelliJ IDEA.
  User: lzr
  Date: 2020/6/13
  Time: 11:48 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>视频管理系统</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <style>
      a{
        text-decoration: none;
        color: white;
        font-size: 36px;
      }
        h3{
          width: 360px;
          height: 76px;
          margin: 100px auto;
          text-align: center;
          line-height: 76px;
          background: black;
          border-radius: 20px;
        }
    </style>
  </head>
  <body>
  <div class="page-header">
    <h1>视频管理系统<small>  1.0</small></h1>
  </div>
  <h3>
    <a href="${pageContext.request.contextPath}/video/goAllVideoPage">查询所有内容</a>
  </h3>
  </body>
</html>
