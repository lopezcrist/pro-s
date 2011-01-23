<%@ include file="../common/IncludeTop.jsp"%>
<div id="content">
	<s:form action="targetCatelogAction!addTargetCatelog" namespace="/pages/target_catelog" validate="true">
		<table>
			<tr>
				<td colspan="2">
					<s:fielderror cssClass="errorStyle"></s:fielderror>
				</td>
			</tr>
			<tr>
				<td class="tdLabel">目标类型名称:</td>
				<td><s:textfield name="targetCatelog.catelogName" /></td>
			</tr>
			<tr>
				<td class="tdLabel">目标类型详情:</td>
				<td><s:textarea cols="40" rows="4" name="targetCatelog.catelogDetail" /></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<s:submit align="left" type="image" src="/proS/image/login_button.gif" />
				</td>
			</tr>
		</table>
	</s:form>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>
