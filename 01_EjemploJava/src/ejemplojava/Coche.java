package ejemplojava;

/**
 *
 * @author Juan Gonzalez
 */
public class Coche { //hereda de Object
    
    private final byte numRuedas; //valor constante por el final
    private String marca;
    int capacidadDeposito;
    boolean esGasolina;
    private double nivelDeposito;
    boolean arrancado;

    
   public Coche(String marca, int capacidadDeposito){
       this.numRuedas=4;
       this.marca=marca;
       this.capacidadDeposito=capacidadDeposito;
   }
        
    public double getNivelDep(){
        return nivelDeposito;
    }
    
     public byte getNumRuedas() {
        return numRuedas;
    }
    
    public void echarCarburante(double cantidad){
        if (cantidad>0)
            this.nivelDeposito += cantidad;
        if (nivelDeposito > capacidadDeposito)
            nivelDeposito=capacidadDeposito;
    }
    
    public void setNivelDep(double nivelDeposito){
        this.nivelDeposito=nivelDeposito;
    }
    
    public void acelerar(){
        if (arrancado) nivelDeposito -= 0.1;
    }
    
    public void vaciarDeposito() {
        float nivelDeposito=2;
        this.nivelDeposito=3;
            System.out.println("Deposito vaciado de " + this.toString()
          /* + "\n   Nivel: " + this.nivelDeposito*/);
             
        }
    
    public String toString() {
        return "Coche " + marca + " nivel " + nivelDeposito;
    }
    public void mostrar(){
        System.out.println(this.toString());
    }
   public String getMarca() {
        return marca;
    }
}
