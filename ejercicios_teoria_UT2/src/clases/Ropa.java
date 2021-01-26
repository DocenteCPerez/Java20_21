/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaCompraCoche;


public class Ropa {
    private String color;
    private String modelo;
    private String talla;

    public Ropa(String color, String modelo, String talla) {
        this.color = color;
        this.modelo = modelo;
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Ropa{" + "color=" + color + ", modelo=" + modelo + ", talla=" + talla + '}';
    }
    
    
    
    
}
