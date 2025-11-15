public class Participante extends Persona{
    public int nroTicket;
    public Participante(int nroTicket,String nombre, String apellido, int edad, int ci){
        this.nroTicket=nroTicket;
        super(nombre, apellido, edad, ci);
    }

    public int getNroTicket() {
        return nroTicket;
    }
}
