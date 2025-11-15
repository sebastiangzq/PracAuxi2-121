public class Producto {
    private String codigo, nombre;
    private double precio;
    private int stock;
    public Producto(String nombre, String codigo, double precio, int stock){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "producto : "+nombre+", su codigo es: "+codigo+" , su precio es: "+precio+" bs y su stock es: "+stock+" unidades";
    }
}
