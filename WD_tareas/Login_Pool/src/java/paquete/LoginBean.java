package paquete;

import dbcp.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

class LoginBean {

    private HashMap validUsers = new HashMap();
    private HashMap Usertipe = new HashMap();
    ResultSet rs;

    /**
     * Constructor for LoginBean Initializes the list of usernames/passwords
     */
    public LoginBean() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DataSource.getInstance().getConnection();
            statement = connection.createStatement();
            //Statement s = db.createStatement();
            rs = statement.executeQuery("SELECT * FROM usuario");
            while (rs.next()) {
                String id = rs.getString("usuId");
                validUsers.put(id, rs.getString("usuPassword"));
                //System.out.println("cosaaaaaaaaaaaaaaaaaaaaa"+id);
                Usertipe.put(id, rs.getString("tipoUsuario"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * determine if the username/password combination are present in the
     * validUsers repository.
     *
     * @param userName
     * @param password
     * @return boolean true if valid, false otherwise
     */
    public boolean validateUser(String userName, String password) {
        if (validUsers.containsKey(userName)) {
            String thePassword = (String) validUsers.get(userName);
            if (thePassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public String TipeUser(String userName) {

        return (String) Usertipe.get(userName);

    }

}
