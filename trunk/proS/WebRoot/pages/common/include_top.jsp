<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="<%=path %>/styles/pros.css" type="text/css"/>
<link rel="stylesheet" href="<%=path %>/styles/jquery/jquery-ui.css" type="text/css"/>
<script type="text/javascript" src="<%=path %>/scripts/jquery/jquery.js"></script>
<script type="text/javascript" src="<%=path %>/scripts/jquery/jquery-ui.js"></script>
<script type="text/javascript" src="<%=path %>/scripts/pros.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>
<div id="center">
<div id="top">
	<s:property value="#session.user.name"/>
	<s:a action="user" method="logout" namespace="/pages/system">退出</s:a>
</div>
<div id="header"><FONT SIZE="3" COLOR="#FFFF33">实现你的目标</FONT></div>
<div id="mainbox">
<div id="menu">
	<div class="menu_item"><s:a action="targetAction" method="queryTargets" namespace="/pages/target">目标</s:a></div>
	<div class="menu_item"><s:a action="targetAction" method="toTargetAddPage" namespace="/pages/target">增加目标</s:a></div>
	<div class="menu_item"><s:a action="targetCatelogAction" method="queryTargetCatelogs" namespace="/pages/target_catelog">目标分类</s:a></div>
	<div class="menu_item"><s:a action="targetCatelogAction" method="toTargetCatelogAddPage" namespace="/pages/target_catelog">增加目标分类</s:a></div>
</div>