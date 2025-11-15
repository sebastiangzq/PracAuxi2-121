import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner lee= new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Cuantas prendas quiere agregar?");
        System.out.println("------------------------------");
        int n= lee.nextInt();
        Ropero ropero= new Ropero("Madera",n);
        lee.nextLine();

        for (int i=0; i<n; i++){
            System.out.println("Prenda "+(i+1));
            System.out.print("tipo: ");String tipo=lee.nextLine();
            System.out.print("material: ");String material=lee.nextLine();

            Ropa prenda= new Ropa(tipo,material);
            ropero.agregarPrenda(prenda);
        }
        ropero.mostrarPrendas();
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese que material o tipo de prendas eliminara ");
        System.out.println("-------------------------------------------------");
        System.out.print("Tipo de prenda a eliminar: ");String tipoeli= lee.nextLine();
        System.out.print("Tipo de material a eliminar: ");String materialeli= lee.nextLine();
        ropero.eliminarPrendas(tipoeli,materialeli);
        System.out.println("-------------------------------");
        System.out.println("Ropero con prenda(s) eliminadas");
        ropero.mostrarPrendas();
        System.out.println("-----------------------------------------------------");
        System.out.println("Ingrese que prendas de materia x y de tipo quiere ver");
        System.out.println("-----------------------------------------------------");
        System.out.print("Tipo de prenda a mostrar: ");String tipover= lee.nextLine();
        System.out.print("Tipo de material a mostrar: ");String materialver= lee.nextLine();
        ropero.mostrarPrendas(tipover,materialver);
    }
}
