<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>
</head>
<script type="text/javascript" >
  function del(){
	  $.ajax({
		  type:"delete",
	      url:"http://localhost:8080/delete/3",
	      async:true,
	      success : function(data) {
				alert(data);
			}
	  });
  }
  
  function upd(){
	  $.ajax({
		  type:"put",
		  data:"id=5&name=dd&password=233",
		  url:"http://localhost:8080/update",
		  async:true,//关于同步或异步
		  success : function(data) {
			  alert(data);
			}
				  
	  });
  }
</script>
<body >
  <table border="1px" >
     <tr >
      <td width="30px">姓名</td>
      <td width="30px">密码</td>
      <td width="30px">操作</td>
     </tr>
     <tr>
     <td width="30px">zs</td>
     <td width="30px">123</td>
     <td width="100px"><input type="button" onclick="del()" value="删除"><input type="button" onclick="upd()" value="修改"></td>
     </tr>
  </table>
</body>
</html>