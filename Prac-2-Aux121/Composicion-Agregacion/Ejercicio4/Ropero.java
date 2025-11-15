import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Ropero {
    private String material;
    private int nroRopas;
    private List<Ropa>prendas;

    public Ropero(String material, int nroRopas){
        this.material=material;
        this.nroRopas=nroRopas;
        this.prendas=new ArrayList<>();
    }
    public void agregarPrenda(Ropa prenda){
        prendas.add(prenda);
    }
    public void eliminarPrendas(String tipo, String material){
        Iterator<Ropa> it= prendas.iterator();
        while (it.hasNext()){
            Ropa r=it.next();
            if (r.getMaterial().equalsIgnoreCase(material) || r.getTipo().equalsIgnoreCase(tipo)){
                it.remove();
            }
        }
    }
    public void mostrarPrendas(){
        System.out.println("------------------------------");
        System.out.println("Todas las prendas del ropero: ");
        System.out.println("------------------------------");
        for (Ropa ropa:prendas){
            System.out.println(ropa);
        }
    }
    public void mostrarPrendas(String tipo, String material){
        System.out.println("-------------------------------------------");
        System.out.println("Mostrando prendas de tipo x o material y:  ");
        System.out.println("-------------------------------------------");
        for (Ropa ropa:prendas){
            if (ropa.getTipo().equalsIgnoreCase(tipo)||ropa.getMaterial().equalsIgnoreCase(material)){
                System.out.println(ropa);
            }
        }
    }

}

