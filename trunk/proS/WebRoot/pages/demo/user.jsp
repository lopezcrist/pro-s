<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>struts2 testDemotitle</title>
</head>
<body>
<s:form action="loginAction" method="post">
	username : aa<br />
	password : 123 <br />
	<s:textfield key="username" name="user.username" />
	<s:password key="password" name="user.password" />
	<s:submit value="submit" />
</s:form>

</body>
</html>
