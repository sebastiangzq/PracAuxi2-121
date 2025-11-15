public class Persona {
    public String nombre,apellido;
    public int edad,ci;
    public Persona(String nombre, String apellido, int edad, int ci){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.ci=ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCi() {
        return ci;
    }
}
