public class main {
    public static void main(String[]args){
        Empresa empresa= new Empresa("BlackRock");
        empresa.agregarEmpleado(new Empleado("Sebastian Zalles","Arquitecto de ciberseguridad",20000.9));
        empresa.agregarEmpleado(new Empleado("Cristian Lopez","Desarrollador de software",16890.34));
        empresa.agregarEmpleado(new Empleado("Maria Ines","Secretaria",15078.3));
        empresa.agregarEmpleado(new Empleado("Beymar Soto","Ing. Electrico",19050.34));
        empresa.mostrarInfo();
        empresa.buscarEmpleado("Sebastian Zalles");
        empresa.buscarEmpleado("Nicol Inojosa");
        empresa.buscarEmpleado("Beymar Soto");
        empresa.eliminarEmpleado("Cristian Lopez");
        empresa.promedioSalario();
        empresa.sueldoMayorA(18679.82);
    }
}
