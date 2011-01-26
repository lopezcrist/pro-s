<%@ include file="../common/include_top.jsp"%>
<script type="text/javascript">
	$("#deleteImg").click(
		function deleteItem(itemIdValue){
			$("#itemId").attr("value", itemIdValue);
			$("#operateForm").attr("action", "<%=request.getContextPath()%>/pages/target_catelog/targetCatelogAction_removeTargetCatelog.action");			
			$("#operateForm").submit();
		}
	)
	$("#updateImg").click(
		function updateItem(itemIdValue){
			$("#itemId").attr("value", itemIdValue);
			$("#operateForm").attr("action", "<%=request.getContextPath()%>/pages/target_catelog/targetCatelogAction_toModifyTargetCatelogPage.action");			
			$("#operateForm").submit();
		}
	)
</script>
<div id="content">
<table id="table_center">
	<tr id="table_header">
		<td>序号</td>
		<td>操作</td>
		<td>目标分类名称</td>
		<td>目标分类详情</td>
	</tr>
	
	<s:iterator value="#request.targetCatelogs" status="status">
		<tr>
			<td><s:property value="#status.index+1" /></td>
			<td>
				<img id="deleteImg" src="../../image/delete_button.png" onclick="deleteItem('<s:property value="catelogId" />')"></img>
				<img id="updateImg" src="../../image/update_button.png" onclick="updateItem('<s:property value="catelogId" />')"></img>
			</td>
			<td><s:property value="catelogName" /></td>
			<td><s:property value="catelogDetail" /></td>
		</tr>
	</s:iterator>
</table>
<s:form id="operateForm">
	<s:hidden id="itemId" name="targetCatelog.catelogId"/>
</s:form>
<%@ include file="../common/pagination.jsp"%>
</div>
<%@ include file="../common/include_bottom.jsp"%>
