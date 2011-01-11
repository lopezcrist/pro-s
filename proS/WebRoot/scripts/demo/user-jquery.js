$(document).ready(function() {
	// 直接把onclick事件写在了JS中
	$("button").click(function() {
		// 序列化表单的值
		var params = $("input").serialize();
		$.ajax({
			// 后台处理程序
			url : "jsonAction.action",
			// 数据发送方式
			type : "post",
			// 接受数据格式
			dataType : "json",
			// 要传递的数据
			data : params,
			// 回传函数
			success : update_page
		});
	});
});

function update_page(result) {
	var json = eval("(" + result + ")");
	var str = "姓名:" + json.username + "<br />";
	str += "密码"
	+ json.password + "<br />";
	$("#result").html(str);
}
