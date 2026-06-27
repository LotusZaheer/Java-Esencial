public class TestEmpleados{
    public static void main(String[] args){

    Empleado empleado = new Empleado("Stella", 4000000);
    Gerente gerente = new Gerente("Carlos", 30000000, "Ventas");
    Desarrollador desarrollador = new Desarrollador("Andres", 0, "Python");

    empleado.mostrarInfo();
    gerente.mostrarInfo();
    desarrollador.mostrarInfo();

    empleado.trabajar();
    gerente.trabajar();
    desarrollador.trabajar();

    gerente.dirigir();

    desarrollador.programar();

    }
}