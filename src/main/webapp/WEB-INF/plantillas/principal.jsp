<%@ include file="/taglibs.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Sistema de Evaluación Docente</title>
	<link type="text/css" rel="stylesheet" href="${ctx}/resources/css/default.css"/>
	<link type="text/css" rel="stylesheet" href="${ctx}/resources/css/aplicacion.css"/>
</head>
<body>
	<div id="pagina" class="container">
		<header>
			<h1>Sistema de Evaluación Docente</h1>
		</header>
		
		<nav>
			<ul>
				<li>
					<a href="${ctx}/">Inicio</a>
				</li>
				<li>
					Salir
				</li>
			</ul>
		</nav>
		
		<div id="contenido">
			<decorator:body/>
		</div>
		
		<footer>
		</footer>
	</div>
</body>
</html>