package view;
import java.util.Hashtable;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class loginAction extends Action
{
  public ActionForward execute(ActionMapping mapping, 
                                 ActionForm form,
                                 HttpServletRequest request, 
                                 HttpServletResponse response){
       System.out.println("********** LoginAction ********");
       String destino="respuesta";
       loginForm loginForma = (loginForm) form;
       //Obtenemos los datos introducidos por el usuario
       String IdUsuario=loginForma.getId();
       String user=loginForma.getNombre();
       String passw=loginForma.getPassw();
       Hashtable tabla = loginForma.todos();
       //Nos aseguramos
       System.out.println("IdUsuario: "+IdUsuario);
       System.out.println("user: "+user);
       System.out.println("password: "+passw);
       System.out.println("tabla: "+tabla);
       
       // a) Hashtable Listasocios = DBF.instance().getListaSocios();
      boolean haysocio=loginForma.login(user,passw);

        // Agregamos al request el atributo 
      request.setAttribute("IdUsuario",IdUsuario);
      request.setAttribute("userUsuario",user);
      request.setAttribute("operacion","0");
       request.setAttribute("Socios",tabla);
       
        // Seleccionamos la siguiente pagina definida en el struts-config.xml
   ActionForward fwd;
     if(haysocio){fwd = mapping.findForward("respuesta");}
     else{fwd = mapping.findForward("inicio");}
   return fwd;
                                 }
}