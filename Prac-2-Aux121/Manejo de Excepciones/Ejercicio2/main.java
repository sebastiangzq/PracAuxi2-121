public class main {
    public static void main(String[]args){
        System.out.println("-------------------------------");
        System.out.println("          Calculadora          ");
        System.out.println("-------------------------------");
        System.out.println("Suma de 5 + 3 = "+Calculadora.suma(5,3));
        System.out.println("Resta de 9 - 2 = "+Calculadora.resta(9,2));
        System.out.println("Multiplicacion de 9 * 6 = "+Calculadora.multiplicacion(9,6));
        try{
            System.out.println("Dividir 10 / 2 = "+Calculadora.division(10,2));
        }catch (ArithmeticException e){
            System.out.println("Error en la divison... "+e.getMessage());
        }
        try{
            System.out.println("Dividir 47 / 0 = "+Calculadora.division(47,0));
        }catch (ArithmeticException e){
            System.out.println("Error en la divison... "+e.getMessage());
        }
        System.out.println("-------------------------------");
        System.out.println("Conversion de Strings a numeros");
        System.out.println("-------------------------------");
        try {
            int numero= Calculadora.convertirStraNum("123");
            System.out.println("Convertir '123' a numero : "+numero);
        }catch (NumeroInvalidoException e){
            System.out.println("Error en la conversion... "+e.getMessage());
        }
        System.out.print("Convertir 'N67Y8' a numero : ");
        try {
            int numero= Calculadora.convertirStraNum("N67Y8");
            System.out.println("Convertir 'N67Y8' a numero : "+numero);
        }catch (NumeroInvalidoException e){
            System.out.println("Error en la conversion... "+e.getMessage());
        }


    }
}
