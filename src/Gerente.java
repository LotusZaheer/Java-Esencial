public class Gerente extends Empleado{
    String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void dirigir(){
        System.out.println(this.nombre + " esta dirigiendo el departamento de " + this.departamento);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + ", Salario: $" + salario +  ", Departamento: " + this.departamento );
    }
}