import java.util.ArrayList;
import java.util.List;
public class Inventario {
    private List<Producto> productos;
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    public void agregarProductos(Producto producto) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(producto.getCodigo())) {
                throw new IllegalArgumentException(producto.getNombre()+"... el codigo del producto ya existe " + p.getCodigo());
            }
        }
            if (producto.getPrecio() < 0) {
                throw new IllegalArgumentException(producto.getNombre()+"... el precio del producto es negativo");
            }
            else {
                if (producto.getStock() < 0) {
                    throw new IllegalArgumentException(producto.getNombre()+"... el stock del producto es negativo");
                }
                else {
                    System.out.println("Se añadio exitosamente el "+producto);
                    productos.add(producto);
                }
            }

    }
    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException{
        boolean t=false;
        for (Producto p: productos){
            if (p.getCodigo().equalsIgnoreCase(codigo)){
                System.out.println("Se encontro el producto "+p.getNombre()+", su codigo es: "+p.getCodigo());
                t=true;
                Producto prod=new Producto(p.getNombre(),p.getCodigo(),p.getPrecio(),p.getStock());
                return prod;
            }
        }
        if (t!=true){
            throw new ProductoNoEncontradoException("Producto no encontrado con codigo: "+codigo);
        }
        return null;
    }
    public void venderProducto(String codigo, int cantidad) throws StockInsuficienteException, ProductoNoEncontradoException {
        System.out.println("Buscando el producto...");
        Producto p=buscarProducto(codigo);
        if (p.getStock()<cantidad){
            throw new StockInsuficienteException("El stock es insuficiente para vender la cantidad de "+cantidad+" unidades");
        }
        else {
            p.setStock(p.getStock()-cantidad);
            System.out.println("Se vendio exitosamente la cantidad de "+cantidad+" unidades, el nuevo stock es de "+p.getStock()+" unidades");
        }
    }
    public void mostrarInventario(){
        System.out.println("--------------------");
        System.out.println("El inventario actual");
        System.out.println("--------------------");
        for (Producto p: productos){
            System.out.println(p);
        }
    }
  }

