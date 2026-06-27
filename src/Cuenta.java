public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(String nuevo) {
        this.titular = nuevo;
    }

    public void setSaldo(double nuevo) {
        if (nuevo > 0) {
            this.saldo = nuevo;
            return;
        }
        System.out.println("Saldo no valido");
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            return;
        }
        System.out.println("Monto no valido");
    }

    public void retirar(double cantidad) {
        if ((cantidad > 0) && (cantidad <= this.saldo)) {
            this.saldo -= cantidad;
            return;
        }
        System.out.println("Monto no valido");
    }

}