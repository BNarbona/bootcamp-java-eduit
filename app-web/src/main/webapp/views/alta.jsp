<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="staticBackdropLabel">Alta de Producto</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
       <form  action="" method="POST" id="frmArticulo">
			  <div class="mb-3">
			    <label for="titulo" class="form-label">Titulo</label>
			    <input type="text" class="form-control" id="titulo" name="titulo">
			  </div>
			  <div class="mb-3">
			    <label for="codigo" class="form-label">Codigo</label>
			    <input type="number" class="form-control" id="codigo" name="codigo">
			  </div>
		  	  <div class="mb-3">
			    <label for="precio" class="form-label">Precio</label>
			    <input type="number" class="form-control" id="precio" name="precio">
			  </div>
			    <div class="mb-3">
			    <label for="stock" class="form-label">Stock</label>
			    <input type="text" class="form-control" id="stock" name="stock">
			  </div>
				<div class="mb-3">
				 <label for="marcas" class="form-label">Marcas</label>
					<select class="form-select" aria-label="Marcas" id="marcas" name = "marcaId">
					</select>
			  	</div>
			  <div class="mb-3">
			   <label for="categorias" class="form-label">Categorias</label>
				  	<select class="form-select" aria-label="Categorias" id="categorias" name = "categoriaId">
					</select>
				</div>
			  <button type="submit" class="btn btn-primary">Guardar</button>
		</form>
      </div>
    </div>
  </div>
</div>
<script>
	/*const msj = {
	type:'error',
	msj: error.message
	};*/
	
	function Message(message) {
	const divError = document.getElementById('divError');
	const alert = `
	<div class="alert alert-${message.type} alert-dismissible fade show" role="alert">
	    <strong>${message.msj}</strong>
	    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
	</div> 
	`;
	divError.innerHTML = alert;
	}
	
	async function openAltaModal(id){
		var myModal = new bootstrap.Modal(document.getElementById('staticBackdrop'), {
			  keyboard: false
			});
        
		const action = 	id ? '/controller/EditarArticuloController' : '/controller/CrearArticuloController';
        const response = await axios.get(`<%=request.getContextPath()%>/api/AltaDatosController`);       
	    Categorias(response.data.categorias)
	    Marcas(response.data.marcas)

	    document.getElementById('frmArticulo').action = `<%=request.getContextPath()%>/${action}`;
	    //si id esta informado hay que desactivar el campo codigo
	    if(id){
		    document.getElementById('codigo').diseabled = "disabled";
		    const articulo = await getProducto(id);
		    llenarFormulario(articulo);
	    } else{
	    	document.getElementById('codigo').diseabled = "";
	    }
	    
	    myModal.show();
     }
	
	function llenarFormulario(articulo){
		console.log(articulo);	
	}
	
	
	async function getProducto(id){
		return await axios.get(`<%=request.getContextPath()%>/controller/EditarArticuloController?id=${id}`);
		
		
	}     
	
	function Marcas (marcas){
		llenarLista('marcas', marcas);
	}
	
	function Categorias (categorias){
		llenarLista('categorias', categorias);
	}
	
	function llenarLista (id,lista){
		const htmlSelect = document.getElementById(id);
		if(lista.length > 0){
			for(const aux of lista){
				if(aux.habilitada===1){
					const option = document.createElement('option');
					option.id = aux.id;
					option.value = aux.id;
					option.text = aux.descripcion;
					htmlSelect.appendChild(option) //nodo objeto
				}
			}	
		}
	}

</script>