/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

/**
 *
 * @author Formacion
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Empezando POO");
        Coche miCoche;
        
        
        miCoche= new Coche("Kia", true); //la instancia se hace con new
        //miCoche.marca = "Kia";
     
       // miCoche.capacidadDeposito = 60;
       // miCoche.numRuedas = 4;
        miCoche.esGasolina=true;
       
       // miCoche.nivelDeposito=30;//empezamos con medio deposito
       miCoche.echarCarburante(30);
        System.out.println("Todos los coches tienen: " + Coche.CAPACIDAD_DEPOSITO);
        System.out.println("Coche creado: " + miCoche.getMarca());
        //System.out.println("Nivel deposito " + miCoche.nivelDeposito + " litros");
        System.out.println("Nivel deposito " + miCoche.getNivelDep() + " litros");
        
        
        Coche otroCoche=miCoche; //new Coche()
        //otroCoche.marca="Seat"; ya no se puede
        
           
        System.out.println("Coche creado: " + otroCoche.getMarca());
         otroCoche.vaciarDeposito();
        //vaciarDeposito(miCoche);
       // System.out.println("Nivel deposito " + otroCoche.nivelDeposito + " litros");
         System.out.println("Nivel deposito " + otroCoche.getNivelDep() + " litros");
        
        miCoche.arrancado=true;
       // miCoche.nivelDeposito=-2;
        miCoche.echarCarburante(-2);
        for (int i=0;i<3;i++) 
            miCoche.acelerar();
        
        miCoche.mostrar();
        
        
    }
      /*  public static void vaciarDeposito(Coche c) {
            c.nivelDeposito=3;
            System.out.println("Deposito vaciado de " + c.marca
            + "\n   Nivel: " + c.nivelDeposito);
        }*/
    }
    

