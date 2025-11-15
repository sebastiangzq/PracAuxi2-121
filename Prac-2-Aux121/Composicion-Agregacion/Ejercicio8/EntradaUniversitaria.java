import java.util.ArrayList;
import java.util.List;
public class EntradaUniversitaria {
    private List<Facultad>facultades;
    private List<Fraternidad>fraternidades;
    private List<Persona>participantes;
    public EntradaUniversitaria(){
        this.facultades=new ArrayList<>();
        this.fraternidades=new ArrayList<>();
        this.participantes=new ArrayList<>();
    }
    public Facultad registrarFacultad(String nombre){
        Facultad facu= new Facultad(nombre);
        facultades.add(facu);
        return facu;
    }
    public void registrarFraternidad(Fraternidad fraternidad){
        this.fraternidades.add(fraternidad);
    }
    public boolean registrarParticipante(String nombre, int edad, Facultad facultad, Fraternidad fraternidad){
        for (Persona p: participantes){
            if (p.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("[Error no se puede registar a "+nombre+" porque ya existe un participante con ese nombre en otra fraternidad ]");
                return false;
            }
        }
        Persona nuevo= new Persona(nombre,edad,facultad,fraternidad);
        for (Fraternidad fra: fraternidades){
            System.out.println("[Error el participante" +nombre+" ya esta registrado en otra fraternidad]");
            return false;
        }
        participantes.add(nuevo);
        fraternidad.getIntegrantes().add(nuevo);
        return true;
    }
    public void mostrarBailarines(){
        System.out.println("------------------------");
        System.out.println("Bailarines registrados: ");
        System.out.println("------------------------");
        for (Persona p: participantes){
            System.out.println(p);
        }
    }
    public void mostrarEncargados(){
        System.out.println("---------------------------");
        System.out.println("Encargados de fraternidades");
        System.out.println("---------------------------");
        for (Fraternidad fraternidad:fraternidades){
            System.out.println("Fraternidad: "+fraternidad.getNombre()+", -Encargado: "+fraternidad.getEncargado().getNombre());
        }
    }
    public void mostrarEdades(){
        System.out.println("---------------------------");
        System.out.println("Edades de los participantes");
        System.out.println("---------------------------");
        for (Persona p: participantes){
            System.out.println(p.getNombre()+": "+p.getEdad()+" años");
        }
    }
}
