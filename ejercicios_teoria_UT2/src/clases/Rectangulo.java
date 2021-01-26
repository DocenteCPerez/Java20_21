
public class Rectangulo {
	private int base;
	private int altura;
	
	Rectangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	public int Area(){
		return this.base*this.altura;
	}
	
	public int Perimetro(){
		return 2*this.base+2*this.altura;
	}
}
