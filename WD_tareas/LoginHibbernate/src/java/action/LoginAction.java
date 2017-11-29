/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author usuario
 */
public class LoginAction extends ActionSupport {

    private String usuario, password;
    private Session session;
    private Users usuc;

    public String execute() throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        usuc =(Users)session.createQuery("from Users where id='"+usuario+"' and password='"+password+"'").uniqueResult();
        t.commit();
        
        if(usuc != null){
            return SUCCESS;
        }
        
        addActionError("Usuario no encontrado");
        return INPUT;
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

    public LoginAction() {
    }

}
