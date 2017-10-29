package actionsupportpackage;

import com.opensymphony.xwork2.ActionSupport;
import entity.Login;
import entity.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginActionSupport extends ActionSupport {

    String userName, password;
    Session hibernateSession;
    //Login es la base de datos
    Login login;

    public String execute() throws Exception {
        //Recupera la session de la base de datos
        hibernateSession = HibernateUtil.getSessionFactory().openSession();
        
        //Se crea la transaccion para hacer uso de la serie de comandos
        Transaction t1 = hibernateSession.beginTransaction();
        
        //HQL Es sensible a las letras, mayusculas minusculas 
        //Uniqueresult solo va a haber un resultado
        login = (Login) hibernateSession.createQuery("from Login where userName='" + userName + "'AND password='" + password + "'").uniqueResult();
        t1.commit();

        if (userName != null && password != null && (!userName.equals("")) && (!password.equals(""))) {
            if (login != null) {
                return SUCCESS;
            }
        }

        addActionError("User Name or password does not exist");
        return INPUT;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
