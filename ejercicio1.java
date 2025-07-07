import java.util.ArrayList;
import java.util.Scanner;

public class ClasificarDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de datos
        System.out.print("Ingrese la cantidad de datos: ");
        int n = scanner.nextInt();

        // Lista principal para almacenar los datos
        ArrayList<Double> listaPrincipal = new ArrayList<>();

        // Cargar los datos en la lista
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            double dato = scanner.nextDouble();
            listaPrincipal.add(dato);
        }

        // Calcular el promedio
        double suma = 0;
        for (double dato : listaPrincipal) {
            suma += dato;
        }
        double promedio = suma / listaPrincipal.size();

        // Listas para clasificar los datos
        ArrayList<Double> menoresIguales = new ArrayList<>();
        ArrayList<Double> mayores = new ArrayList<>();

        // Clasificar los datos
        for (double dato : listaPrincipal) {
            if (dato <= promedio) {
                menoresIguales.add(dato);
            } else {
                mayores.add(dato);
            }
        }

        // Mostrar resultados
        System.out.println("\n=== Resultados ===");
        System.out.println("a) Datos en la lista principal:");
        for (double d : listaPrincipal) {
            System.out.print(d + " ");
        }

        System.out.println("\n\nb) Promedio: " + promedio);

        System.out.println("\nc) Datos menores o iguales al promedio:");
        for (double d : menoresIguales) {
            System.out.print(d + " ");
        }

        System.out.println("\n\nd) Datos mayores al promedio:");
        for (double d : mayores) {
            System.out.print(d + " ");
        }

        scanner.close();
    }
}

