<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%

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
            <span>修改联系人页面</span>
        </div>
        <div class="contactChange">
            <form action="contactChange" method="get">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="userId">ID：</label>
                    <input type="text" required name="cNo" id="userId"/>
                    <span>*请输入用户编码，且不能重复</span>
                </div>
                <div>
                    <label for="userName">姓名：</label>
                    <input type="text" name="vName" id="userName" required value=""/>
                    <span >*</span>
                </div>

                <div>
                    <label >性别：</label>

                    <select name="cSex">
                        <option value="man" selected>男</option>
                        <option value="woman" selected>女</option>
                    </select>
                </div>
                <div>
                    <label for="data">出生日期：</label>
                    <input type="text" name="dBirth" id="data" value=""/>
                    <span>*</span>
                </div>
                <div>
                    <label for="userphone">电话：</label>
                    <input type="text" name="cPhone" id="userphone" value=""/>
                    <span >*</span>
                </div>
                <div>
                    <label for="userAddress">邮箱：</label>
                    <input type="text" name="vEmail" id="userAddress" value=""/>
                </div>

                <div class="providerAddBtn">
                    <input type="submit" value="保存"/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>
                </div>
            </form>
        </div>

    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>
<script src="js/jquery.js"></script>
<script>
    $(function () {
        $(".left").load("common_pri.html");
    }) ;
</script>
</body>
</html>