class Ropa:
    def __init__(self, tipo, material):
        self.tipo = tipo
        self.material = material

    def __str__(self):
        return f"Tipo: {self.tipo}, Material: {self.material}"

class Ropero:
    def __init__(self, material):
        self.material = material
        self.ropas = []
        self.capacidad = 20

    def adicionar_prendas(self, nuevas_ropas):
        for prenda in nuevas_ropas:
            if len(self.ropas) < self.capacidad:
                self.ropas.append(prenda)
            else:
                print("El ropero está lleno. No se pueden agregar más prendas.")
                break

    def eliminar_prendas(self, material_x=None, tipo_y=None):
        self.ropas = [prenda for prenda in self.ropas if not (prenda.material == material_x or prenda.tipo == tipo_y)]

    def mostrar_prendas(self, material_x=None, tipo_y=None):
        prendas_filtradas = [prenda for prenda in self.ropas if prenda.material == material_x and prenda.tipo == tipo_y]
        if prendas_filtradas:
            print(f"Prendas de material '{material_x}' y tipo '{tipo_y}':")
            for prenda in prendas_filtradas:
                print(prenda)
        else:
            print(f"No hay prendas de material '{material_x}' y tipo '{tipo_y}'.")

if __name__ == "__main__":
    ropero = Ropero("Madera")

    prendas_a_adicionar = [
        Ropa("Camisa", "Algodón"),
        Ropa("Pantalón", "Jean"),
        Ropa("Chaqueta", "Cuero"),
        Ropa("Camisa", "Seda"),
        Ropa("Pantalón", "Algodón")
    ]

    ropero.adicionar_prendas(prendas_a_adicionar)

    print("Prendas en el ropero:")
    for prenda in ropero.ropas:
        print(prenda)

    ropero.eliminar_prendas(material_x="Algodón", tipo_y="Chaqueta")

    print("\nPrendas después de eliminar las de material 'Algodón' o tipo 'Chaqueta':")
    for prenda in ropero.ropas:
        print(prenda)

    print()
    ropero.mostrar_prendas(material_x="Jean", tipo_y="Pantalón")