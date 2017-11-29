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

public class DeleteUser extends ActionSupport {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String execute() throws Exception {
        Session hibernateSession;

        hibernateSession = HibernateUtil.getSessionFactory().openSession();

        Transaction t = hibernateSession.beginTransaction();
        Login user = (Login) hibernateSession.load(Login.class, id);
        hibernateSession.delete(user);
        t.commit();

        return SUCCESS;
    }
}
