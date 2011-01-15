<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>struts2 testDemotitle</title>
</head>
<body>
<s:form action="loginAction" validate="true">
	1.请在数据库中建表te_user<br>
	2.有两个属性username,password<br>
	3.并新增一条记录,例如username=aa; password=123456
	<s:textfield key="username" name="user.username" />
	<s:password key="password" name="user.password" />
	<s:submit value="submit" />
</s:form>

</body>
</html>
