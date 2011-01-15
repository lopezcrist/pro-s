<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../../scripts/jquery/jquery.js"></script>
<script type="text/javascript" src="../../scripts/demo/user-jquery.js"></script>
</head>
<body>
<center>
<table>
	<tr>
		<td>用户名：</td>
		<td>
			<s:textfield id="username" name="username"/>
		</td>
	</tr>
	<tr>
		<td>密码：</td>
		<td>
			<s:password id="password" name="password"/>
		</td>
	</tr>
	<tr>
		<td colspan="2"><input type="button" id="btn_login" value="Login" />
		</td>
	</tr>
</table>
<p>这里显示ajax信息： <br />
<span id="result"></span></p>
</center>
</body>
</html>
