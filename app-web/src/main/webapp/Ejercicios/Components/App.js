
//funciones
function renderApp(divRoot){
	root.innerHTML = Container();
	render();
}


function render(){
	const divTareas = document.getElementById('tareas');
	divTareas.innerHTML ='';
	let tareasInLocalStorage = getTareas();
	
	divTareas.innerHTML = List(tareasInLocalStorage);
}

//componentes
function App(){
	renderApp(root);
}