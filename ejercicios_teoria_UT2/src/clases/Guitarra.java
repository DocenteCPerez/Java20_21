/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lguerra
 */
public class Guitarra implements Instrumento {

    public String Tocar() {
        return "Tocar Guitarra";
    }

    public String Tipo() {
        return "Cuerda";
    }

    public void Afinar() {
     System.out.println("La guitarra ha sido afinada");
        
    }


}
