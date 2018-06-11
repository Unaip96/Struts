package view;
import java.util.Hashtable;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class CrudForm extends ActionForm
{
    private String IdUsuario;
    private String userUsuario;
    private String id;
    private String nombre;
    private String passw;
    private String email;
    private String ap1;
    private String operacion;
    private Hashtable Socios;
    private String filaActiva;
  
  public Hashtable todos()
  {
    Socios = DBF.instance().getSocios("select * from socios");
    return Socios;
  }
  
  public Hashtable buscar(String Id, String email, String nombre, String ap1, String passw)
  {
    Socios = DBF.instance().encontrarSocios(Id, email, nombre, ap1, passw);
    return Socios;
  }
  
  public void actualizar(String Id, String email, String nombre, String ap1, String passw)
  {
    DBF.instance().actualizarSocio(Id, email, nombre, ap1, passw);
  }
  public void anadir(String Id, String email, String nombre, String ap1, String passw)
  {
    DBF.instance().nuevoSocio(Id, email, nombre, ap1, passw);
  }
  
  public void borrar (String Id)
  {
    DBF.instance().borrarSocio(Id);
  }
  
  public void setIdUsuario(String IdUsuario)
  {
    this.IdUsuario = IdUsuario;
  }


  public String getIdUsuario()
  {
    return IdUsuario;
  }


  public void setUserUsuario(String userUsuario)
  {
    this.userUsuario = userUsuario;
  }


  public String getUserUsuario()
  {
    return userUsuario;
  }


  public void setId(String id)
  {
    this.id = id;
  }


  public String getId()
  {
    return id;
  }


  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }


  public String getNombre()
  {
    return nombre;
  }


  public void setPassw(String passw)
  {
    this.passw = passw;
  }


  public String getPassw()
  {
    return passw;
  }


  public void setEmail(String email)
  {
    this.email = email;
  }


  public String getEmail()
  {
    return email;
  }


  public void setAp1(String ap1)
  {
    this.ap1 = ap1;
  }


  public String getAp1()
  {
    return ap1;
  }


  public void setOperacion(String operacion)
  {
    this.operacion = operacion;
  }


  public String getOperacion()
  {
    return operacion;
  }


  public void setFilaActiva(String filaActiva)
  {
    this.filaActiva = filaActiva;
  }


  public String getFilaActiva()
  {
    return filaActiva;
  }
}