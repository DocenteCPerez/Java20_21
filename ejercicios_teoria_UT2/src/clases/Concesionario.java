/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaCompraCoche;

/**
 *
 * @author propietario
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1 = new Coche("1234","mercedes");
        Coche c2 = new Coche("4444","audi");
        
        Persona juan = new Persona("Juan");
        juan.compraCoche(c1);
        juan.compraCoche2(c2);
        
        Casa c = new Casa("Avenida");
        
        juan.comprarCasa(c);
        
        Ropa pantalon = new Ropa("verde","kk","44");
        
        juan.compraRopa(pantalon);
        
        System.out.println(juan.toString());
    }
    
}
