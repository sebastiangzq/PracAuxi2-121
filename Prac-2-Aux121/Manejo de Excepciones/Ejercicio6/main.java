public class main {
    public static void main(String[]args){
        CuentaBancaria cuentaBancaria= new CuentaBancaria("12345","Juan Perez",1000);
        cuentaBancaria.mostrarInfo();
        System.out.println("---------------------------------");
        try {
            cuentaBancaria.depositar(427.78);
        }catch (IllegalArgumentException e){
            System.out.println("Error en el deposito... "+e.getMessage());
        }
        try {
            cuentaBancaria.depositar(-302);
        }catch (IllegalArgumentException e){
            System.out.println("Error en el deposito... "+e.getMessage());
        }
        System.out.println("---------------------------------");
        try {
            cuentaBancaria.retirar(671.36);
        }catch (FondosInsuficientesException e){
            System.out.println("Error en el retiro..."+e.getMessage());
        }
        try {
            cuentaBancaria.retirar(1364.9);
        }catch (FondosInsuficientesException e){
            System.out.println("Error en el retiro..."+e.getMessage());
        }
        cuentaBancaria.mostrarInfo();

    }
}
