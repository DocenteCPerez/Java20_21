
public class Cilindro extends Figura {
    private double x;
    private double y;
    private double radio;
    private double altura;

    
    public double obtenerArea() {
        return 2*(Math.PI * Math.pow(this.radio, 2)) + (2*Math.PI*this.radio*this.altura);
    }

   
    public double obtenerVolumen() {
        return Math.PI * Math.pow(this.radio, 2) * this.altura;
    }

   
    public String obtenerNombre() {
        return "Cilindro";
    }


}
