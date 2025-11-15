public class Persona {
    private String nombre;
    private int edad;
    private Facultad facultad;
    private Fraternidad fraternidad;
    public Persona(String nombre, int edad, Facultad facultad, Fraternidad fraternidad){
        this.nombre=nombre;
        this.edad=edad;
        this.facultad=facultad;
        this.fraternidad=fraternidad;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return "[ Nombre: "+nombre+", edad: "+edad+", facultad: "+this.facultad.getNombre()+", fraternidad: "+this.fraternidad.getNombre()+" ]";
    }
}
