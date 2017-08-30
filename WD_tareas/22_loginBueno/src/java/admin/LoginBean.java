package admin;
import java.util.HashMap;

class LoginBean 
{
    private HashMap validUsers = new HashMap();//Tablas hash son tablas con coleccion 
                                                 //Sirven para da una relacion como la seccion amarilla

    /**
     * Constructor for LoginBean
     * Initializes the list of usernames/passwords
     */
    public LoginBean()
    {
            validUsers.put("ruben","rpv");
            validUsers.put("administrator","admin");
    }

    /**
     * determine if the username/password combination are
     * present in the validUsers repository.
     * @param userName
     * @param password
     * @return boolean true if valid, false otherwise
     */
    public boolean validateUser(String userName, String password)
    {
            if(validUsers.containsKey(userName))//Checando si existe en la tablahash el usuario
            {
             String thePassword = (String)validUsers.get(userName);//Obtenemos el password del usuario
             if(thePassword.equals(password))
             return true;
            }
        return false;
    }
}
