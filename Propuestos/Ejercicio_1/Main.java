public class Main {
    public static void main(String[] args) {
        Lista<String> listaAlumnos = new Lista<>();
        
        listaAlumnos.add("Maria");
        listaAlumnos.add("Diego");
        listaAlumnos.add("Rene");
        listaAlumnos.add("Alonso");

        System.out.println("Tamaño de la lista: " + listaAlumnos.size());
        System.out.println("Contiene a Diego: " + listaAlumnos.contains("Diego"));
        System.out.println("Contiene a Juan: " + listaAlumnos.contains("Juan"));

        System.out.println("\nLista de alumnos:");
        listaAlumnos.printList();

        System.out.println("\nEliminando a Diego...");
        listaAlumnos.remove("Diego");

        System.out.println("Tamaño actual: " + listaAlumnos.size());
        System.out.println("Lista actual:");
        listaAlumnos.printList();
    }
}
