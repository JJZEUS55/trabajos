package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ModificarUsuario extends ActionSupport {

    int id1;
    String usuario, password;
    Session hsession;
    Users usuc;

    public String execute() throws Exception {
        
        hsession = HibernateUtil.getSessionFactory().openSession();
        usuc =(Users) hsession.load(Users.class, id1);
     
        
        return SUCCESS;
    }

    public ModificarUsuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
