<!DOCTYPE html>
<html lang="zh-CN" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Title</title>


    <link rel="stylesheet" th:href="@{/layui/css/layui.css}">
    <style>

        body {
            /*width: 100%;*/
            /*height: 100%;*/
            background: url("/images/background.png") no-repeat;
            /*background: url("static/images/a.png") no-repeat;*/
            background-size: cover;
        }

        #login_form {
            width: 400px;
            height: 300px;
            margin: 80px auto;
            padding: 30px;
            background-color: #f2f2f2;
            opacity: 0.9;
        }

    </style>
</head>
<body>

<div id="wrapper" style="margin-top: 260px">
    <div class="layui-container" id="login_form">

        <div>
            <h1 style="color: red;text-align: center">Library management system</h1>
            <br>
        </div>

        <form class="layui-form" id="my_form" method="post" action="/userLogin">

            <div class="layui-form-item">
                <label class="layui-form-label">user name:</label>
                <div class="layui-input-block">
                    <input type="text" name="userName" id="username" autofocus
                           placeholder="enter one user name" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">password:</label>
                <div class="layui-input-block">
                    <input type="password" name="password" id="password"
                           placeholder="Please input a password" autocomplete="off" class="layui-input">
                </div>
            </div>


            <div class="layui-form-item">
                <label class="layui-form-label">User identity</label>
                <div class="layui-input-block">
                    <input class="form-check-input" type="radio" name="role" value="1" title="student" checked>
                    <input class="form-check-input" type="radio" name="role" value="0" title="administrators">
                </div>
            </div>

            <div class="layui-form-item layui-col-md4 layui-col-md-offset4">
                <button id="sub_btn" class="layui-btn layui-btn-normal">Sign in</button>
            </div>

        </form>

    </div>
</div>


<script th:src="@{/scripts/jquery.min.js}"></script>
<script th:src="@{/layui/layui.js}"></script>


<script th:inline="javascript">
    layui.use(['layer', 'form'], function () {
        let layer = layui.layer;
        let form = layui.form;
        form.render();

        $(function () {
            let flag = [[${session.flag}]];
            if (flag) {
                layer.msg("Wrong user name or password", {
                    icon: 2,
                    time: 2000 //2 seconds off (3 seconds by default if not configured)
                });
            }
        });
    });


    $("#sub_btn").click(function () {
        let username = $("#username").val();
        let user_judge = check(username);

        // First, judge whether the user name is empty
        if (user_judge) {
            let password = $("#password").val();
            let pwd_judge = check(password);

            // If the user name is not empty, judge whether the password is empty
            if (pwd_judge) {
                let role_id = $('input[name="role"]:checked').val();

                // If role_ If id = = 1, it is an ordinary user who submits the form directly
                if (role_id == 1) {
                    $("#my_form").submit();
                } else {

                    //If you are an administrator, change the action
                    $("#my_form").attr("action", "/adminLogin")
                    $("#my_form").submit();
                }

            } else {
                layer.alert("Password cannot be empty", {icon: 5});
                return false;
            }
        } else {

            layer.alert("User name cannot be empty", {icon: 5});
            return false;
        }
    });

    // Verify whether the user name and password in the form are entered. If there is a value - > return true. If not, return false;
    function check(val) {
        val = val.toString().trim();
        return !(val == '');
    }

</script>
</body>
</html>
