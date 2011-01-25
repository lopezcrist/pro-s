<%@ include file="../common/include_top.jsp"%>
<<style>
<!--
	#pagination{
		text-align: center;
		width: 760px;
	}
	
	.page {
		float: left;
	}
-->
</style>
<s:form id="queryCatelogForm"
	action="targetCatelogAction_queryTargetCatelogs"
	namespace="/pages/target_catelog">
</s:form>
<div id="content">
<table id="table_center">
	<tr id="table_header">
		<td>序号</td>
		<td>目标分类名称</td>
		<td>目标分类详情</td>
	</tr>
	<s:iterator value="#request.targetCatelogs" status="status">
		<tr>
			<td><s:property value="#status.index+1" /></td>
			<td><s:property value="catelogName" /></td>
			<td><s:property value="catelogDetail" /></td>
		</tr>
	</s:iterator>
</table>
<div id="pagination" class="pagination">
	<s:url id="url_first" value="/pages/target_catelog/targetCatelogAction_queryTargetCatelogs.action">
		<s:param name="page.currentPage" value="1"></s:param>
		<s:param name="page.totalRows" value="page.totalRows"></s:param>
		<s:param name="page.navigationPage">first</s:param>
	</s:url>
	<s:url id="url_pre" value="/pages/target_catelog/targetCatelogAction_queryTargetCatelogs.action">
		<s:param name="page.currentPage" value="page.currentPage-1"></s:param>
		<s:param name="page.totalRows" value="page.totalRows"></s:param>
		<s:param name="page.navigationPage">previous</s:param>
	</s:url>
	<s:url id="url_next" value="/pages/target_catelog/targetCatelogAction_queryTargetCatelogs.action">
		<s:param name="page.currentPage" value="page.currentPage+1"></s:param>
		<s:param name="page.totalRows" value="page.totalRows"></s:param>
		<s:param name="page.navigationPage">next</s:param>
	</s:url>
	<s:url id="url_last" value="/pages/target_catelog/targetCatelogAction_queryTargetCatelogs.action">
		<s:param name="page.currentPage" value="page.totalPages"></s:param>
		<s:param name="page.totalRows" value="page.totalRows"></s:param>
		<s:param name="page.navigationPage">last</s:param>
	</s:url>
	<table>
		<tr>
			<td>一共<s:property value="page.totalPages"/>页</td>
			<td><s:a href="%{url_first}">首页</s:a></td>
			<s:if test="page.hasPreviousPage">
				<td><s:a href="%{url_first}">上一页</s:a></td>
			</s:if>
			<td>当前页【<s:property value="page.currentPage"/>】</td>
			<s:if test="page.hasNextPage">
				<td><s:a href="%{url_next}">下一页</s:a></td>
			</s:if>
			<td><s:a href="%{url_last}">末页</s:a></td>
			<td>一共<s:property value="page.totalRows"/>条记录</td>
		</tr>
	</table>
</div>
</div>
<%@ include file="../common/include_bottom.jsp"%>
