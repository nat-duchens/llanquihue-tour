package ui;

// Importación de clases de los paquetes data y model
import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Class Main: clase principal que contiene el método main
 * Carga los tours desde el archivo, los recorre y los filtra
 * @author Natalie Duchens
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("AGENCIA DE TURISMO LLANQUIHUE TOUR - CATÁLOGO DE TOURS");
        System.out.println("---------------------------------------------------------------------------------");

        // Carga de la lista desde el archivo ubicado en resources
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> misTours = gestor.cargarTours("resources/tours.txt");

        // Recorrido de la colección
        System.out.println("~~ CATÁLOGO COMPLETO ~~");
        for (Tour t : misTours) {
            System.out.println(t.toString());
        }

        // Filtrado por tipo de tour
        System.out.println("\n~~ FILTRADO: TOURS DE AVENTURA ~~");
        for (Tour t : misTours) {
            if (t.getTipo().equalsIgnoreCase("Aventura")) {
                System.out.println(t.toString());
            }
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("¡Consulta finalizada!");
    }
}