<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts2——loign</title>
<SCRIPT type="text/javascript" src="../../scripts/jquery.js"></script>
<SCRIPT type="text/javascript" src="../../demo/user.js"></SCRIPT>
</head>
<body>
<s:form action="loginAction" method="post">
	<div id="msg"></div>
		username：
		<input name="user.username" id="username" type="text" />
	<br />
		password：
		<input name="user.password" id="password" type="password" />
	<br />
	<input type="submit" id="submit" value="login">
</s:form>
</body>
</html>