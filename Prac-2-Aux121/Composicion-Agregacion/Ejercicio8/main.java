public class main {
    public static void main(String[]args){
        EntradaUniversitaria sistema= new EntradaUniversitaria();

        Facultad ingenieria=sistema.registrarFacultad("Ingenieria");
        Facultad derecho=sistema.registrarFacultad("Derecho");

        Persona encargado1= new Persona("Carlos Bolaños",23,ingenieria,null);
        Persona encargado2= new Persona("Ana Maria",20,derecho,null);

        Fraternidad alfa= new Fraternidad("VivaEvo",encargado1);
        Fraternidad beta= new Fraternidad("VivaTuto",encargado2);

        sistema.registrarParticipante("Luis Ramirez", 20, ingenieria, alfa);
        sistema.registrarParticipante("Alan Fabricio",19,derecho,beta);
        sistema.registrarParticipante("Alan Fabricio",19,ingenieria,alfa);
        sistema.registrarParticipante("Beymar Alexander",18,ingenieria,alfa);
        sistema.registrarParticipante("Sabrina Marquez",19,derecho,beta);
        sistema.registrarParticipante("Sebastian Zalles", 19,ingenieria,alfa);

        sistema.mostrarBailarines();
        sistema.registrarFraternidad(alfa);
        sistema.registrarFraternidad(beta);
        sistema.mostrarEncargados();
        sistema.mostrarEdades();
    }
}
