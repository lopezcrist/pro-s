<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发生错误</title>
<style type="text/css">
.outerDiv {
	text-align: center;
	margin-top:40px;
	MARGIN-RIGHT: auto;
	MARGIN-LEFT: auto;
	width: 800px;
	
}

#message {
	border:1px solid black;
	font-family: "宋体";
	font-size: 14px;
	color: red;
	text-align: left;
}

#stack {
	margin-top:3px;
	border:1px solid green;
	text-align: left;
	font-family: "宋体";
	font-size: 12 px;
	color: black;
}
</style>
</head>
<body>
	<div class="outerDiv">
		<div id="message">
			<div style="float: left; padding-left: 200px;">
				<img alt="出错啦" src="<%=request.getContextPath()%>/image/failure.png"/>
			</div>
			<div style="padding-left: 230px;">
				<p><s:property value="%{exception.message}" escape="false"/></p>
			</div>
		</div>
		<div id="stack">
			<p><s:property value="%{exceptionStack}" escape="false"/></p>
		</div>
	</div>
	
</body>
</html>