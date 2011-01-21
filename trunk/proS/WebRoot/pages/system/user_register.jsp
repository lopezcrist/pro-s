<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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

.outerDiv {
	text-align: center;
	MARGIN-RIGHT: auto;
	MARGIN-LEFT: auto;
	height: 400px;
	width: 250px;
	vertical-align: middle;
	border: solid red;
}

.tdLabel {
	text-align: left;
}

.loginDiv {
	text-align: center;
}

table {
	text-align: center;
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
	<s:form action="user_register" validate="true">
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
				<td class="tdLabel">重复密码:</td>
				<td><s:password name="user.passwordRe" /></td>
			</tr>
			<tr>
				<td class="tdLabel">邮箱:</td>
				<td><s:textfield name="user.email" /></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<s:submit align="center" type="image" src="../../image/register_button.gif" />
					<s:a action="index" namespace="/">登陆</s:a>
				</td>
			</tr>
		
	</s:form>
	</table>
</div>
</body>
</html>
