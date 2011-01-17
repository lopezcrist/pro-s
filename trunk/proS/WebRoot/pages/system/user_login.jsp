<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<html>
<head>
<style>
body {
	text-align: center;
}

#center {
	text-align: center;
	MARGIN-RIGHT: auto;
	MARGIN-LEFT: auto;
	height: 400px;
	width: 300px;
	vertical-align: middle;
	border: solid;
}

#loginDiv {
	text-align: center;
}

table {
	text-align: center;
}
</style>
</head>
<body>
<div id="center">
<table>
	<s:form action="user_login" validate="true">
		<tr>
			<td colspan="2"><s:fielderror cssStyle="FONT-WEIGHT: bold;color:red;font-size:14px;"></s:fielderror>
			</td>
		</tr>
		<tr>
			<td>用户名:</td>
			<td><s:textfield name="user.username" /></td>
		</tr>
		<tr>
			<td>密码:</td>
			<td><s:password name="user.password" /></td>
		</tr>
		<tr>
			<td></td>
			<td>
				<s:submit method="login" align="left" type="image"
				src="../../image/login_button.gif"/> 
				<s:a action="user"
				method="toRegisterPage" namespace="/pages/system">注册</s:a>
			</td>
		</tr>

	</s:form>
</table>
</div>
</body>
</html>
