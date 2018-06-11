<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page language="java" import="java.util.*, view.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <link rel="stylesheet" type="text/css" href="css/Estilos.css"/>
    <title>CRUD</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script type="text/javascript">
    ///////////
    $(function (){
      $("#dialog-confirm").dialog({
      open: function(event, ui) { $(".ui-dialog-titlebar-close", ui.dialog).hide(); },
      resizable: false,
      autoOpen:false,
      height: "auto",
      width: 400,
      modal: true,
      buttons: {
        "Sí": function() {
          $( this ).dialog( "close" );
          window.location="Login.jsp";
          
        },
        "No": function() {
          $( this ).dialog( "close" );
          $("#login").css("opacity","1");
    $("#limpiarCampos").attr("onClick","operacion.value=this.value");
    $("#guardar").attr("onClick","operacion.value=this.value");
    $("#eliminar").attr("onClick","operacion.value=this.value");
        }
      }
    });
  });
    
  function cerrarSesion()
  {
    $("#login").css("opacity","0.5");
    $(".ui-dialog").css("opacity","1");
    $("#dialog-confirm").dialog("open");
    $("#limpiarCampos").attr("onClick","");
    $("#guardar").attr("onClick","");
    $("#eliminar").attr("onClick","");
    $("#acciones").prop("visibility","hidden");
  }
  var anterior="";
  function fila(x){
    if(anterior!=""){
      $(anterior).css("background-color","#d2d4d8");
      $(anterior).css("color","black");
      $(anterior).css("font-weight","normal");
    }
    var actual="#fila"+x;
    $(actual).css("background-color","#70a5f9");
    $(actual).css("color","white");
    $(actual).css("font-weight","bold");
    document.getElementById("id").value=document.getElementById("celda"+x+"_1").innerHTML;
    document.getElementById("email").value=document.getElementById("celda"+x+"_2").innerHTML;
    document.getElementById("nombre").value=document.getElementById("celda"+x+"_3").innerHTML;
    document.getElementById("ap1").value=document.getElementById("celda"+x+"_4").innerHTML;
    document.getElementById("passw").value=document.getElementById("celda"+x+"_5").innerHTML;
    
    anterior=actual;

  }
  function limpiar(){
    document.getElementById("id").value="";
    document.getElementById("email").value="";
    document.getElementById("nombre").value="";
    document.getElementById("ap1").value="";
    document.getElementById("passw").value="";
  }
    </script>
  </head>
  <body>
  <div id="dialog-confirm" title="¿ Estás seguro de querer cerrar sesión ?">
</div>
    <div id="login">
  <button id="cerrarSesion" class="boton" onClick="cerrarSesion()">Cerrar Sesion</button>
    <form method="POST" action="vuelta.do">
     <input type="hidden" id="operacion" value="0" name="operacion" />
     <input type="hidden" id="filaActiva" value="0" name="filaActiva" />
     <input type="hidden" id="idUsuario" value="0" name="idUsuario" />
     <input type="hidden" id="userUsuario" value="0" name="userUsuario" />
      <h2>CRUD</h2>
      <br/>
      <div id="campos">
      Id: <input class="texto" id="id" type="number" min="1" name="id" autofocus/>
      Email: <input class="texto" id="email" type="text" name="email"/>
      Nombre: <input class="texto" id="nombre" type="text" name="nombre"/>
      Ap1: <input class="texto" id="ap1" type="text" name="ap1"/>
      Passw: <input class="texto" id="passw" type="text" name="passw"/><br/>
      </div>
      <input id="buscar" src="Imagenes/BotonBuscar.png" style="float:right;" type="image" name="buscar" value="Buscar" onclick="operacion.value=this.value"></input>
      <div id="acciones">
      <input id="limpiarCampos" src="Imagenes/BotonLimpiar.png" style="display:inline" class="boton" type="button" name="limpiarCampos" value="Limpiar campos" onclick="operacion.value=this.value,limpiar()"></input>
      <input id="guardar" src="Imagenes/BotonGuardar.png" style="margin-left:50px;;display:inline" class="boton" type="submit" name="guardar" value="Guardar" onclick="operacion.value=this.value"></input>
      <input id="eliminar" src="Imagenes/BotonEliminar.png" style="margin-left:50px;display:inline" class="boton" type="submit" name="eliminar" value="Eliminar" onclick="operacion.value=this.value"></input>
      </div>
      <br/><br/>
      
    <table>
      <tr>
        <th>ID</th>
        <th>EMAIL</th>
        <th>NOMBRE</th>
        <th>AP1</th>
        <th>PASSWORD</th>
      </tr>
      
      <%
      String queHacer=(String)request.getAttribute("operacion");
      System.out.println("queHacer: "+ queHacer);
      
      Hashtable tabla = (Hashtable)request.getAttribute("Socios");
      System.out.println(tabla);
      Socio socio= (Socio) request.getAttribute("Socio");
      Enumeration enumeration = tabla.elements();
      
    while(enumeration.hasMoreElements()){
      socio = ((Socio) enumeration.nextElement());  
       
%>
    <tr id="fila<%=socio.getId()%>" onClick="fila('<%=socio.getId()%>'),filaActiva.value=<%=socio.getId()%>">
      <td id="celda<%=socio.getId()%>_1" width="4%"><%=socio.getId()%></td>
      <td id="celda<%=socio.getId()%>_2" width="25%"><%=socio.getEmail()%></td>
      <td id="celda<%=socio.getId()%>_3" width="10%"><%=socio.getNombre()%></td>
      <td id="celda<%=socio.getId()%>_4" width="10%"><%=socio.getAp1()%></td>
      <td id="celda<%=socio.getId()%>_5" width="10%"><%=socio.getPassw()%></td>
    </tr>
         
<%  }   %>
    </table>
    
        </div>
    </form>
    </div>
  </body>
</html>
<html>
  <body/>
</html>