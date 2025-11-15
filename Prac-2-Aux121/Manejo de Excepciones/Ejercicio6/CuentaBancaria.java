public class CuentaBancaria {
    private String numeroCuenta, titular;
    private double saldo;
    public CuentaBancaria(String numeroCuenta, String titular, double saldo){
        this.numeroCuenta=numeroCuenta;
        this.titular=titular;
        this.saldo=saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double x){
        if(x<0){
            throw new IllegalArgumentException("el monto a depositar de "+x+" bs, es negativo");
        }
        else {
            double  z =getSaldo()+x;
            setSaldo(z);
            System.out.println("Se deposito exitosamente la cantidad de: "+x+" bs, el saldo actual es: "+getSaldo());
        }
    }
    public void retirar(double x) throws FondosInsuficientesException{
        if(x>this.saldo){
            throw new FondosInsuficientesException(" fondos insuficientes para retirar la cantidad de "+x+" bs");
        }
        else {
            double  z =getSaldo()-x;
            setSaldo(z);
            System.out.println("Se retiro exitosamente la cantidad de "+x+" bs, el saldo actual es: "+getSaldo());
        }
    }
    public void mostrarInfo(){
        System.out.println("---------------------------------");
        System.out.println("Informacion de la cuenta bancaria");
        System.out.println("---------------------------------");
        System.out.println("Numero de cuenta: "+this.numeroCuenta);
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo: "+this.saldo+" bs");
    }
}
