<%@ include file="../common/include_top.jsp"%>
<script type="text/javascript">
<!--
	$(function(){
		$("#submitButton").click(
			function(){
				if('<s:property value="pageType"/>' == "add"){
					$("#updateForm").attr("action", "<%=request.getContextPath()%>/pages/target_catelog/targetAction_addTarget");
				}else{
					$("#updateForm").attr("action", "<%=request.getContextPath()%>/pages/target_catelog/targetAction_modifyTarget");
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
				<td id="td_left">目标名称:</td>
				<td id="td_left"><s:textfield name="target.name" /></td>
			</tr>
			<tr>
				<td id="td_left">目标分类:</td>
				<td id="td_left">
					<s:select list="targetCatelogs" listKey="id" listValue="name" name="targetCatelogIds" value="%(targetCatelogs.{id})"></s:select>
				</td>
			</tr>
			<tr>
				<td id="td_left">开始日期:</td>
				<td id="td_left"><s:textfield name="target.beginDate" /></td>
			</tr>
			<tr>
				<td id="td_left">结束日期:</td>
				<td id="td_left"><s:textfield name="target.endDate" /></td>
			</tr>
			<tr>
				<td id="td_left">目标详情:</td>
				<td id="td_left"><s:textarea cols="40" rows="4" name="target.detail" /></td>
			</tr>
			<tr>
				<td colspan="2" id="td_center">
					<s:if test="pageType eq 'add'">
						<s:submit id="submitButton" align="left" type="image" src="/proS/image/add_button.png" />
					</s:if>
					<s:else>
						<s:submit id="submitButton" align="left" type="image" src="/proS/image/update_button.png" />
					</s:else>
				</td>
			</tr>
		</table>
		<s:hidden name="target.id" />
		<s:hidden name="pageType" />
	</s:form>
</div>
<%@ include file="../common/include_bottom.jsp"%>
