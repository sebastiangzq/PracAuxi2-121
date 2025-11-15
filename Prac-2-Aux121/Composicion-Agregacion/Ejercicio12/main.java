public class main {
    public static void main(String[]args){
        Hospital hospital1 = new Hospital("Obrero");
        Hospital hospital2 = new Hospital("Arcoiris");
        hospital1.asignarDoctores(new Doctor("Juan Perez","Cardiologo"));
        hospital1.asignarDoctores(new Doctor("Alexander Soto","Pediatra"));
        hospital2.asignarDoctores(new Doctor("Alan Fabricio","Dermatologo"));
        hospital2.asignarDoctores(new Doctor("Beymar Rodriguez","Radiologo"));
        hospital1.asignarDoctores(new Doctor("Maria Ines","Odontologa"));
        hospital2.asignarDoctores(new Doctor("Chistian Lopez","Neurologia"));
        hospital1.mostrarDocs();
        hospital2.mostrarDocs();
    }
}
