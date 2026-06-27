public class Libro {
    private String titulo;
    private String autor;
    private int year;

    public Libro(String titulo, String autor, int year){
         this.titulo = titulo;
         this.autor = autor;
         this.year = year;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("year: " + this.year);
    }

}
