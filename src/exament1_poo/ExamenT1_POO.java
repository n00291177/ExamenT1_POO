/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exament1_poo;

import java.util.Scanner;

/**
 *
 * @author piere
 */
public class ExamenT1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Yo soy Deibys-prueba 1");
        System.out.println("Mensaje nuevo");
        Scanner sc = new Scanner(System.in);
        GestionProductoT1 gestion = new GestionProductoT1();
        int opcion;

        do {
            System.out.println("==== Tienda de Ropa ====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar todos los productos");
            System.out.println("3. Listar productos por categoria");
            System.out.println("4. Actualizar prenda");
            System.out.println("5. Eliminar prenda");
            System.out.println("6. Buscar prenda");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();
                    System.out.print("Precio: S/ ");
                    double precio = sc.nextDouble();
                    gestion.agregarProducto(nombre, categoria, precio);
                    break;
                case 2:
                    gestion.listarProductos();
                    break;
                case 3:
                    System.out.print("Ingrese la categoria: ");
                    String cat = sc.nextLine();
                    gestion.listarPorCategoria(cat);
                    break;
                case 4:
                    System.out.print("Ingrese ID del producto a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva categoria: ");
                    String nuevaCategoria = sc.nextLine();
                    System.out.print("Nuevo precio: S/ ");
                    double nuevoPrecio = sc.nextDouble();
                    gestion.actualizarProducto(idActualizar, nuevoNombre, nuevaCategoria, nuevoPrecio);
                    break;
                case 5:
                    System.out.print("Ingrese ID del producto a eliminar: ");
                    int idEliminar = sc.nextInt();
                    gestion.eliminarProducto(idEliminar);
                    break;
                case 6:
                    System.out.println("Nombre de la prenda para buscar");
                    String nombreBuscar = sc.nextLine();
                    gestion.buscarProductoPorNombre(nombreBuscar);
                    break;
                    
                case 7:
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida.\n");
            }
        } while (opcion != 7);

        sc.close();
    }
    
}
