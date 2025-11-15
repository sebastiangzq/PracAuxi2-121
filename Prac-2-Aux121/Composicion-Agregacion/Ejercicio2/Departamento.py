class Empleado:
    def __init__(self, nombre, cargo, sueldo):
        self.nombre = nombre
        self.cargo = cargo
        self.sueldo = sueldo

    def __str__(self):
        return f"{self.nombre} - {self.cargo} - ${self.sueldo}"

class Departamento:
    def __init__(self, nombre, area):
        self.nombre = nombre
        self.area = area
        self.empleados = []

    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)

    def mostrarEmpleados(self):
        if not self.empleados:
            print(f"El departamento {self.nombre} no tiene empleados.")
            return
        print(f"Empleados del departamento {self.nombre}:")
        for emp in self.empleados:
            print(emp)

    def cambioSalario(self, nuevo_sueldo):
        for emp in self.empleados:
            emp.sueldo = nuevo_sueldo

    def perteneceEmpleado(self, empleado):
        return empleado in self.empleados

    def moverEmpleados(self, otro_departamento):
        otro_departamento.empleados.extend(self.empleados)
        self.empleados.clear()

dep1 = Departamento("Recursos Humanos", "Administración")
dep2 = Departamento("Tecnología", "Desarrollo")

empleados_dep1 = [
    Empleado("Ana", "Analista", 3000),
    Empleado("Juan", "Coordinador", 3500),
    Empleado("Luis", "Asistente", 2500),
    Empleado("Marta", "Gerente", 5000),
    Empleado("Sofia", "Secretaria", 2000)
]

for emp in empleados_dep1:
    dep1.agregar_empleado(emp)

dep1.mostrarEmpleados()
dep2.mostrarEmpleados()

print("\nCambiando salario de empleados del departamento 1 a 4000...\n")
dep1.cambioSalario(4000)
dep1.mostrarEmpleados()
print("\nVerificando si algún empleado del departamento 1 pertenece al departamento 2:")
for emp in dep1.empleados:
    if dep2.perteneceEmpleado(emp):
        print(f"{emp.nombre} pertenece a ambos departamentos.")
        break
else:
    print("Ningún empleado del departamento 1 pertenece al departamento 2.")

print("\nMoviendo empleados del departamento 1 al departamento 2...\n")
dep1.moverEmpleados(dep2)

dep1.mostrarEmpleados()
dep2.mostrarEmpleados()