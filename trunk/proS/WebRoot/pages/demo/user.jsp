<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
<title>struts2 testDemotitle</title>
</head>
<body>
<s:form action="jsonLoginAction" method="post">
	username : aa<br />
	password : 123 <br />
	you can login success
	<s:textfield key="username" name="user.username" />
	<s:password key="password" name="user.password" />
	<s:submit value="submit" />
</s:form>

</body>
</html>
