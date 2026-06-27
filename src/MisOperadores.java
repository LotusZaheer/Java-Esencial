public class MisOperadores{
    public static void main(String[] args){

        // 1
        System.out.println("1 Declara 2 variables int");
        int a = 1;
        int b = 2;

        // 2
        System.out.println("2 Imprime el resultado de 3 operaciones aritmeticas");
        System.out.println("Suma: " + (a + b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("Modulo: " + (a % b));

        // 3
        System.out.println("3 Imprime el resultado de 2 comparaciones");
        System.out.println("(" + a +  " == " + a +  "): "+ (a == a));
        System.out.println("(" + b +  " < " + a +  "): " + (b < a));

        // 4
        System.out.println("4 Imprime el resultado de 2 operaciones logicas"); 
        System.out.println("And: " + ((a == a) && (b < a)) );
        System.out.println("Or : "  + ((a == a) || (b < a)) );

    }
}