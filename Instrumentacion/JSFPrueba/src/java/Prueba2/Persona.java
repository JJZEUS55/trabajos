package Prueba2;

public class Persona {

    private String id;
    private String nombre;
    private String edad;

    public Persona(String id, String nombre, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlayerAge() {
        return edad;
    }

    public void setPlayerAge(String edad) {
        this.edad = edad;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Persona) {
            Persona player = (Persona) obj;
            if (this.id.equals(player.getId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

}
