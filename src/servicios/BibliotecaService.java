package servicios;


import modelos.libro;   
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaService {

    private ArrayList<libro> libros = new ArrayList<>();  //Lista para almacenar libros

    public void agregarLibro(Scanner sc) {
        System.out.print("Código del libro: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Stock: ");
        int stock = sc.nextInt();
        sc.nextLine();

        libro libroNuevo = new libro(codigo, stock, titulo, autor); 
        libros.add(libroNuevo);

        System.out.println(" Libro agregado correctamente.\n");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println(" No hay libros registrados.\n");
            return;
        }

        System.out.println("\n===== LISTADO DE LIBROS =====");
        libros.forEach(System.out::println);
        System.out.println();
    }
}

