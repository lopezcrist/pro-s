<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<script type="text/javascript">
	function focusText(){
		document.getElementById('username').focus();
	}
</script>
<style>
body {
	text-align: center;
}

input[type='text'] {
	border: solid 1px silver;
	background-color: #e6f0f9;
	width: 200px;
}

.tdLabel {
	padding-left:10px;
	width:70px;
	text-align: left;
	font-family:"宋体"; 
	font-size: 15px; 
	font-style: normal;
	
}

.signinFont {
	font-family:"宋体"; 
	font-size: 15px; 
	font-style: normal;
}
.outerDiv {
	border: 1px solid #000000;
	margin-top: 200px;
	text-align: center;
	MARGIN-RIGHT: auto;
	MARGIN-LEFT: auto;
	width: 300px;
	vertical-align: middle;
}

#header {
	width: 300px;
	height: 100px;
	border-bottom: 1px solid #000000;
}

#message {
	margin-bottom:2px;
	width: 300px;
	text-align: center;
	font-weight: bold;
	color: red;
	font-size: 14px;
}

table {
	text-align: center;
	width: 300x;
}

.errorStyle {
	text-align: left;
	FONT-WEIGHT: bold;
	color: red;
	font-size: 14px;
}

.s_text {
	width:160px;
}
</style>
</head>
<body onload="focusText()">
<div class="outerDiv">
<div id="header">
	这是标题
</div>
<table>
	<s:form action="user_login" namespace="/pages/system" validate="true">
		<tr>
			<td colspan="2">
				<s:fielderror cssClass="errorStyle"></s:fielderror>
			</td>
		</tr>
		<tr>
			<td id="message" colspan="2">
				<s:property value="#request.register_success"/>
			</td>
		</tr>
		<tr>
			<td class="tdLabel">用户名:</td>
			<td><s:textfield id="username" cssClass="s_text" name="user.name" /></td>
		</tr>
		<tr>
			<td class="tdLabel">密码:</td>
			<td><s:password cssClass="s_text" name="user.password" /></td>
		</tr>
		<tr>
			<td></td>
			<td>
				<s:submit method="login" align="left" type="image" src="/proS/image/login_button.png" />
				<s:a cssClass="signinFont" action="user" method="toRegisterPage" namespace="/pages/system">注册	</s:a>
			</td>
		</tr>
	</s:form>
</table>
</div>
</body>
</html>
