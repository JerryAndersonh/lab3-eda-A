import java.util.Scanner;

public class Main {

    // Métodos genéricos
    static <T extends Number> double suma(T valor1, T valor2) {
        return valor1.doubleValue() + valor2.doubleValue();
    }

    static <T extends Number> double resta(T valor1, T valor2) {
        return valor1.doubleValue() - valor2.doubleValue();
    }

    static <T extends Number> double producto(T valor1, T valor2) {
        return valor1.doubleValue() * valor2.doubleValue();
    }

    static <T extends Number> double division(T valor1, T valor2) {
        if (valor2.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return valor1.doubleValue() / valor2.doubleValue();
    }

    static <T extends Number> double potencia(T valor1, T valor2) {
        return Math.pow(valor1.doubleValue(), valor2.doubleValue());
    }

    static <T extends Number> double raizCuadrada(T valor) {
        return Math.sqrt(valor.doubleValue());
    }

    static <T extends Number> double raizCubica(T valor) {
        return Math.cbrt(valor.doubleValue());
    }
