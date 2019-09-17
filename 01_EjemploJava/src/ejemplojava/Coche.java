package ejemplojava;

/**
 *
 * @author Juan Gonzalez
 */
public class Coche { //hereda de Object
   public static final int CAPACIDAD_DEPOSITO=60;
    private final byte numRuedas; //valor constante por el final
    private String marca;
    private boolean esGasolina;
    private double nivelDeposito;
    private boolean arrancado;
    
   public Coche(String marca, boolean esGasolina){
       this.numRuedas=4;
       this.marca=marca;
       this.esGasolina=esGasolina;
      // this.capacidadDeposito=capacidadDeposito;
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
        if (nivelDeposito > CAPACIDAD_DEPOSITO)
            nivelDeposito=CAPACIDAD_DEPOSITO;
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

    public boolean isEsGasolina() {
        return esGasolina;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public double getNivelDeposito() {
        return nivelDeposito;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
}
