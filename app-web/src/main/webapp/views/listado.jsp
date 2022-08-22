<!DOCTYPE html>
<%@page import="ar.com.educacionit.web.enums.AttributesEnum"%>
<%@page import="ar.com.educacionit.domain.Articulo"%>
<%@page import="java.util.Collection"%>
<html lang="en">
<head>
    <title>Listado de Productos</title>
    <%@include file="/views/header.jsp"%> 
</head>
<body>
	<%@include file="navbar.jsp" %>
    
    
    <main>
    <%@include file="mensajeria.jsp"%>
       <div class="container">
       		<div class="row"> 
       			<div class="col-12">
          			<a class="btn btn-primary" href="#" onclick="openAltaModal()">
          				Crear Producto
       				</a>
       			</div>
       		</div>
	       <div class="row">
	       		<div class="col-12">
	       			<h1>Listado</h1>
			        <section>     
			         	<%Collection<Articulo> lista = (Collection<Articulo>)request.getAttribute(AttributesEnum.ARTICULOS.getValue());%>
			         	<table class="table">
						  <thead>
						    <tr>
						      <th scope="col">#</th>
						      <th scope="col">T&iacutetulo</th>
						      <th scope="col">C&oacutedigo</th>
						      <th scope="col">Precio</th>
						      <th scope="col">Acciones</th>
						    </tr>
						  </thead>
						  <tbody>
							  <%for(Articulo fila:lista){ %>
								    <tr>
								      <th scope="row"><%=fila.getId()%></th>
								      <td><%=fila.getTitulo()%></td>
								      <td><%=fila.getCodigo()%></td>
								      <td><%=fila.getPrecio()%></td>
								      <td>
								      	<!-- Button trigger modal -->
										<button type="button" class="btn btn-danger" 
												data-bs-toggle="modal" data-bs-target="#exampleModal" 
												onclick = "setId(<%=fila.getId()%>)">
										 	Eliminar
										</button>
								      	<!-- Button trigger modal -->
										<button type="button" class="btn btn-primary" 
												data-bs-toggle="modal" data-bs-target="#exampleModal"
												onclick = "preEditar(<%=fila.getId()%>)">
 											Editar
										</button>		
								     </td>
								    </tr>
							   <%}%>
						  </tbody>
						</table>
			         	<a href="<%=request.getContextPath()%>/">Volver</a>
			     	</section>
			     </div>	
     		</div> 
     	</div>
    </main>  
    <!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	  	<form action="<%=request.getContextPath()%>/controller/DeleteArticuloController">
	  		<input type="hidden" name="id" id="idAEliminar">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Eliminar Producto</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	        ¿Esta seguro que desea eliminar el producto?
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	        <button type="submit" class="btn btn-danger" data-bs-dismiss="modal">Confirmar</button>
	        <!-- <a type="button" class="btn btn-primary" href="<%=request.getContextPath()%>/controller/EditarArticuloServlet?id=+fila.getId()" method="GET">Save changes</a>-->
	      </div>
	    </div>
	    </form>
	  </div>
	</div>
	<%@include file="alta.jsp"%>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

<script>

	function setId(id){
		//capturo el hidden por su id
		//guardo el valor
		document.getElementById("idAEliminar").value = id;
	}
	
	function preEditar(id){
		
		axios.get(`<%=request.getContextPath()%>/controller/DetalleArticuloController`)
        .then(function (response) {
            
        })
        .catch(function (error) {
  			alert('');
            
        })
        .then(function () {
        
        });

		
	}
</script>
	
</body>
</html>