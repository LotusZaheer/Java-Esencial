public class TestCuenta {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Andres", 6500000);

        System.out.println("Informacion inicial");
        System.out.println(cuenta.getTitular());
        System.out.println(cuenta.getSaldo());

        System.out.println("deposito");
        cuenta.depositar(500000);

        System.out.println("retiro valido");
        cuenta.retirar(500000);

        System.out.println("retiro invalido");
        cuenta.retirar(-500);

        System.out.println("Informacion final");
        System.out.println(cuenta.getTitular());
        System.out.println(cuenta.getSaldo());

    }
}