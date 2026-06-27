public class TestProducto{

    public static void main(String[] args){

        Producto laptops = new Producto("Laptop", 2500000, 5);
        Producto pantallas = new Producto("Pantalla", 700000, 3);

        laptops.mostrarInfo();
        pantallas.mostrarInfo();

        laptops.vender(2);
        pantallas.vender(1);

        laptops.mostrarInfo();
        pantallas.mostrarInfo();

    }
}