import java.util.ArrayList;
import java.util.List;
public class Hospital {
    private String nombre;
    private List<Doctor>doctores;
    public Hospital (String nombre){
        this.nombre=nombre;
        this.doctores=new ArrayList<>();
    }
    public void asignarDoctores(Doctor doctor){
        System.out.println("Se asigno al doctor: "+doctor.getNombre()+", con epecialidad de: "+doctor.getEspecialidad()+", al hospital: "+this.nombre);
        this.doctores.add(doctor);
    }
    public void mostrarDocs(){
        System.out.println("---------------------------------------------------");
        System.out.println("Lista de Doctores en el hospital: "+this.nombre);
        System.out.println("---------------------------------------------------");
        for (Doctor d: doctores){
            System.out.println(d);
        }
    }
}
