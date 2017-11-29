/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author usuario
 */
public class Login extends ActionSupport {
    
    String usuario;
    String password;
    
    
    public Login() {
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
    
    public String execute() throws Exception {
        
        Session hSession;
        Users usuarios;
        
        hSession = HibernateUtil.getSessionFactory().openSession();
        Transaction t = hSession.beginTransaction();
        usuarios = (Users) hSession.createQuery("from Users where id='"+ usuario +"' and password='"+password+"'").uniqueResult();
        t.commit();
        
        if(usuarios != null){
            return SUCCESS;
        }
        
        
        addActionError("No existe usuario");
        return INPUT;   
        
    }
    
}
