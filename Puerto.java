
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private Alquiler[] alquileres;
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Añade un alquiler del amarre.
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int posicion = -1;
        int i = 0;
        boolean encontrado = false;
        while(i < alquileres.length && !encontrado){
            if(alquileres[i] == null){
                alquileres[i] = new Alquiler(numeroDias, cliente, barco);
                posicion = i;
                encontrado = true;
            }
            i++;
        }
        return posicion;
    }

    /**
     * Permite ver por pantalla el estado de los amarres
     */
    public void verEstadoAmarres(){
        boolean noAlquiler = false;
        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] != null){
                System.out.println(alquileres[i]);
                noAlquiler = true;
            }
        }
        if(!noAlquiler)
            System.out.println("No se han realizado alquileres.");
    }

    /**
     * Permite liquidar un alquiler y dejar el espacio vacio
     */
    public float liquidarAlquiler(int posicion){
        float importe = 0.0f;
        if(posicion < alquileres.length && alquileres[posicion] != null){
            importe = alquileres[posicion].getCosteAlquiler();
            alquileres[posicion] = null;
        }
        else
            System.out.println("Posicion de amarre incorrecta o no hay barco en el amarre indicado");
        return importe;
    }
}
