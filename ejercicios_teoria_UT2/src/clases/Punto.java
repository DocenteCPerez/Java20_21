/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lguerra
 */
public class Punto extends Figura {

    @Override
    public double obtenerArea() {
        throw new UnsupportedOperationException("Sin sentido");
    }

    @Override
    public double obtenerVolumen() {
        throw new UnsupportedOperationException("Sin sentido");
    }

    @Override
    public String obtenerNombre() {
        return "Punto";
    }


}
