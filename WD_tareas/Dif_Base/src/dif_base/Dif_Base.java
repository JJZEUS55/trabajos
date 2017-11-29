/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dif_base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Dif_Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        ConexionMySQL coneccion = new ConexionMySQL();
        Connection cn = coneccion.Conectar();
        int id;
        String nombre = null;
        String apellido = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un ID: ");
        id = sc.nextInt();
        System.out.print("Introduzca un Nombre: ");
        sc.nextLine();
        nombre = sc.nextLine();
        System.out.print("Introduzca un Apellido: ");
        apellido = sc.nextLine();

        System.out.println("ID: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido);

        String aSQL = "insert into usuario (id_usu,nombre,apellido)" + "VALUES (?,?,?)";

        PreparedStatement pst = cn.prepareStatement(aSQL);
        pst.setInt(1, id);
        pst.setString(2, nombre);
        pst.setString(3, apellido);
        
        pst.executeUpdate();

    }

}
