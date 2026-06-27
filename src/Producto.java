public class Producto{

    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        System.out.println("");
    }

    public void mostrarInfo(){
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("");
    }

    public void vender(int cantidad){
        this.cantidad -= cantidad;
        System.out.println("Se vendieron " + cantidad + " unidades de " + this.nombre);
        System.out.println("");
    }

}