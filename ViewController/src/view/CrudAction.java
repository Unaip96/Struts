package view;
import java.util.Enumeration;
import java.util.Hashtable;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class CrudAction extends Action
{
  public ActionForward execute(ActionMapping mapping, 
                                 ActionForm form,
                                 HttpServletRequest request, 
                                 HttpServletResponse response){
       System.out.println("********** LoginAction ********");
       
       CrudForm CrudForma = (CrudForm) form;
       String operacion=CrudForma.getOperacion();
       System.out.println("operacion: "+operacion);
       
       String IdUsuario=CrudForma.getIdUsuario();
       System.out.println("IdUsuario: "+IdUsuario);
       String Id=CrudForma.getId();
       System.out.println("Id: "+Id);
       String email=CrudForma.getEmail();
       System.out.println("email: "+email);
       String nombre=CrudForma.getNombre();
       System.out.println("nombre: "+nombre);
       String ap1=CrudForma.getAp1();
       System.out.println("ap1: "+ap1);
       String passw=CrudForma.getPassw();
       System.out.println("passw: "+passw);
       String fila=CrudForma.getFilaActiva();
       System.out.println("fila: "+fila);

       
       if(operacion==null)
       {
         request.setAttribute("operacion","0");
       }
       else
       request.setAttribute("filaActiva",fila);
       request.setAttribute("operacion",operacion);
       
       Hashtable tabla;
      tabla =  new Hashtable();
      Socio socio;
      Enumeration enumeration;
      
      int cont=0;
      
          if(operacion.equals("0")){
            tabla = CrudForma.todos();
          }
          else if (operacion.equals("Buscar")){
            tabla = CrudForma.buscar(Id,email,nombre,ap1,passw);
          }
          else if (operacion.equals("Guardar")){
            tabla = CrudForma.buscar(Id,"","","","");
            enumeration = tabla.elements();
            if(enumeration.hasMoreElements()){
              CrudForma.actualizar(Id,email,nombre,ap1,passw);
            }else{
              CrudForma.anadir(Id,email,nombre,ap1,passw);
            }
            tabla = CrudForma.todos();
          }
          else if (operacion.equals("Eliminar")){
            tabla = CrudForma.todos();
            CrudForma.borrar(fila);
          }
        
       request.setAttribute("Socios",tabla);
       
       ActionForward fwd;
       fwd=mapping.findForward("Crud");
       return fwd;
                                 }
}