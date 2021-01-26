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
public class Casa {
    private String calle;

    public Casa(String calle){
        this.calle = calle;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Casa{" + "calle=" + calle + '}';
    }
    
    public void imprimir(){
        System.out.println("Calle: "+ calle);
    }
    
}
