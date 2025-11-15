class NumeroInvalidoException(Exception):
    """Excepción personalizada para valores no numéricos."""
    pass

class Calculadora:
    @staticmethod
    def sumar(a, b):
        return a + b

    @staticmethod
    def restar(a, b):
        return a - b

    @staticmethod
    def multiplicar(a, b):
        return a * b

    @staticmethod
    def dividir(a, b):
        if b == 0:
            raise ArithmeticError("Error: División por cero no permitida.")
        return a / b

    @staticmethod
    def string_a_entero(s):
        if not s.isdigit() and not (s.startswith('-') and s[1:].isdigit()):
            raise NumeroInvalidoException(f"Error: '{s}' no es un número válido.")
        return int(s)

def main():
    # Pruebas de operaciones básicas
    print("Sumar 10 + 5 =", Calculadora.sumar(10, 5))
    print("Restar 10 - 5 =", Calculadora.restar(10, 5))
    print("Multiplicar 10 * 5 =", Calculadora.multiplicar(10, 5))
    
    try:
        print("Dividir 10 / 2 =", Calculadora.dividir(10, 2))
    except ArithmeticError as e:
        print(e)

    try:
        print("Dividir 10 / 0 =", Calculadora.dividir(10, 0))
    except ArithmeticError as e:
        print(e)
    
    try:
        print("Convertir '123' a entero =", Calculadora.string_a_entero("123"))
        print("Convertir '-45' a entero =", Calculadora.string_a_entero("-45"))
    except NumeroInvalidoException as e:
        print(e)

    try:
        print("Convertir 'abc' a entero =", Calculadora.string_a_entero("abc"))
    except NumeroInvalidoException as e:
        print(e)

if __name__ == "__main__":
    main()
