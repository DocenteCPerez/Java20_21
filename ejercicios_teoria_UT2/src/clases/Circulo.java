
 
public class Circulo extends Figura {
    private double radio;

    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double obtenerVolumen() {
        throw new UnsupportedOperationException("Sin sentido");
    }

    @Override
    public String obtenerNombre() {
        return "Circulo";
    }


}
