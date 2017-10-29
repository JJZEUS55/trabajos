package Actions;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Login;
import entity.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteActiont extends ActionSupport {

    private List lista;

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public String execute() throws Exception {
        Session hibernateSession;

        hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Query consulta = hibernateSession.createQuery("from Login");
        lista = consulta.list();

        return SUCCESS;
    }
}
