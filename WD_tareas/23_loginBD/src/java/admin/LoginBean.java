package admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

class LoginBean 
{
    private HashMap validUsers = new HashMap();
    private HashMap tipoUs = new HashMap();
    ResultSet rs = null;
    String tipo = "";
    public LoginBean()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost/DB6","root", "1234");
            Statement s = db.createStatement();
            rs=s.executeQuery("SELECT * FROM Users");
            
            while(rs.next())
            {
                validUsers.put(rs.getString("id1"),rs.getString("contra"));
                tipoUs.put(rs.getString("id1"),rs.getString("tipo"));
                //System.out.println(rs.getString("usuId")+" : "+ rs.getString("usuPassword"));
            }           
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }            
    }
    public boolean validateUser(String userName, String password)
    {
            if(validUsers.containsKey(userName))
            {
                //System.out.println("Entro");
                String thePassword = (String)validUsers.get(userName);
                //System.out.println("Pass:" + thePassword);
                if(thePassword.equals(password))
                {
                    tipo = (String)tipoUs.get(userName);
                    return true;
                }
            }
        return false;
    }

    public String getTipo(){
        return tipo;
    }
}
