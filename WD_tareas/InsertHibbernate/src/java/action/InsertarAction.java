package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertarAction extends ActionSupport {

    String usuario, password;
    Users usuc;
    Session hsession;

    public String execute() throws Exception {
        
        hsession = HibernateUtil.getSessionFactory().openSession();
        Transaction t = hsession.beginTransaction();
        
        usuc = new Users();
        usuc.setId(usuario);
        usuc.setPassword(password);
        hsession.save(usuc);
        t.commit();
        
        return SUCCESS;
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

    public InsertarAction() {
    }

}
