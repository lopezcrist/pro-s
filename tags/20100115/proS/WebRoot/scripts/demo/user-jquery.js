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
							alert("username : " + params.username + " || password : " + params.password);
							//使用$.post方式      
							$.post(url, //服务器要接受的url  
							params, //传递的参数       
							function cbf(data) { //服务器返回后执行的函数 参数 data保存的就是服务器发送到客户端的数据  
								//alert(data);  
								var member = eval("(" + data + ")"); //包数据解析为json 格式    
								$('#result').html(
										"username ：  " + member.username + "<br>password ："
												+ member.password);
							}, 'json' //数据传递的类型  json  
							);
						});
			});