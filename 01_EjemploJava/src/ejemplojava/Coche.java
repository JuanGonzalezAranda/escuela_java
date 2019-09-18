package ejemplojava;

/**
 *
 * @author Juan Gonzalez
 */
public class Coche { //hereda de Object
    /*enum TipoColor{ //enum empieza con 0
        BLANCO, NEGRO, ROJO, VERDE, AZUL, PLATEADO
    }*/
    
    public static final int CAPACIDAD_DEPOSITO=60;
    private final byte numRuedas; //valor constante por el final
    private final String marca;
    private final int esGasolina;
    private double nivelDeposito;
    private boolean arrancado;
    private TipoColor color = TipoColor.ROJO ;
   
    
   public Coche(String marca, boolean esGasolina, TipoColor color){
       this.numRuedas=4;
       this.marca=marca;
       this.color=color;
       this.esGasolina=0;
   }
   public Coche(String marca, boolean esGasolina, String color){
       this.numRuedas=4;
       this.marca=marca;
       this.esGasolina=0;
       this.color=TipoColor.valueOf(color);
       //this.color=TipoColor.valueOf(TipoColor.class, color);
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
    

