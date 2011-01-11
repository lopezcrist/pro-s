<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../../scripts/jquery/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				//使用 Ajax 的方式 判断登录  
				$("#btn_login").click(
						function() {
							var url = 'jsonAction.action';
							//获取表单值，并以json的数据形式保存到params中  
							var params = {
								username : $("#username").val(),
								password : $("#password").val()
							//上行结尾决对不加逗号（，）。如果加了在IE6下就不能运行实现了。  
							}
							alert(params.username);
							//使用$.post方式      
							$.post(url, //服务器要接受的url  
							params, //传递的参数       
							function cbf(data) { //服务器返回后执行的函数 参数 data保存的就是服务器发送到客户端的数据  
								//alert(data);  
								var member = eval("(" + data + ")"); //包数据解析为json 格式    
								$('#result').html(
										"欢迎您：  " + member.username + "<br>您的密码是："
												+ member.password);
							}, 'json' //数据传递的类型  json  
							);
						});
			});
</script>
</head>
<body>
<center>
<table>
	<tr>
		<td>用户名：</td>
		<td>
			<s:textfield id="username" name="username"/>
		</td>
	</tr>
	<tr>
		<td>密码：</td>
		<td>
			<s:password id="password" name="password"/>
		</td>
	</tr>
	<tr>
		<td colspan="2"><input type="button" id="btn_login" value="Login" />
		</td>
	</tr>
</table>
<p>这里显示ajax信息： <br />
<span id="result"></span></p>
</center>
</body>
</html>
