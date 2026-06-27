public class TestBiblioteca {
    public static void main(String[] args){
        
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Revolucion en la granja", "Señor", 1986);
        Libro libro2 = new Libro("1986", "Señor 2", 1987);
        Libro libro3 = new Libro("1987", "Señor 3", 1988);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.listarLibros();

        biblioteca.prestarLibro("1986");
        biblioteca.prestarLibro("1986");
        biblioteca.prestarLibro("1987");
        biblioteca.prestarLibro("1986");
        biblioteca.prestarLibro("1987");

        biblioteca.mostrarPrestamos();

        biblioteca.devolverLibro("1987");
        biblioteca.devolverLibro("1986");

        biblioteca.mostrarPrestamos();

    }
    
}
