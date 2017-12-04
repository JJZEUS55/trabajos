package Prueba2;

import BaseDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import net.javabeat.primefaces.data.Player;
@ManagedBean
@SessionScoped
public class PersonaDatos {

    public List<Persona> personas = new ArrayList<Persona>();
    private static int contador = 0;

    public PersonaDatos() {
        addPersonas();
    }

    public void addPersonas() {
        ConexionMySQL mysql = new ConexionMySQL();
        String id;
        String nombre = null;
        String edad;

        try (Connection con = mysql.Conectar()) {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM paciente");
            while(rs.next()){
                id = rs.getString("idPaciente");
                nombre = rs.getString("nombres");
                edad = rs.getString("edad");
                personas.add(new Persona(id, nombre, edad));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void serPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Persona> queryByName(String nombre) {
        // Assumed search using the startsWith
        List<Persona> queried = new ArrayList<Persona>();
        for (Persona persona : this.personas) {
            if (persona.getNombre().startsWith(nombre)) {
                queried.add(persona);
            }
        }
        return queried;
    }

}
