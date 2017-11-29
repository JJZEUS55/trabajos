package actions;

import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Users;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ModificarUsuario extends ActionSupport {

    
    int id;
    String usu;
    String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ModificarUsuario() {
    }

    public String execute() throws Exception {

        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Users usuario = (Users) hibernateSession.load(Users.class, id);
        usu = usuario.getId();
        pass = usuario.getPassword();
        
        return SUCCESS;
    }

}
