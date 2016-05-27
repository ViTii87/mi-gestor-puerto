
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Devuelve el dni del cliente
     */
    public String getDni(){
        return dni;
    }
    
    /**
     * Devuelve el nombre del cliente.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Devuelve los datos del cliente
     */
    @Override
    public String toString(){
        return "\nNombre: " + nombre +
                "\nDNI: " + dni;
    }
}
