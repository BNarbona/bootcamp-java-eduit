<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="ar.com.educacionit.domain.Menu"%>
<%@page import="java.util.Collection"%>
<%@page import="ar.com.educacionit.web.enums.AttributesEnum"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
    <main>
    	    <section>
		    	<%Collection<Menu> menu = (Collection<Menu>)request.getAttribute(AttributesEnum.MENU.getValue());%>
		        <ul class="nav nav-tabs">
		        <% for(Menu m : menu){%>
	  				<li class="nav-item dropdown">
	    				<a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false"><%=m.getTexto()%></a>
	    				<ul class="dropdown-menu">
	      					<li><a class="dropdown-item" href="#">Action</a></li>
	     				</ul>
	  				</li>
	        		<% }%>
	  			</ul>
		</section>
   
    </main>

</body>
</html>