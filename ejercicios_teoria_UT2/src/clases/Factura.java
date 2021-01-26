/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lguerra
 */
public class Factura implements PorPagar {
    private String numPieza;
    private String descPieza;
    public int cantidad;
    public double precio;

    public double obtenerPago() {
        return cantidad*precio;
    }

}
