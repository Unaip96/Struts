<%@ page contentType="text/html;charset=windows-1252"%>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <link rel="stylesheet" type="text/css" href="css/Estilos.css"/>
    <title>Inicio de sesión</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
  </head>
  <body>
    <div id="login">
    <form method="POST" action="inicioSesion.do">
      <h2>LOGIN</h2>
      <div id="cont">Usuario: 
      <input type="text" name="nombre" class="texto campo" autofocus/> <br/><br/>
        Contraseña:
      <input type="password" name="passw" class="texto campo"/>
      </div><br/>
        <input class="boton" id="enviar" type="submit" value="Iniciar Sesión" name="enviar"/></div><br/><br/>
    </form>
    </div>
  </body>
</html>
<html>
  <body/>
</html>
