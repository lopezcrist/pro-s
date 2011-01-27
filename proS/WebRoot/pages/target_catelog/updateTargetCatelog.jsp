<%@ include file="../common/include_top.jsp"%>
<div id="content">
	<s:form action="targetCatelogAction_addTargetCatelog" namespace="/pages/target_catelog" validate="true">
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
					<s:submit align="left" type="image" src="/proS/image/ok_button.png" />
				</td>
			</tr>
		</table>
	</s:form>
</div>
<%@ include file="../common/include_bottom.jsp"%>
