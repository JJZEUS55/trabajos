/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.bean;

import entity.Users;

/**
 *
 * @author usuario
 */
public class UsuarioBean {
    
    Users usuarios = new Users();

    public Users getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Users usuarios) {
        this.usuarios = usuarios;
    }
    
    public String verificarUsuario() throws Exception{
        
    }
    
}
