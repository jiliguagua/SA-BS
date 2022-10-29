<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.jiliguagua.entity.Contact" %>

<%
  List<Contact> contacts = (List<Contact>)session.getAttribute("contacts");
%>

<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title> 个人通讯录系统</title>
  <link rel="stylesheet" href="css/public.css"/>
  <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
  <h1> 个人通讯录</h1>
  <div class="publicHeaderR">
    <div style="width: 46px;height: 46px;border-radius: 50%;overflow: hidden;margin-left: -100px;float: left">
      <img style="width: 100%" src="img/head_img.jpeg" alt="头像">
    </div>
    <span style="float: left" ><a href="#">退出</a></span>
  </div>
</header>
<!--时间-->
<section class="publicTime">
  <span id="time">2019年1月1日 11:11  星期一</span>
  <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
  <div class="left"></div>
  <div class="right">
    <div class="location">
      <strong>你现在所在的位置是:</strong>
      <span>联系人页面</span>
    </div>
    <div class="search">
  <a href="add.jsp">增加</a>
  <a href="delete.jsp">删除</a>
  <a href="change.jsp">修改</a>
    </div>
    <!--用户-->
    <table class="providerTable" cellpadding="0" cellspacing="0">
      <tr class="firstTr">
        <th width="10%">ID</th>
        <th width="15%">姓名</th>
        <th width="10%">性别</th>
        <th width="20%">生日</th>
        <th width="20%">电话</th>
        <th width="20%">邮箱</th>
      </tr>

      <% for (Contact contact: contacts) { %>
      <tr>

        <th width="10%"><%= contact.getcNo()%></th>
        <th width="15%"><%= contact.getvName()%></th>
        <th width="10%"><%= contact.getcSex()%></th>
        <th width="10%"><%= contact.getdBirth()%></th>
        <th width="12%"><%= contact.getcPhone()%></th>
        <th width="10%"><%= contact.getvEmail()%></th>
      </tr>

      <% } %>

    </table>
  </div>
</section>

<footer class="footer">
</footer>

<script src="js/jquery.js"></script>
<!--<script src="js/js.js"></script>-->
<script src="js/time.js"></script>
<script>
  $(function () {
    $(".left").load("common_pri.jsp");
  }) ;
</script>
</body>
</html>