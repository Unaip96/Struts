package view;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import java.util.Date;
import view.Socio;

public class DBF 
{
  private static DBF instance;
  private String url;
	private Connection conexion;
	private Statement statement;
  public DBF()
  {
  try
	{
		//String url = "jdbc:odbc:Driver={Microsoft} Access Driver (*.mdb);DBQ=Z:/DWS/P5/benetako_diseinua/DB/kbp.mdb";
    url = "jdbc:odbc:socios";
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		conexion = DriverManager.getConnection(url, "", "");
		statement = conexion.createStatement();
	}
	catch (SQLException anException)
	{
		while (anException != null)
		{
			System.out.println("SQL Exception:  " + anException.getMessage());
			anException = anException.getNextException();
		}
	}
	catch (java.lang.Exception anException)
	{
		anException.printStackTrace();
	}
  }
  
  public static DBF instance()
{
	if (instance == null)
		instance = new DBF();
	return instance;
}
public Hashtable getSocios(String query)
{
	// Erazagupenak
	Hashtable Socios;
	ResultSet resultSet;
	// Hasieraketak
	Socios = new Hashtable();
  Socio socio;
	try
	{
		// Run SQL
    resultSet = statement.executeQuery(query);
    
		//	Capture all rows and columns from the result set
		while (resultSet.next())
		{
      String Id = resultSet.getString(1);
			String email = resultSet.getString(2);
			String nombre = resultSet.getString(3);
      String ap1 = resultSet.getString(4);
      String passw = resultSet.getString(5);
		  //System.out.println("Select Erabiltzailea Result: " + "izena = " + izena );
  
			socio = new Socio(Id,email,nombre,ap1,passw);        
			Socios.put(new String(Id), socio);        
		}
    
		System.out.println();
		resultSet.close();
    
  }
      
	catch (SQLException anException)
	{
		while (anException != null)
		{
			System.out.println("SQL Exception:  " + anException.getMessage());
			anException = anException.getNextException();
		}
	}
	catch (java.lang.Exception anException)
	{
    //System.out.println("DBF: "+ anException.getMessage());
	  anException.printStackTrace();
	}
	finally
	{
		return Socios;
	}
}
public boolean getLogin(String user,String passw)
{
	// Erazagupenak
	String query;
  Socio socio;
	ResultSet resultSet;
  boolean haysocio=false;
	// Hasieraketak
	query = "select * from socios where nombre = '"+user+"' and passw = '"+passw+"'";
	System.out.println("Select Agentea SQL: " + query);
	try
	{
		// Run SQL
    resultSet = statement.executeQuery(query);
    
		//	Capture all rows and columns from the result set
    if (resultSet.next()){haysocio=true;}
    		
    
		System.out.println();
		resultSet.close();
    
  }
      
	catch (SQLException anException)
	{
		while (anException != null)
		{
			System.out.println("SQL Exception:  " + anException.getMessage());
			anException = anException.getNextException();
		}
	}
	catch (java.lang.Exception anException)
	{
    //System.out.println("DBF: "+ anException.getMessage());
	  anException.printStackTrace();
	}
	finally
	{
		return haysocio;
	}
}
public void actualizarSocio (String Id, String email, String nombre, String ap1, String passw)
{
	// Erazagupenak
	
	String query;
  int count;
                                                                                                                                                                   
	try
	{
		// Execute update sql 
		query = "UPDATE socios SET Id = '" + Id + "', email = '" + email + "', nombre = '" + nombre + "', ap1 = '" + ap1 + "', passw = '" + passw + "'  WHERE Id =  '" + Id+"'";

		System.out.println("Update Socios SQL: " + query);
		count = statement.executeUpdate(query);
    System.out.println();
	}
	catch (SQLException anException)
	{
		while (anException != null)
		{
			System.out.println("SQL Exception:  " + anException.getMessage());
			anException = anException.getNextException();
		}
	}
	catch (java.lang.Exception anException)
	{
		anException.printStackTrace();
	}
}
public void borrarSocio (String Id )
{
  // Erazagupenak
	String query;
	int count;
  
	// Hasieraketak
	query = " DELETE * FROM socios WHERE Id='"+ Id+"'";
	try
	{
		// Execute insert sql 
		System.out.println("Delete socios SQL: " + query);
		count = statement.executeUpdate(query);
		System.out.println("Delete erabiltzaileak Kopurua: " + count + "\n");
    System.out.println();
	}
	catch (SQLException anException)
	{
		while (anException != null)
		{
			System.out.println(" SQL Exception : " + anException.getMessage());
			anException = anException.getNextException();
		}
	}
	catch (java.lang.Exception anException)
	{
		anException.printStackTrace();
	}
}

public void nuevoSocio (String Id, String email, String nombre, String ap1, String passw)
{
	// Erazagupenak
	String query;
	int count;
    
	// Hasieraketak
	query = "INSERT into socios VALUES ('" + Id + "', '" + email + "', '" + nombre + "', '" + ap1 + "', '" + passw + "')";
	try
	{
		// Execute insert sql 
		System.out.println("Insert Bezeroak SQL: " + query);
		count = statement.executeUpdate(query);
		System.out.println("Insert Erabiltzaile Kopurua: " + count + "\n");
    System.out.println();
	}
  
	catch (SQLException anException)
	{
		while (anException != null)
		{
			System.out.println(" SQL Exception : " + anException.getMessage());
			anException = anException.getNextException();
		}
	}
	catch (java.lang.Exception anException)
	{
		anException.printStackTrace();
	}
}

public Hashtable encontrarSocios (String Id, String email, String nombre, String ap1, String passw)
{
	// Erazagupenak
	String query;
	Hashtable Socios;
	ResultSet resultSet;
	// Hasieraketak
   int condiciones = 0;
  //create query
  query = "SELECT * FROM socios ";
 
  if (Id.length()==0)
  {
    //System.out.println("id=null");
  }else {query = query.concat("WHERE Id = '"+Id+"'");condiciones++;}
  
  if (email.length()==0)
  {
   //System.out.println("izena=null");
  }else {if (condiciones>0){
          query = query.concat("and email = '"+email+"' ");
          condiciones++;}
          else {query = query.concat("WHERE email = '"+email+"'");
                condiciones++;}
  }
  
  if (nombre.length()==0)
  {
   //System.out.println("abizena=null");
  }else {if (condiciones>0){
          query = query.concat("and nombre = '"+nombre+"' ");
          condiciones++;}
          else {query = query.concat("WHERE nombre = '"+nombre+"'");
                condiciones++;}
  }
  
  if (ap1.length()==0)
  {
   //System.out.println("saila=null");
  }else {if (condiciones>0){
          query = query.concat("and ap1 = '"+ap1+"' ");
          condiciones++;}
          else {query = query.concat("WHERE ap1 = '"+ap1+"'");
                condiciones++;}
  }  
  
    if (passw.length()==0)
  {
   //System.out.println("pwd=null");
  }else {if (condiciones>0){
          query = query.concat("and passw = '"+passw+"' ");
          condiciones++;}
          else {query = query.concat("WHERE passw = '"+passw+"'");
                condiciones++;}
  }
  
  System.out.println("Select Erabiltzailea SQL: " + query);
	Socios = new Hashtable();
  Socio socio;
	try
	{
		// Run SQL
    resultSet = statement.executeQuery(query);
    
		//	Capture all rows and columns from the result set
		while (resultSet.next())
		{
      Id = resultSet.getString(1);
			email = resultSet.getString(2);
			nombre = resultSet.getString(3);
      ap1 = resultSet.getString(4);
      passw = resultSet.getString(5);
		 // System.out.println("Select Agentea Result: " + "izena = " + izena );
  
			socio = new Socio(Id,email,nombre,ap1,passw);
			Socios.put(new Integer(Id), socio);
		}
    
		System.out.println();
		resultSet.close();
    //konexioa.close();
    
  }
      
	catch (SQLException anException)
	{
		while (anException != null)
		{
			System.out.println("SQL Exception:  " + anException.getMessage());
			anException = anException.getNextException();
		}
	}
	catch (java.lang.Exception anException)
	{
		anException.printStackTrace();
	}
	finally
	{
		return Socios;
	}
}
}