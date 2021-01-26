package mi_libreria;

public class ConjuntoLibros {
    private Libro[] conjuntoLibros;
    
    ConjuntoLibros(){
    	this.conjuntoLibros = new Libro[10];
    }
    
    ConjuntoLibros(int cantidad){
    	this.conjuntoLibros = new Libro[cantidad];
    }

    public void añadirLibro(Libro libro){
        for (int i = 0; i < this.conjuntoLibros.length; i++){
        	if (this.conjuntoLibros[i] == null){
        		this.conjuntoLibros[i] = libro;
        		return;
        	}
        }
        System.out.println("El libro no ha podido ser aÃ±adido, no hay hueco");
    }

    public void eliminarLibros(String autor){
        for (int i = 0; i < this.conjuntoLibros.length; i++) {
            Libro libro = this.conjuntoLibros[i];
            if (libro.getAutor().equals(autor))
                this.conjuntoLibros[i] = null;
        }
    }

    public void eliminarLibro(String titulo){
    	 for (int i = 0; i < this.conjuntoLibros.length; i++) {
    		 Libro libro = this.conjuntoLibros[i];
            if (libro.getTitulo().equals(titulo))
            	 this.conjuntoLibros[i] = null;

        }
    }

    public void mejorLibro(){
        Libro libro = this.conjuntoLibros[0];
        for (int i = 0; i < this.conjuntoLibros.length; i++) {
        	Libro libro2 = this.conjuntoLibros[i];
            if (libro2.getCalificacion() > libro.getCalificacion()){
                libro = libro2;
            }
        }
        System.out.println(libro.toString());
    }

   public void peorLibro(){
	   Libro libro = this.conjuntoLibros[0];
       for (int i = 0; i < this.conjuntoLibros.length; i++) {
       	Libro libro2 = this.conjuntoLibros[i];
           if (libro2.getCalificacion() < libro.getCalificacion()){
               libro = libro2;
           }
       }
       System.out.println(libro.toString());
   }

}
