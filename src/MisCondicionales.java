public class MisCondicionales{
    public static void main(String[] args){
        
        //1
        System.out.println("1 Declara una variable int");
        int numero = 10;
        String texto = "es ";

        //2
        System.out.println("2 Usa if-else para verificar");
        if (numero > 0){
            texto += "positivo";
        } else if (numero < 0){
            texto += "negativo";
        } else {
            texto += "cero";
        }
        System.out.println("El numero " + texto);

        //3 
        System.out.println("3 Declara una variable int");
        int edad = 27;

        //4
        System.out.println("4 Usa if-else if-else para clasificar");
        if (edad < 13){
            texto = "niño";
        } else if (edad >= 13 && edad < 18){
            texto = "adolescente";
        } else if (edad >= 18 && edad < 60){
            texto = "adulto";
        } else if (edad >= 60){
            texto = "adulto mayor";
        }
        System.out.println("Eres un " + texto);

    }
}