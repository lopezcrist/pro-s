<%@ include file="../common/include_top.jsp"%>
<script type="text/javascript">
	$(function(){
		// Dialog			
		$('#dialog').dialog({
			autoOpen: false,
			width: 300,
			buttons: {
				"确 定": function() { 
					$("#operateForm").submit();
					$(this).dialog("close"); 
				}, 
				"取 消": function() { 
					$(this).dialog("close"); 
				} 
			}
		});

		$("img[id^=updateImg]").click(
			function(){
				$("#itemId").attr("value", $(this).attr('name'));
				$("#operateForm").attr("action", "<%=request.getContextPath()%>/pages/target_catelog/targetCatelogAction_toModifyTargetCatelogPage.action");
				$("#operateForm").submit();
			}
		)
		
		$("img[id^=deleteImg]").click(
			function(){
				$('#dialog*').dialog('open');
				$("#itemId").attr("value", $(this).attr('name'));
				$("#operateForm").attr("action", "<%=request.getContextPath()%>/pages/target_catelog/targetCatelogAction_removeTargetCatelog.action");
				return false;
			}
		)
		
	});
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
			<td width="100px">
				<img name='<s:property value="id" />' id="deleteImg<s:property value="#status.index+1" />" class="imgClass" src="../../image/delete_button.png"></img> 
				<img name='<s:property value="id" />' id="updateImg<s:property value="#status.index+1" />" class="imgClass" src="../../image/update_button.png"></img>
			</td>
			<td><s:property value="name" /></td>
			<td><s:property value="catelogDetail" /></td>
		</tr>
	</s:iterator>
</table>
<%@ include file="../common/pagination.jsp"%></div>
<s:form id="operateForm">
	<s:hidden id="itemId" name="targetCatelog.id" />
</s:form>
<s:set name="actionUrl" value="/pages/target_catelog/targetCatelogAction_queryTargetCatelogs.action" />
<div id="dialog" title="确定">
	<p>确定删除记录</p>
</div>
<%@ include file="../common/include_bottom.jsp"%>
