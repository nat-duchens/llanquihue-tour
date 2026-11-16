package model;

/**
 * Class Tour: representa un tour ofrecido por Llanquihue Tour
 * Almacena el nombre, el tipo y el precio de cada tour
 * @author Natalie Duchens
 */

public class Tour {

    // Atributos privados
    private String nombre;
    private String tipo;
    private int precio;

    // Constructor vacío
    public Tour() {
        this.nombre = "Sin Nombre";
        this.tipo = "Sin Tipo";
        this.precio = 0;
    }

    // Constructor con parámetros
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Override del método toString() para mostrar la información del tour
    @Override
    public String toString() {
        return "Tour: " + nombre + " | Categoría: " + tipo + " | Precio: $" + precio;
    }

}