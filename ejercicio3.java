import java.util.LinkedList;
import java.util.Scanner;

class Vehiculo {
    String placa;
    String marca;
    String modelo;
    int anio;
    double precio;

    public Vehiculo(String placa, String marca, String modelo, int anio, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Precio: $" + precio;
    }
}

public class RegistroVehiculos {
    static LinkedList<Vehiculo> listaVehiculos = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n===== Menú =====");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Buscar vehículo por placa");
            System.out.println("3. Ver vehículos por año");
            System.out.println("4. Ver todos los vehículos registrados");
            System.out.println("5. Eliminar vehículo registrado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarVehiculo();
                    break;
                case 2:
                    buscarPorPlaca();
                    break;
                case 3:
                    verPorAnio();
                    break;
                case 4:
                    verTodos();
                    break;
                case 5:
                    eliminarVehiculo();
                    break;
                case 6:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
    }

    static void agregarVehiculo() {
