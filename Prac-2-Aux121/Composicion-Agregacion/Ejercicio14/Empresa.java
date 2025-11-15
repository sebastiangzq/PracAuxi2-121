import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado>empleados;
    public Empresa(String nombre){
        this.nombre=nombre;
        this.empleados=new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){
        System.out.println("Se agrego el empleado: "+empleado.getNombre()+" a la empresa: "+nombre);
        this.empleados.add(empleado);
    }
    public void mostrarInfo(){
        System.out.println("-------------------------------------");
        System.out.println("Empleados de la empresa: "+this.nombre);
        System.out.println("-------------------------------------");
        for (Empleado e: empleados){
            System.out.println(e);
        }
    }
    public void buscarEmpleado(String x){
        System.out.println("-------------------------------------");
        System.out.println("Buscando al empeleado: "+x);
        System.out.println("-------------------------------------");
        boolean t=false;
        for (Empleado e: empleados){
            if (e.getNombre().equalsIgnoreCase(x)){
                System.out.println("Se encontro al empleado: "+e.getNombre()+" con puesto de: "+e.getPuesto()+" y su sueldo es de: "+e.getSalario());
                t= true;
            }
        }
        if (t==false){
            System.out.println("No se encontro al empleado: "+x);
        }
    }
    public void eliminarEmpleado(String x){
        System.out.println("-----------------------------------------");
        System.out.println("Elimminando al empeleado: "+x);
        System.out.println("-----------------------------------------");
        for (Empleado e: empleados){
            if (e.getNombre().equalsIgnoreCase(x)){
                System.out.println("Se despidio al empleado: "+e.getNombre()+" con puesto de: "+e.getPuesto());
                this.empleados.remove(e);
                break;
            }
        }
    }
    public void promedioSalario(){
        System.out.println("-------------------------------------");
        System.out.println("Promedio de salario de los empeleados");
        System.out.println("-------------------------------------");
        double total=0,cont=0,prom;
        for (Empleado e: empleados){
            total=total+e.getSalario();
            cont+=1;
        }
        prom=total/cont;
        System.out.println("El promedio de salario de los empleados es de: "+prom+" bs");
    }
    public void sueldoMayorA(double x){
        System.out.println("-------------------------------------");
        System.out.println("Empleados con salario mayor a: "+x+" bs");
        System.out.println("-------------------------------------");
        for (Empleado e: empleados){
            if (e.getSalario()>x){
                System.out.println("El empleado: "+e.getNombre()+" tiene un salario de: "+e.getSalario()+" bs que es mayor a "+x+" bs");
            }
        }
    }
}
