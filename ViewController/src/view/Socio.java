package view;

public class Socio 
{
  private String Id;
  private String email;
  private String nombre;
  private String ap1;
  private String passw;
  
  public Socio(String Id, String email, String nombre, String ap1, String passw)
  {
    this.Id=Id;
    this.email=email;
    this.nombre=nombre;
    this.ap1=ap1;
    this.passw=passw;
  }


  public void setId(String Id)
  {
    this.Id = Id;
  }


  public String getId()
  {
    return Id;
  }


  public void setEmail(String email)
  {
    this.email = email;
  }


  public String getEmail()
  {
    return email;
  }

  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }


  public String getNombre()
  {
    return nombre;
  }

  public void setAp1(String ap1)
  {
    this.ap1 = ap1;
  }


  public String getAp1()
  {
    return ap1;
  }




  public void setPassw(String passw)
  {
    this.passw = passw;
  }


  public String getPassw()
  {
    return passw;
  }
  
}