/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lguerra
 */
public class Piano implements Instrumento {

    public String Tocar() {
        return "Tocar Piano";
    }

    public String Tipo() {
        return "Teclado";
    }

    public void Afinar() {
System.out.println("El piano ha sido afinada");
    } 

}
