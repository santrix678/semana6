import java.util.ArrayList;
import java.util.Scanner;

public class CompararListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear listas
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        // Pedir cantidad de datos para la primera lista
        System.out.print("Ingrese la cantidad de datos para la primera lista: ");
        int n1 = scanner.nextInt();

        // Cargar datos en la primera lista (por el inicio)
        for (int i = 0; i < n1; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + " para la primera lista: ");
            int dato = scanner.nextInt();
            lista1.add(0, dato); // Insertar al inicio
        }

        // Pedir cantidad de datos para la segunda lista
        System.out.print("\nIngrese la cantidad de datos para la segunda lista: ");
        int n2 = scanner.nextInt();

        // Cargar datos en la segunda lista (por el inicio)
        for (int i = 0; i < n2; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + " para la segunda lista: ");
            int dato = scanner.nextInt();
            lista2.add(0, dato); // Insertar al inicio
        }

        // Verificar igualdad de tamaño y contenido
        if (lista1.size() == lista2.size()) {
            if (lista1.equals(lista2)) {
                System.out.println("\nResultado: Las listas son iguales en tamaño y en contenido.");
            } else {
                System.out.println("\nResultado: Las listas son iguales en tamaño, pero no en contenido.");
            }
        } else {
            System.out.println("\nResultado: Las listas no tienen el mismo tamaño ni contenido.");
        }

        // Mostrar las listas
        System.out.println("\nPrimera lista: " + lista1);
        System.out.println("Segunda lista: " + lista2);

        scanner.close();
    }
}

