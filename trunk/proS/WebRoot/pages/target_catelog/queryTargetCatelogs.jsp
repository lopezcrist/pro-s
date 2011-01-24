<%@ include file="../common/include_top.jsp"%>
<div id="content">
	<table id="table_center">
		<tr id="table_header">
			<td>序号</td>
			<td>目标分类名称</td>
			<td>目标分类详情</td>
		</tr>
		<s:iterator value="#request.targetCatelogs" status="status">
			<tr>
				<td><s:property value="#status.index+1"/></td>
				<td><s:property value="catelogName"/></td>
				<td><s:property value="catelogDetail"/></td>
			</tr>			
		</s:iterator>
	</table>
</div>
<%@ include file="../common/include_bottom.jsp"%>
