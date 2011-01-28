<%@ include file="../common/include_top.jsp"%>
<script type="text/javascript">
<!--
	$(function(){
		$("#submitButton").click(
			function(){
				if('<s:property value="pageType"/>' == "add"){
					$("#updateForm").attr("action", "<%=request.getContextPath()%>/pages/target_catelog/targetCatelogAction_addTargetCatelog");
				}else{
					$("#updateForm").attr("action", "<%=request.getContextPath()%>/pages/target_catelog/targetCatelogAction_modifyTargetCatelog");
				}
			}
		)
	})
//-->
</script>
<div id="content">
	<s:form id="updateForm" validate="true">
		<table id="table_center">
			<tr>
				<td colspan="2">
					<s:fielderror cssClass="errorStyle"></s:fielderror>
				</td>
			</tr>
			<tr>
				<td id="td_left">目标类型名称:</td>
				<td id="td_left"><s:textfield name="targetCatelog.name" /></td>
			</tr>
			<tr>
				<td id="td_left">目标类型详情:</td>
				<td id="td_left"><s:textarea cols="40" rows="4" name="targetCatelog.catelogDetail" /></td>
			</tr>
			<tr>
				<td colspan="2" id="td_center">
					<s:submit id="submitButton" align="left" type="image" src="/proS/image/ok_button.png" />
				</td>
			</tr>
		</table>
		<s:hidden name="targetCatelog.id" />
	</s:form>
</div>
<%@ include file="../common/include_bottom.jsp"%>
