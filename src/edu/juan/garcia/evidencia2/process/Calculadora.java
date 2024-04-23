package edu.juan.garcia.evidencia2.process;
import edu.juan.garcia.evidencia2.data.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que proporciona métodos para calcular el costo total de una lista de productos
 * y para generar productos aleatorios.
 */
public class Calculadora {

    /**
     * Calcula el costo total de una lista de productos.
     * @param listaDeProductos Lista de productos a calcular.
     * @return Costo total de la lista de productos.
     */
    public static double calcularCostoTotal(List<Producto> listaDeProductos) {
        double costoTotal = 0;
        for (Producto producto : listaDeProductos) {
            costoTotal += producto.calcularCosto();
        }
        return costoTotal;
    }

    /**
     * Genera una lista de productos aleatorios.
     * La cantidad de cada tipo de producto (canciones, videojuegos, libros, películas)
     * se genera aleatoriamente entre 1 y 5.
     * @return Lista de productos aleatorios.
     */
    public static List<Producto> generarProductosAleatorios() {
        List<Producto> listaDeProductos = new ArrayList<>();
        Random random = new Random();

        int cantidadCanciones = random.nextInt(5) + 1; // Genera de 1 a 5 canciones
        int cantidadVideojuegos = random.nextInt(5) + 1; // Genera de 1 a 5 videojuegos
        int cantidadLibros = random.nextInt(5) + 1; // Genera de 1 a 5 libros
        int cantidadPeliculas = random.nextInt(5) + 1; // Genera de 1 a 5 películas

        for (int i = 0; i < cantidadCanciones; i++) {
            listaDeProductos.add(new Cancion("Canción " + (i+1), 5, random.nextBoolean(), random.nextInt(10)));
        }

        for (int i = 0; i < cantidadVideojuegos; i++) {
            listaDeProductos.add(new Videojuego("Videojuego " + (i+1), 5, random.nextBoolean(), random.nextInt(10)));
        }

        for (int i = 0; i < cantidadLibros; i++) {
            listaDeProductos.add(new Libro("Libro " + (i+1), 5, random.nextBoolean(), random.nextInt(30), "novela"));
        }

        for (int i = 0; i < cantidadPeliculas; i++) {
            listaDeProductos.add(new Pelicula("Película " + (i+1), 5, random.nextBoolean()));
        }

        return listaDeProductos;
    }
}