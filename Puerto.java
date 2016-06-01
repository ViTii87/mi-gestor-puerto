import java.util.ArrayList;

/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private ArrayList<Alquiler> alquileres;
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<>();
    }

    /**
     * Añade un alquiler del amarre.
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int posFin = -1;
        if(alquileres.size() < NUMERO_AMARRES){
            posFin = buscaPosicionLibre();
            Alquiler alqui;
            alqui = new Alquiler(numeroDias, cliente, barco);
            alqui.setPosicion(posFin);
            alquileres.add(alqui);
        }
        return posFin;
    }

    /**
     * Metodo que busca una posicion valida de amarre entre todas las del puerto
     * (Hecho chapucero, supongo que hay algun metodo mas sencillo, menos lioso y mas elegante)
     */
    private int buscaPosicionLibre(){
        int posFin = 0;
        int i = 0;
        int j = 0;
        boolean encontrado = false;
        boolean encontrado2 = false;
        if(alquileres.size()!=0){
            while(i < NUMERO_AMARRES && !encontrado2){
                while(j < alquileres.size() && !encontrado){
                    if(i == alquileres.get(j).getPosicion())
                        encontrado = true;
                    else
                        j++;
                }
                if(!encontrado){
                    posFin = i;
                    encontrado2=true;
                }
                i++;
                j=0;
                encontrado = false;
            }
        }
        return posFin;
    }

    
    /**
     * Permite ver por pantalla el estado de los amarres
     */
    public void verEstadoAmarres(){
        boolean noAlquiler = false;
        for(Alquiler alqui: alquileres){
            if(alqui != null){
                System.out.println(alqui);
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
        float importe = -1f;
        if(posicion >=0 && posicion < alquileres.size()){
            int i = 0;
            boolean encontrado = false;
            while(i < alquileres.size() && !encontrado){
                if(alquileres.get(i).getPosicion() == posicion){
                    importe = alquileres.get(i).getCosteAlquiler();
                    alquileres.remove(alquileres.get(i));
                }
                i++;
            }
        }
        else
            System.out.println("Posicion de amarre incorrecta o no hay barco en el amarre indicado");
        return importe;
    }
}
