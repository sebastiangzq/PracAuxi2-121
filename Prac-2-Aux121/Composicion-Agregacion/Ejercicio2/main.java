public class main {
    public static void main(String[]args){
        Departamento departamento1= new Departamento("Recursos humanos","Administracion");
        Departamento departamento2=new Departamento("Desarrolo de Software","Informatica");
        departamento1.agregarEmpleado(new Empleado("Juan","Secretario",12000));
        departamento1.agregarEmpleado(new Empleado("Sebastian","Seguridad",15000));
        departamento1.agregarEmpleado(new Empleado("Ademar", "FrontEnd",11000));
        departamento1.agregarEmpleado(new Empleado("Maria","BackEnd",13000));
        departamento1.agregarEmpleado(new Empleado("Alejandro","Epecialista",15000));
        System.out.println("-----------------------------");
        System.out.println("Empleados del departamento 1:");
        System.out.println("-----------------------------");
        departamento1.mostrarEmpleados();
        System.out.println("-----------------------------");
        System.out.println("Empleados del departamento 2:");
        System.out.println("-----------------------------");
        departamento2.mostrarEmpleados();
        System.out.println("-----------------------------------");
        System.out.println("Cambiando sueldo a los empleados...");
        System.out.println("-----------------------------------");
        departamento1.cambioSalario(14000);
        departamento1.mostrarEmpleados();
        System.out.println("------------------------------------------------------");
        System.out.println("Algun empleado pertenece al otro departamento tambien?");
        System.out.println("------------------------------------------------------");
        boolean si_o_no= departamento1.empleadoEnComun(departamento2);
        System.out.println(si_o_no);
        System.out.println("------------------------------------------------------");
        System.out.println("Moviendo empleados de departamento 1 al departamento 2");
        System.out.println("------------------------------------------------------");
        departamento1.moverEmpleados(departamento2);
        System.out.println("Empleados en el departamentos 2");
        departamento2.mostrarEmpleados();
    }
}
