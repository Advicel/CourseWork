<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<style>
    <%@include file="/WEB-INF/css/style1.css"%>
</style>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Registration</title>
</head>
<body>

<div class="vladmaxi-top">
    <a href="index" target="_blank">Main page</a>
    <div class="clr"></div>
</div>
<form method="post" action="" class="login">
    <p>
        <label for="login">Login:</label>
        <input type="text" name="login" id="login" placeholder="name@example.com">
    </p>

    <p>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" placeholder="1234567">
    </p>

    <p class="login-submit">
        <button type="submit" class="login-button" value="enter">Enter</button>
    </p>

    <p class="forgot-password"><a href="registry">Do not have account?</a></p>
</form>
</body>
</html>
