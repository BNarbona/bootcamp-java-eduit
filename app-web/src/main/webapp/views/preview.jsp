<!DOCTYPE html>
<%@page import="ar.com.educacionit.services.parser.ArticuloDTO"%>
<%@page import="ar.com.educacionit.web.enums.AttributesEnum"%>
<%@page import="java.util.Collection"%>
<html lang="en">
<head>
    <title>Preview</title>
    <%@include file="/views/header.jsp"%> 
</head>
<body>
	<%@include file="navbar.jsp" %>
    <main>
    <%@include file="mensajeria.jsp"%>
       <div class="container">
		<section>     
	       <div class="row">
	       		<div class="col-12">
	       			<h1>Listado</h1>
			         	<%Collection<ArticuloDTO> lista = (Collection<ArticuloDTO>)request.getSession().getAttribute(AttributesEnum.UPLOAD_PREVIEW_KEY.getValue());%>
			         	<table class="table">
						  <thead>
						    <tr>
						      <th scope="col">T&iacutetulo</th>
						      <th scope="col">C&oacutedigo</th>
						      <th scope="col">Precio</th>
						    </tr>
						  </thead>
						  <tbody>
							  <%for(ArticuloDTO fila:lista){ %>
								    <tr>
								      <td><%=fila.getTitle()%></td>
								      <td><%=fila.getCode()%></td>
								      <td><%=fila.getPrice()%></td>
								    </tr>
							   <%}%>
						  </tbody>
						</table>
				</div>	
			</div>
			<div class="row">
	       		<div class="col-12">
	       			<a role= "button" class = "btn btn-success" href="<%=request.getContextPath()%>/controller/CargarController">
	       			Guardar</a>
				</div>	
			</div>
		</section>
		</div>
    </main>  
</body>
</html>