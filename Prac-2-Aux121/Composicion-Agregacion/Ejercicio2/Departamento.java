import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String area;
    private List<Empleado>empleados;

    public Departamento(String nombre, String area){
        this.nombre=nombre;
        this.area=area;
        this.empleados=new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void mostrarEmpleados(){
        System.out.println("Departamento: "+nombre+", area: "+area);
        if (empleados.isEmpty()){
            System.out.println("No hay empleados");
        }
        else {
            for (Empleado e: empleados){
                System.out.println(e);
            }
        }
    }
    public void cambioSalario(double nuevoSalario){
        for (Empleado e: empleados){
            e.setSueldo(nuevoSalario);
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }
    public void moverEmpleados(Departamento otroDepartamento){
        for (Empleado e: empleados){
            otroDepartamento.agregarEmpleado(e);
        }
        empleados.clear();
    }
    public boolean empleadoEnComun(Departamento otroDepartamento){
        for (Empleado e: empleados){
            for (Empleado oe: otroDepartamento.getEmpleados()){
                if (e.getNombre().equals(oe.getNombre())) {
                    return true;
                }
            }
        }
        return false;
    }
}

