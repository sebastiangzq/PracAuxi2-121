import java.util.ArrayList;
import java.util.List;
public class Charla {
    public String lugar;
    public String nombreCharla;
    public Speaker S;
    public int np;
    public List<Participante>Participantes;
    public Charla(String lugar, String nombreCharla, Speaker S, int np){
        this.lugar=lugar;
        this.nombreCharla=nombreCharla;
        this.S=S;
        this.np=np;
        this.Participantes=new ArrayList<>();
    }
    public void agregarParticipantes(Participante participante){
        if (participante!=null){
            Participantes.add(participante);
        }
    }
    public String getLugar() {
        return lugar;
    }

    public String getNombreCharla() {
        return nombreCharla;
    }

    public Speaker getS() {
        return S;
    }

    public int getNp() {
        return np;
    }

    public List<Participante> getParticipantes() {
        return Participantes;
    }
    public String toString(){
        return "[ Lugar de la Charla: "+lugar+", Charla de: "+nombreCharla+", Speaker: "+S.getNombre()+" "+S.getApellido()+", ci del Speaker: "+S.getCi()+" ]";
    }
}
