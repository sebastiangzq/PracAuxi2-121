public class Speaker extends Persona{
    public String especialidad;
    public Speaker(String especialidad,String nombre, String apellido, int edad, int ci){
        this.especialidad=especialidad;
        super(nombre, apellido, edad, ci);
    }
    public String getEspecialidad() {
        return especialidad;
    }
}
