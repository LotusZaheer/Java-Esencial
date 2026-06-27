public class Desarrollador extends Empleado{
    String lenguaje;

    public Desarrollador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }

    public void programar(){
        System.out.println(this.nombre + " esta programando en " + this.lenguaje);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + ", Salario: $" + salario +  ", Lenguaje: " + this.lenguaje );
    }
}