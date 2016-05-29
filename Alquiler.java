
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private static final int VALOR_FIJO_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco)
    {
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
    }

    /**
     * Devuelve el coste del alquiler del amarre
     */
    public float getCosteAlquiler(){
        return numeroDias*(barco.getEslora()*MULTIPLICADOR_ESLORA) + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
    }
    
    /**
     * Devuelve los datos del alquiler.
     */
    public String toString(){
        return "\n---------------------------" +
               "\n----- DATOS  ALQUILER -----" +
               "\n---------------------------" + 
               cliente + barco + "\nCoste Alquiler: " + getCosteAlquiler();
               
    }
}
