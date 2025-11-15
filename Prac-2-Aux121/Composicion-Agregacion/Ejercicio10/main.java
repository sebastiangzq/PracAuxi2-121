public class main {
    public static void main(String[]args){
        Evento evento= new Evento("Ciberseguridad",50);
        Charla charla1= new Charla("Auditorio de Informatica","Phishing",new Speaker("Pentester","Juan","Perez",29,13877171),3);
        charla1.agregarParticipantes(new Participante(1,"Lucas","Montes",19,37402975));
        Charla charla2= new Charla("Auditorio de Informatica","Amenazas de seguridad",new Speaker("Hacking Etico","Sebastian","Zalles",25,12861170),3);
        charla2.agregarParticipantes(new Participante(2,"Maria","Ines",22,26581975));
        charla2.agregarParticipantes(new Participante(5,"Kevin","Israel",19,45602977));
        charla2.agregarParticipantes(new Participante(9,"Alejandro","Rodriguez",19,29753740));
        Charla charla3= new Charla("Auditorio de Informatica","Vishing",new Speaker("Pentester","Juan","Perez",29,13877171),3);
        charla3.agregarParticipantes(new Participante(3,"Alvaro","Guzman",30,928461011));
        Charla charla4= new Charla("Auditorio de Informatica","Ingenieria Social",new Speaker("Analista de seguridad","Ademar","Duran",24,87462932),1);
        charla4.agregarParticipantes(new Participante(4,"Beatriz","Azturizaga",24,433772265));
        charla4.agregarParticipantes(new Participante(4,"Jheni","Quisbert",24,11192265));

        evento.agregarCharla(charla1);
        evento.agregarCharla(charla2);
        evento.agregarCharla(charla3);
        evento.agregarCharla(charla4);
        evento.listaCharlas();
        evento.promParticipantes();
        evento.verificarPersona("Sebastian","Zalles");
        evento.verificarPersona("Julio","Baltazar");
        evento.eliminarSpeaker(13877171);
        evento.ordenarCharlasPorParticipantes();

    }
}
