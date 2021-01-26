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
public class Coche {
    private String matricula;
    private String marca;

    public Coche(String matricula, String marca) {
        this.marca = marca;
        this.matricula=matricula;
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   @Override
    public String toString() {
        return "CocheDeCarreras{" + "matricula=" + matricula + ", marca=" + marca + '}';
    }
    
}
