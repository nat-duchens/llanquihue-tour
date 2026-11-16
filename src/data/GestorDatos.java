package data;

import model.Tour;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class GestorDatos: lee los tours desde un archivo de texto
 * Crea objetos Tour y los almacena en un ArrayList
 * @author Natalie Duchens
 */

public class GestorDatos {

    // Lee el archivo línea por línea y retorna una lista de tours
    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> lista = new ArrayList<>();

        try {
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                // Separación de los datos con el punto y coma
                String[] partes = linea.split(";");

                if (partes.length == 3) {
                    String nombre = partes[0];
                    String tipo = partes[1];
                    int precio = Integer.parseInt(partes[2]); // Conversión de texto a entero

                    // Creación del objeto y almacenamiento en la lista
                    lista.add(new Tour(nombre, tipo, precio));
                }
            }
            lector.close();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return lista;
    }

}