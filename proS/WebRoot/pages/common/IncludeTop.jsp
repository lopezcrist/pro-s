<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%> 	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
<style type="text/css">
<!--
body {
	text-align: center;
}

#center {
	margin-top:50px;
	MARGIN-RIGHT: auto;
	MARGIN-LEFT: auto;
	width: 800px;
}

#header {
	line-height: 100px;
	font-size: 30px;
	font-family: sans-serif;
	margin: 0px;
	clear: both;
	background: black;
	width: 800px;
	height: 100px;
	text-align: center;
	padding-top: 12px;
}

#mainbox {
	margin: auto 0px;
	width: 800px;
	background: blue;
	height: 410px;
}

#menu {
	margin: 12px 20px 5px 20px;
	background: red;
	width: 760px;
	height: 30px;
}  /******* margin 上右下左*******/

.menu_item {
	margin: 2px 10px 2px 20px;
	float: left;
	background-color: yellow;
}

#content {
	margin: 12px 20px 5px; 20 px;
	width: 760px;
	height: 330px;
	background: green;
	padding-bottom: 12px
}

#footer {
	margin-rop: 0px;
	width: 800px;
	height: 40px;
	background: #fff000;
}
-->
</style>
</head>
<body>
<div id="center">
<div id="header"><FONT SIZE="3" COLOR="#FFFF33">实现你的目标</FONT></div>
<div id="mainbox">
<div id="menu">
	<div class="menu_item">目标</div>
	<div class="menu_item">增加目标</div>
	<div class="menu_item"><s:a action="targetCatelogAction" method="toTargetCatelogAddPage" namespace="/pages/target_catelog">目标分类</s:a></div>
	<div class="menu_item">增加目标分类</div>
</div>