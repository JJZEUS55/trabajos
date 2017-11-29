package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ObtenerUsuarios extends ActionSupport {

    List lista;
    Session hsession;

    public String execute() throws Exception {
        
        
        hsession = HibernateUtil.getSessionFactory().openSession();
        Query consulta = hsession.createQuery("from Users");
        lista = consulta.list();
              
        return SUCCESS;
    }

    public ObtenerUsuarios() {
    }

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    
    
    

}
