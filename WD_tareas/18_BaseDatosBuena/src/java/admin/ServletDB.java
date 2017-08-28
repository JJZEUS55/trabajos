package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//IMPORTANTE
//SE DEBE AÑADIR LA LIBRERIA mysql.jdbc.Driver
//Properties en el proyecto librearias y añadir la de sql
public class ServletDB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    response.setContentType("text/html;charset=UTF-8");
    ResultSet rs=null;
    try
    {  
    //Metodo estatico    
    //Permite cargar el driver de manera dinamica en la aplicacion
    Class.forName("com.mysql.jdbc.Driver");
    
    //Url de la base de datos
    //Usuario mysql
    //Contraseña usuario
    Connection db = DriverManager.getConnection("jdbc:mysql://localhost/DB2","root", "1234");
    Statement s = db.createStatement();
    
    //executeQuery Uso de sentencias Select
    //Regresa un resultset valores de la tabla seleccionada
    //Cuando no se modifica la base de datos
    //executeUpdate modifica la base de datos
    //este devuelve numero de elementos afectados
    rs=s.executeQuery("SELECT * FROM Users");
     PrintWriter out=response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");            
    //Se usa cuando no sabemos cuando vamos a terminar
    //next nos dice si hay un registro o no si el registro se adapata a la columna
    
            while(rs.next())
            {
            out.println(rs.getString("id1"));
            }            
            out.println("</body>");
            out.println("</html>");
    }
    catch(Exception e)
    {
        
    e.printStackTrace();
    }            

    }
}
