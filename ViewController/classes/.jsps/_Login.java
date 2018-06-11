  /*@lineinfo:filename=/Login.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _Login extends oracle.jsp.runtime.HttpJsp {

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
    if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) {
      pageContext.setAttribute(OracleJspRuntime.JSP_PAGE_DONTNOTIFY, "true", PageContext.PAGE_SCOPE);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
      return;
}
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _Login page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__oracle_jsp_text[0]);


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
  private static final char __oracle_jsp_text[][]=new char[1][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Estilos.css\"/>\n    <title>Inicio de sesión</title>\n    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n    <script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js\"></script>\n  </head>\n  <body>\n    <div id=\"login\">\n    <form method=\"POST\" action=\"inicioSesion.do\">\n      <h2>LOGIN</h2>\n      <div id=\"cont\">Usuario: \n      <input type=\"text\" name=\"nombre\" class=\"texto campo\" autofocus/> <br/><br/>\n        Contraseña:\n      <input type=\"password\" name=\"passw\" class=\"texto campo\"/>\n      </div><br/>\n        <input class=\"boton\" id=\"enviar\" type=\"submit\" value=\"Iniciar Sesión\" name=\"enviar\"/></div><br/><br/>\n    </form>\n    </div>\n  </body>\n</html>\n<html>\n  <body/>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
