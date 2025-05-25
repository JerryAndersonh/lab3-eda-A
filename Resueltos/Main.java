package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: ArrayList de Strings e Integers
        ArrayList<String> alumnos = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();

        alumnos.add("MARIA");
        alumnos.add("DIEGO");
        alumnos.add("RENE");
        alumnos.add("ALONSO");

        System.out.println("HashCode: " + alumnos.hashCode());
        System.out.println("¿Está vacío?: " + alumnos.isEmpty());
        System.out.println("Tamaño de la lista: " + alumnos.size());

        // Ejercicio 2: Iterador
        System.out.println("Lista de alumnos usando iterador:");
        Iterator<String> itA = alumnos.iterator();
        while (itA.hasNext()) {
            System.out.println(itA.next());
        }

        // Ejercicio 3: Clase Animal
        ArrayList<Animal> mascotas = new ArrayList<Animal>();
        mascotas.add(new Animal("Luna", false));
        mascotas.add(new Animal("Max", true));

        // List<Animal> mascotas2 = new List<Animal>(); // Esta línea es incorrecta, List es interfaz
        List<Animal> mascotas2 = new ArrayList<Animal>(); // Corrección
        mascotas2.add(new Animal("Toby", true));
        mascotas2.add(new Animal("Mia", false));

        System.out.println("\nMascotas registradas:");
        for (Animal a : mascotas2) {
            System.out.println(a.getNombre() + " - Género: " + (a.isGenero() ? "Macho" : "Hembra"));
        }
    }
}
