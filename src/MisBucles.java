public class MisBucles{
    public static void main(String[] args){
        //1 Usa FOR para imprimir los números del 1 
        for(int i = 1; i <=10; i++){
            System.out.println(i);
        }

        //2 Usa WHILE para sumar números del 1 al 5 e imprime el resultado
        int c = 1;
        int sum = 0;
        while(c <=5){
            sum += c;
            c += 1;
        }
        System.out.println("Suma de 1 a 5: "+ sum);

        //3 Usa FOR para imprimir la tabla de multiplicación del 3 (3x1, 3x2, ... 3x10)
         for(int i = 1; i <=10; i++){
            System.out.println("3 x "+i+" = "+ (i*3));
        }

    }

}