  /*@lineinfo:filename=/Crud.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import view.*;


public class _Crud extends com.orionserver.http.OrionHttpJspPage {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _Crud page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__oracle_jsp_text[0]);
      __ojsp_s_out.write(__oracle_jsp_text[1]);
      /*@lineinfo:user-code*//*@lineinfo:112^7*/      
            String queHacer=(String)request.getAttribute("operacion");
            System.out.println("queHacer: "+ queHacer);
            
            Hashtable tabla = (Hashtable)request.getAttribute("Socios");
            System.out.println(tabla);
            Socio socio= (Socio) request.getAttribute("Socio");
            Enumeration enumeration = tabla.elements();
            
          while(enumeration.hasMoreElements()){
            socio = ((Socio) enumeration.nextElement());  
             
      
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[2]);
      /*@lineinfo:user-code*//*@lineinfo:125^17*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[3]);
      /*@lineinfo:user-code*//*@lineinfo:125^52*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[4]);
      /*@lineinfo:user-code*//*@lineinfo:125^90*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[5]);
      /*@lineinfo:user-code*//*@lineinfo:126^20*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[6]);
      /*@lineinfo:user-code*//*@lineinfo:126^53*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[7]);
      /*@lineinfo:user-code*//*@lineinfo:127^20*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[8]);
      /*@lineinfo:user-code*//*@lineinfo:127^54*/      out.print(socio.getEmail());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[9]);
      /*@lineinfo:user-code*//*@lineinfo:128^20*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[10]);
      /*@lineinfo:user-code*//*@lineinfo:128^54*/      out.print(socio.getNombre());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[11]);
      /*@lineinfo:user-code*//*@lineinfo:129^20*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[12]);
      /*@lineinfo:user-code*//*@lineinfo:129^54*/      out.print(socio.getAp1());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[13]);
      /*@lineinfo:user-code*//*@lineinfo:130^20*/      out.print(socio.getId());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[14]);
      /*@lineinfo:user-code*//*@lineinfo:130^54*/      out.print(socio.getPassw());
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[15]);
      /*@lineinfo:user-code*//*@lineinfo:133^1*/        }   
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__oracle_jsp_text[16]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,false);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final byte __oracle_jsp_text[][]=new byte[17][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".getBytes("Cp1252");
    __oracle_jsp_text[1] = 
    "\r\n<html>\r\n  <head>\r\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Estilos.css\"/>\r\n    <title>CRUD</title>\r\n    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n    <script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js\"></script>\r\n    <script type=\"text/javascript\">\r\n    ///////////\r\n    $(function (){\r\n      $(\"#dialog-confirm\").dialog({\r\n      open: function(event, ui) { $(\".ui-dialog-titlebar-close\", ui.dialog).hide(); },\r\n      resizable: false,\r\n      autoOpen:false,\r\n      height: \"auto\",\r\n      width: 400,\r\n      modal: true,\r\n      buttons: {\r\n        \"Sí\": function() {\r\n          $( this ).dialog( \"close\" );\r\n          window.location=\"Login.jsp\";\r\n          \r\n        },\r\n        \"No\": function() {\r\n          $( this ).dialog( \"close\" );\r\n          $(\"#login\").css(\"opacity\",\"1\");\r\n    $(\"#limpiarCampos\").attr(\"onClick\",\"operacion.value=this.value\");\r\n    $(\"#guardar\").attr(\"onClick\",\"operacion.value=this.value\");\r\n    $(\"#eliminar\").attr(\"onClick\",\"operacion.value=this.value\");\r\n        }\r\n      }\r\n    });\r\n  });\r\n    \r\n  function cerrarSesion()\r\n  {\r\n    $(\"#login\").css(\"opacity\",\"0.5\");\r\n    $(\".ui-dialog\").css(\"opacity\",\"1\");\r\n    $(\"#dialog-confirm\").dialog(\"open\");\r\n    $(\"#limpiarCampos\").attr(\"onClick\",\"\");\r\n    $(\"#guardar\").attr(\"onClick\",\"\");\r\n    $(\"#eliminar\").attr(\"onClick\",\"\");\r\n    $(\"#acciones\").prop(\"visibility\",\"hidden\");\r\n  }\r\n  var anterior=\"\";\r\n  function fila(x){\r\n    if(anterior!=\"\"){\r\n      $(anterior).css(\"background-color\",\"#d2d4d8\");\r\n      $(anterior).css(\"color\",\"black\");\r\n      $(anterior).css(\"font-weight\",\"normal\");\r\n    }\r\n    var actual=\"#fila\"+x;\r\n    $(actual).css(\"background-color\",\"#70a5f9\");\r\n    $(actual).css(\"color\",\"white\");\r\n    $(actual).css(\"font-weight\",\"bold\");\r\n    document.getElementById(\"id\").value=document.getElementById(\"celda\"+x+\"_1\").innerHTML;\r\n    document.getElementById(\"email\").value=document.getElementById(\"celda\"+x+\"_2\").innerHTML;\r\n    document.getElementById(\"nombre\").value=document.getElementById(\"celda\"+x+\"_3\").innerHTML;\r\n    document.getElementById(\"ap1\").value=document.getElementById(\"celda\"+x+\"_4\").innerHTML;\r\n    document.getElementById(\"passw\").value=document.getElementById(\"celda\"+x+\"_5\").innerHTML;\r\n    \r\n    anterior=actual;\r\n\r\n  }\r\n  function limpiar(){\r\n    document.getElementById(\"id\").value=\"\";\r\n    document.getElementById(\"email\").value=\"\";\r\n    document.getElementById(\"nombre\").value=\"\";\r\n    document.getElementById(\"ap1\").value=\"\";\r\n    document.getElementById(\"passw\").value=\"\";\r\n  }\r\n    </script>\r\n  </head>\r\n  <body>\r\n  <div id=\"dialog-confirm\" title=\"¿ Estás seguro de querer cerrar sesión ?\">\r\n</div>\r\n    <div id=\"login\">\r\n  <button id=\"cerrarSesion\" class=\"boton\" onClick=\"cerrarSesion()\">Cerrar Sesion</button>\r\n    <form method=\"POST\" action=\"vuelta.do\">\r\n     <input type=\"hidden\" id=\"operacion\" value=\"0\" name=\"operacion\" />\r\n     <input type=\"hidden\" id=\"filaActiva\" value=\"0\" name=\"filaActiva\" />\r\n     <input type=\"hidden\" id=\"idUsuario\" value=\"0\" name=\"idUsuario\" />\r\n     <input type=\"hidden\" id=\"userUsuario\" value=\"0\" name=\"userUsuario\" />\r\n      <h2>CRUD</h2>\r\n      <br/>\r\n      <div id=\"campos\">\r\n      Id: <input class=\"texto\" id=\"id\" type=\"number\" min=\"1\" name=\"id\" autofocus/>\r\n      Email: <input class=\"texto\" id=\"email\" type=\"text\" name=\"email\"/>\r\n      Nombre: <input class=\"texto\" id=\"nombre\" type=\"text\" name=\"nombre\"/>\r\n      Ap1: <input class=\"texto\" id=\"ap1\" type=\"text\" name=\"ap1\"/>\r\n      Passw: <input class=\"texto\" id=\"passw\" type=\"text\" name=\"passw\"/><br/>\r\n      </div>\r\n      <input id=\"buscar\" src=\"Imagenes/BotonBuscar.png\" style=\"float:right;\" type=\"image\" name=\"buscar\" value=\"Buscar\" onclick=\"operacion.value=this.value\"></input>\r\n      <div id=\"acciones\">\r\n      <input id=\"limpiarCampos\" src=\"Imagenes/BotonLimpiar.png\" style=\"display:inline\" class=\"boton\" type=\"button\" name=\"limpiarCampos\" value=\"Limpiar campos\" onclick=\"operacion.value=this.value,limpiar()\"></input>\r\n      <input id=\"guardar\" src=\"Imagenes/BotonGuardar.png\" style=\"margin-left:50px;;display:inline\" class=\"boton\" type=\"submit\" name=\"guardar\" value=\"Guardar\" onclick=\"operacion.value=this.value\"></input>\r\n      <input id=\"eliminar\" src=\"Imagenes/BotonEliminar.png\" style=\"margin-left:50px;display:inline\" class=\"boton\" type=\"submit\" name=\"eliminar\" value=\"Eliminar\" onclick=\"operacion.value=this.value\"></input>\r\n      </div>\r\n      <br/><br/>\r\n      \r\n    <table>\r\n      <tr>\r\n        <th>ID</th>\r\n        <th>EMAIL</th>\r\n        <th>NOMBRE</th>\r\n        <th>AP1</th>\r\n        <th>PASSWORD</th>\r\n      </tr>\r\n      \r\n      ".getBytes("Cp1252");
    __oracle_jsp_text[2] = 
    "\r\n    <tr id=\"fila".getBytes("Cp1252");
    __oracle_jsp_text[3] = 
    "\" onClick=\"fila('".getBytes("Cp1252");
    __oracle_jsp_text[4] = 
    "'),filaActiva.value=".getBytes("Cp1252");
    __oracle_jsp_text[5] = 
    "\">\r\n      <td id=\"celda".getBytes("Cp1252");
    __oracle_jsp_text[6] = 
    "_1\" width=\"4%\">".getBytes("Cp1252");
    __oracle_jsp_text[7] = 
    "</td>\r\n      <td id=\"celda".getBytes("Cp1252");
    __oracle_jsp_text[8] = 
    "_2\" width=\"25%\">".getBytes("Cp1252");
    __oracle_jsp_text[9] = 
    "</td>\r\n      <td id=\"celda".getBytes("Cp1252");
    __oracle_jsp_text[10] = 
    "_3\" width=\"10%\">".getBytes("Cp1252");
    __oracle_jsp_text[11] = 
    "</td>\r\n      <td id=\"celda".getBytes("Cp1252");
    __oracle_jsp_text[12] = 
    "_4\" width=\"10%\">".getBytes("Cp1252");
    __oracle_jsp_text[13] = 
    "</td>\r\n      <td id=\"celda".getBytes("Cp1252");
    __oracle_jsp_text[14] = 
    "_5\" width=\"10%\">".getBytes("Cp1252");
    __oracle_jsp_text[15] = 
    "</td>\r\n    </tr>\r\n         \r\n".getBytes("Cp1252");
    __oracle_jsp_text[16] = 
    "\r\n    </table>\r\n    \r\n        </div>\r\n    </form>\r\n    </div>\r\n  </body>\r\n</html>\r\n<html>\r\n  <body/>\r\n</html>".getBytes("Cp1252");
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
