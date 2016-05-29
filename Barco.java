/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Barco
{
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Contructor de barcos
     */
    public Barco(String matricula, float eslora, int anoFab){
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = anoFab;
    }
    
    /**
     * Devuelve la matricula del barco
     */
    public String getMatricula(){
        return matricula;
    }
    
    /**
     * Devuelve la eslora del barco en metros
     */
    public float getEslora(){
        return eslora;
    }
    
    /**
     * Devuelve el año de fabricacion del barco
     */
    public int getAnoFabricacion(){
        return anoFabricacion;
    }
    
    /**
     * Metodo abstracto que devuelve el coeficiente de Bernua
     */
    public abstract int getCoeficienteBernua();
    
    /**
     * Devuelve los datos del barco
     */
    public String toString(){
        return "\n\n**************************" +
               "\n*******DATOS  BARCO*******" +
               "\n**************************" + 
               "\nMatricula: " + matricula +
               "\nEslora: " + eslora +
               "\nAño Fabr: " + anoFabricacion;
    }
}
