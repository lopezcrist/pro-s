<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<html>
<head>
<style>

body {
	text-align: center;
}

td {
	border: solid;
}

table {
	border:solid blue;
}

.tdLabel {
	text-align: left;
}

.outerDiv {
	text-align: center;
	MARGIN-RIGHT: auto;
	MARGIN-LEFT: auto;
	height: 400px;
	width: 260px;
	vertical-align: middle;
	border: solid red;
}

.loginDiv {
	text-align: center;
}

table {
	text-align: center;
	width: 260px;
}

.errorStyle {
	text-align: left;
	FONT-WEIGHT: bold;
	color: red;
	font-size: 14px;
}
</style>
</head>
<body>
<div class="outerDiv">
<table>
	<s:form action="user_login" namespace="/pages/system" validate="true">
		<tr>
			<td colspan="2">
				<s:fielderror cssClass="errorStyle"></s:fielderror>
			</td>
		</tr>
		<tr>
			<td class="tdLabel">用户名:</td>
			<td><s:textfield name="user.username" /></td>
		</tr>
		<tr>
			<td class="tdLabel">密码:</td>
			<td><s:password name="user.password" /></td>
		</tr>
		<tr>
			<td></td>
			<td>
				<s:submit method="login" align="left" type="image" src="/proS/image/login_button.gif" />
				<s:a action="user" method="toRegisterPage" namespace="/pages/system">注册</s:a>
			</td>
		</tr>

	</s:form>
</table>
</div>
</body>
</html>
