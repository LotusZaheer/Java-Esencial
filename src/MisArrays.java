public class MisArrays{
    public static void main(String[] args){

        // 1 Crea un array de int con 5 números de tu elección
        int[] numeros0 = {2,4,6,9,14};

        // 2 Usa FOR (con índice) para imprimir todos los números
        for(int i = 0; i < numeros0.length; i++){
            System.out.println("Indice " + i + ": " + numeros0[i]);
        }

        // 3 Usa FOR-EACH para sumar todos los números e imprime el resultado
        int sum = 0;
        for(int numero: numeros0){
            sum += numero;
        }
        System.out.println("Suma total: " + sum );

        // 4 Crea un array de String con 3 nombres
        String[] nombres = {"Alice", "Bob", "Carlos"};

        // 5 Usa FOR-EACH para imprimir todos los nombres
        for(String nombre: nombres){
            System.out.println(nombre);
        }

    }
}