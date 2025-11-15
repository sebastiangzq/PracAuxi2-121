import java.util.ArrayList;
import java.util.List;
public class Fraternidad {
    private String nombre;
    private Persona encargado;
    private List<Persona> integrantes;
    public Fraternidad(String nombre, Persona encargado){
        this.nombre=nombre;
        this.encargado=encargado;
        this.integrantes=new ArrayList<>();
        this.integrantes.add(encargado);
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getEncargado() {
        return encargado;
    }

    public List<Persona> getIntegrantes() {
        return integrantes;
    }
}
