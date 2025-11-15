public class main {
    public static void main(String[]args) throws ProductoNoEncontradoException, StockInsuficienteException {
        Inventario inventario = new Inventario();
        System.out.println("-------------------");
        System.out.println("Añadiendo productos");
        System.out.println("-------------------");
        try {
            inventario.agregarProductos(new Producto("Jabon", "001", 4, 67));
        }catch (IllegalArgumentException e){
            System.out.println("Error al añadir el producto "+e.getMessage());
        }
        try {
            inventario.agregarProductos(new Producto("Mermelada", "002", 16, 36));
        }catch (IllegalArgumentException e){
            System.out.println("Error al añadir el producto "+e.getMessage());
        }
        try {
            inventario.agregarProductos(new Producto("Laptop", "003", 8900, 163));
        }catch (IllegalArgumentException e){
            System.out.println("Error al añadir el producto "+e.getMessage());
        }
        try {
            inventario.agregarProductos(new Producto("Television", "004", 13000, 134));
        }catch (IllegalArgumentException e){
            System.out.println("Error al añadir el producto "+e.getMessage());
        }
        try {
            inventario.agregarProductos(new Producto("Tijera", "005", -4, 20));
        }catch (IllegalArgumentException e){
            System.out.println("Error al añadir el producto "+e.getMessage());
        }
        inventario.mostrarInventario();
        System.out.println("------------------");
        System.out.println("Buscando productos");
        System.out.println("------------------");
        try {
            inventario.buscarProducto("002");
        }catch (ProductoNoEncontradoException f){
            System.out.println(f.getMessage());
        }
        try {
            inventario.buscarProducto("008");
        }catch (ProductoNoEncontradoException f){
            System.out.println(f.getMessage());
        }
        try {
            inventario.buscarProducto("004");
        }catch (ProductoNoEncontradoException f){
            System.out.println(f.getMessage());
        }
        System.out.println("-------------------");
        System.out.println("Vendiendo productos");
        System.out.println("-------------------");
        try {
            inventario.venderProducto("001", 30);
        }catch (ProductoNoEncontradoException | StockInsuficienteException s){
            System.out.println(s.getMessage());
        }
        try {
            inventario.venderProducto("002", 60);
        }catch (ProductoNoEncontradoException | StockInsuficienteException s){
            System.out.println(s.getMessage());
        }
        try {
            inventario.venderProducto("004", 60);
        }catch (ProductoNoEncontradoException | StockInsuficienteException s){
            System.out.println(s.getMessage());
        }
        inventario.mostrarInventario();
    }
}
