<s:url id="url_first" value="%{actionUrl}">
	<s:param name="pagination.currentPage" value="1"></s:param>
	<s:param name="pagination.totalRows" value="pagination.totalRows"></s:param>
	<s:param name="pagination.navigationPage">first</s:param>
</s:url>
<s:url id="url_pre" value="%{actionUrl}">
	<s:param name="pagination.currentPage" value="pagination.currentPage-1"></s:param>
	<s:param name="pagination.totalRows" value="pagination.totalRows"></s:param>
	<s:param name="pagination.navigationPage">previous</s:param>
</s:url>
<s:url id="url_next" value="%{actionUrl}">
	<s:param name="pagination.currentPage" value="pagination.currentPage+1"></s:param>
	<s:param name="pagination.totalRows" value="pagination.totalRows"></s:param>
	<s:param name="pagination.navigationPage">next</s:param>
</s:url>
<s:url id="url_last" value="%{actionUrl}">
	<s:param name="pagination.currentPage" value="pagination.totalPages"></s:param>
	<s:param name="pagination.totalRows" value="pagination.totalRows"></s:param>
	<s:param name="pagination.navigationPage">last</s:param>
</s:url>
<table id="pagination">
	<tr>
		<td>一共<s:property value="pagination.totalPages" />页</td>
		<td><s:a href="%{url_first}">首页</s:a></td>
		<s:if test="pagination.hasPreviousPage">
			<td><s:a href="%{url_pre}">上一页</s:a></td>
		</s:if>
		<td>当前页【<s:property value="pagination.currentPage" />】</td>
		<s:if test="pagination.hasNextPage">
			<td><s:a href="%{url_next}">下一页</s:a></td>
		</s:if>
		<td><s:a href="%{url_last}">末页</s:a></td>
		<td>一共<s:property value="pagination.totalRows" />条记录</td>
	</tr>
</table>
