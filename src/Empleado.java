public class Empleado {
    String nombre;
    double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void trabajar() {
        System.out.println(nombre + " esta trabajando");
    }
    
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + ", Salario: $" + salario);
    }
}