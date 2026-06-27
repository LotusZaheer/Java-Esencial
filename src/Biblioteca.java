import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {

    private ArrayList<Libro> libros = new ArrayList<>();
    private HashMap<String, Integer> prestamos = new HashMap<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        prestamos.put(libro.getTitulo(), 0);
    }

    public void listarLibros(){
        for (Libro i: libros){
            i.mostrarInfo();
        }
    }

    public void prestarLibro(String libro){
        if (!prestamos.containsKey(libro)){
            System.out.println("El libro requerido no existe");
            return;
        }
        prestamos.put(libro, prestamos.get(libro) + 1);
    }

    public void devolverLibro(String libro) {
        if (!prestamos.containsKey(libro)) {
            System.out.println("El libro requerido no esta en la biblioteca");
            return;
        }
        prestamos.put(libro, prestamos.get(libro) - 1);
    }

    public void mostrarPrestamos(){
        System.out.println("Los libros prestados hasta el momento son:");
        for (String i: prestamos.keySet()){
            System.out.println(i + ": " + prestamos.get(i));
        }
    }

}
