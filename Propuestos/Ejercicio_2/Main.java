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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("¿Desea usar Integer (1) o Double (2)? ");
                int tipo = scanner.nextInt();

                if (tipo == 1) {
                    System.out.print("Ingrese valor 1: ");
                    int val1 = scanner.nextInt();
                    System.out.print("Ingrese valor 2: ");
                    int val2 = scanner.nextInt();
                    Operador<Integer> op = new Operador<>(val1, val2);
                    ejecutarOperacion(opcion, op.getValor1(), op.getValor2());
                } else if (tipo == 2) {
                    System.out.print("Ingrese valor 1: ");
                    double val1 = scanner.nextDouble();
                    System.out.print("Ingrese valor 2: ");
                    double val2 = scanner.nextDouble();
                    Operador<Double> op = new Operador<>(val1, val2);
                    ejecutarOperacion(opcion, op.getValor1(), op.getValor2());
                } else {
                    System.out.println("Tipo inválido.");
                }

            } else if (opcion == 6 || opcion == 7) {
                System.out.print("¿Desea usar Integer (1) o Double (2)? ");
                int tipo = scanner.nextInt();

                if (tipo == 1) {
                    System.out.print("Ingrese valor: ");
                    int val = scanner.nextInt();
                    if (opcion == 6)
                        System.out.println("Resultado: " + raizCuadrada(val));
                    else
                        System.out.println("Resultado: " + raizCubica(val));
                } else if (tipo == 2) {
                    System.out.print("Ingrese valor: ");
                    double val = scanner.nextDouble();
                    if (opcion == 6)
                        System.out.println("Resultado: " + raizCuadrada(val));
                    else
                        System.out.println("Resultado: " + raizCubica(val));
                } else {
                    System.out.println("Tipo inválido.");
                }
            } else if (opcion == 8) {
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

        scanner.close();
    }
