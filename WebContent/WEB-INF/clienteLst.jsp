<%@page import ="com.clientes.bean.ClienteBean" %>
<%@page import ="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<script type="text/javascript">
	function nuevo(){
		document.location="clienteMnt.jsp";
	}
	function buscar(){
		var razSocial = document.getElementById("txtRazSocial").value;
		document.frmLst.action ="clienteServlet?accion "= buscar&razSocial=" + razSocial"; 
		document.frmLstsubmit();
	}
	function obtenerPorId(id){
		document.frmLst.action ="clienteServlet?accion "= obtenerPorId&id=" + id"; 
		document.frmLstsubmit();
	</script>
</head>
<body>

</body>
</html>