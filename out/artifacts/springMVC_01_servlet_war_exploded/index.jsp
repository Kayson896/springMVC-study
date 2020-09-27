<%--
  Created by IntelliJ IDEA.
  User: Kayson
  Date: 2020/9/24
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form id="login-form" method="post" onsubmit="return checkForm()">
    <input type="text" id="username" name="username">
    <input type="password" id="input-password">
    <input type="hidden" id="md5-password" name="password">
    <button type="submit">Submit</button>
  </form>
  <script>
    function checkForm(){
      var input_pwd = document.getElementById('input-password');
      var md5_pwd = document.getElementById('md5-password');
      md5_pwd.value = md5(input_pwd.value);
      return true;
    }
  </script>
    $END$
  </body>
</html>
