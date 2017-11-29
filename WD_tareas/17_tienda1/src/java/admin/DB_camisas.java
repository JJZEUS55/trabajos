/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class DB_camisas {
    ResultSet rs = null;
    //private HashMap id_camisa = new HashMap();
    private HashMap nombre_camisa = new HashMap();
    //private HashMap cantidad_camisas = new HashMap();
    String id_camisa = null;
    int cantidad_camisas = 0;
    
    public DB_camisas(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost/tiendita","root", "1234");
            Statement s = db.createStatement();
            rs=s.executeQuery("SELECT * FROM camisa WHERE idCamisa='"+ id_camisa +"'");
            while(rs.next())
            {                
                cantidad_camisas = Integer.parseInt(rs.getString("cantidad"));
            }   
        }
        catch(Exception e){
            e.printStackTrace();
        }    
    }
    
    public void setId_camisa(String id){
        id_camisa=id;
    }
    
    public int getCantidad_camisas(){
        return cantidad_camisas;
    }
    
    
    
    
    
    
    
}
