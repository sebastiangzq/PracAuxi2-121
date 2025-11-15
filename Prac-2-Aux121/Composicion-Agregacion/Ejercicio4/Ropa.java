public class Ropa {
    private String tipo, material;
    public Ropa(String tipo, String material){
        this.tipo=tipo;
        this.material=material;
    }
    public String getTipo() {
        return tipo;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return "[Ropa de tipo: "+tipo+", material: "+material+"]";
    }
}
