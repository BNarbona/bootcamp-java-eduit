function List(items){
	let List = '<ul>';
	for (let i = 0; i < items.length; i++) {
			List += Item(items[i]);
	}
	List+='</ul>';
	
	return List;
}
	
function agregarItem(){
	let inputTarea = document.getElementById('tarea');
	
	let valorDelInput = inputTarea.value;
	
	if(!valorDelInput){
		return;
	}
	
	let tareas = getTareas();
	
	const item = {
		id: Math.random(),
		value: valorDelInput
		
	};
	
	//tareas.push(valorDelInput);
	tareas.push(item);
	
	//antes de guardar
	//localStorage.setItem('tareas', JSON.stringify(tareas));
	
	setTareas(tareas);
	
	//limpiar el input
	inputTarea.value = '';
	inputTarea.focus();
	render();
}  
	
	
function eliminarItem(id){

	if(confirm('¿Confirma?')){
		let tareas = getTareas();
		let tareasAux = [];
		for(let i=0; i<tareas.length; i ++){
			if(tareas[i].id !== id){
				tareasAux.push(tareas[i]);
			}
		}
		
	setTareas(tareasAux);
	render();
	}
}

function eliminarTodos(){
	const eliminar = confirm('¿Confirma que desea borrar todo?');
	if(eliminar){
		localStorage.removeItem('tareas');
		render();
	}
	
}