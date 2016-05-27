
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles, String matricula, float eslora, int anoFab)
    {
        super(matricula, eslora, anoFab);
        this.numeroMastiles = numeroMastiles;
    }
    
    /**
     * Devuelve el coeficiente de Bernua del velero.
     */
    public int getCoeficienteBernua(){
        return numeroMastiles;
    }

    /**
     * Devuelve la informacion del velero. 
     */
    public String toString(){
        return super.toString() + "\nNum Mastiles: " + numeroMastiles;
    }
}
