class ProductoNoEncontradoException(Exception):
    pass

class StockInsuficienteException(Exception):
    pass

class Producto:
    def __init__(self, codigo, nombre, precio, stock):
        self.codigo = codigo
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def __str__(self):
        return f"Producto(codigo={self.codigo}, nombre={self.nombre}, precio={self.precio}, stock={self.stock})"

class Inventario:
    def __init__(self):
        self.productos = []

    def agregarProducto(self, p: Producto):
        if any(prod.codigo == p.codigo for prod in self.productos):
            raise Exception(f"El código {p.codigo} ya existe.")
        if p.precio < 0:
            raise Exception("El precio no puede ser negativo.")
        if p.stock < 0:
            raise Exception("El stock no puede ser negativo.")
        self.productos.append(p)

    def buscarProducto(self, codigo: str) -> Producto:
        for prod in self.productos:
            if prod.codigo == codigo:
                return prod
        raise ProductoNoEncontradoException(f"Producto con código {codigo} no encontrado.")

    def venderProducto(self, codigo: str, cantidad: int):
        producto = self.buscarProducto(codigo)
        if producto.stock >= cantidad:
            producto.stock -= cantidad
            print(f"Venta realizada. Stock restante de {producto.nombre}: {producto.stock}")
        else:
            raise StockInsuficienteException(f"Stock insuficiente para vender {cantidad} unidades de {producto.nombre}.")

if __name__ == "__main__":
    inventario = Inventario()

    try:
        p1 = Producto("001", "Manzana", 0.5, 100)
        inventario.agregarProducto(p1)
        p2 = Producto("002", "Banana", 0.3, 50)
        inventario.agregarProducto(p2)

        inventario.venderProducto("001", 20) 
        inventario.venderProducto("002", 60) 
    except Exception as e:
        print(f"Error: {e}")