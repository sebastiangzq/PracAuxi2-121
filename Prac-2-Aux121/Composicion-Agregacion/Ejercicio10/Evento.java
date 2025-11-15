import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Evento {
    public String nombre;
    public int nc;
    public List<Charla>charlas;
    public Evento(String nombre, int nc){
        this.nombre=nombre;
        this.nc=nc;
        this.charlas=new ArrayList<>();
    }
    public void agregarCharla(Charla c){
        if (charlas.size()<50){
            charlas.add(c);
        }
        else {
            System.out.println("Se alcanzo el limite de charlas (50)");
        }
    }
    public void listaCharlas(){
        System.out.println("----------------");
        System.out.println("Lista de charlas");
        System.out.println("----------------");
        for (Charla c: charlas){
            System.out.println(c);
        }
    }
    public void promParticipantes(){
        int t=0,cont=0,prom;
        for (Charla c: charlas){
            for (Participante p: c.getParticipantes()){
                t=t+p.getEdad();
                cont++;
            }
        }
        prom=t/cont;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("El promedio de la edad de los participantes en el evento: "+nombre+", es : "+prom);
    }
    public void verificarPersona(String nombre, String apellido){
        boolean t=false;
        for (Charla c: charlas){
            for (Participante p: c.getParticipantes()){
               if ((p.getNombre().equalsIgnoreCase(nombre) && p.getApellido().equalsIgnoreCase(apellido)) || (c.getS().getNombre().equalsIgnoreCase(nombre) && c.getS().getApellido().equalsIgnoreCase(apellido))){
                   System.out.println("--------------------------------------------------------------------------------------");
                   System.out.println("La persona con nombre: "+nombre+" con apellido: "+apellido+" se encuentra en el evento");
                   t=true;
                   break;
               }
            }
        }
        if (t==false){
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("La persona con nombre: "+nombre+" y apellido: "+apellido+", no se encuentra en el evento");
        }
    }
    public void eliminarSpeaker(int ci){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Eliminando al Speaker que no pudo asistir con el ci: "+ci);
        System.out.println("-------------------------------------------------------------");
        charlas.removeIf(charla -> charla.getS().getCi() == ci);
        System.out.println("Se elimino al Speaker con carnet: "+ci+" de todas las charlas que daria");
        System.out.println("Lista de charlas actuales");
        for (Charla c: charlas){
            System.out.println(c);
        }
    }
    public void ordenarCharlasPorParticipantes() {
        charlas.sort(Comparator.comparingInt(Charla::getNp).reversed());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Lista de charlar ordenadas segun participantes");
        for (Charla c: charlas){
            System.out.println(c+" Numero de participantes: "+c.getNp());
        }
    }
}
