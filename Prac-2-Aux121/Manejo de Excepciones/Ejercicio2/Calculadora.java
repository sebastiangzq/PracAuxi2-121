public class Calculadora{
    private int x;
    private int y;
    public Calculadora(int x, int y){
        this.x=x;
        this.y=y;
    }
    public static int suma (int x, int y){
        return x+y;
    }
    public static int resta(int x, int y){
        return x-y;
    }
    public static int multiplicacion(int x, int y){
        return x*y;
    }
    public static int division(int x, int y){
        if (y==0){
            throw new ArithmeticException("No se puede dividir "+x+" entre "+y+" porque es divisor es 0");
        }
        else {
            return x/y;
        }
    }
    public static int convertirStraNum(String x) throws NumeroInvalidoException{
        try {
            return Integer.parseInt(x);
        } catch (NumberFormatException e){
            throw new NumeroInvalidoException("El valor " + x + " no es un numero valido");
        }
    }
}
