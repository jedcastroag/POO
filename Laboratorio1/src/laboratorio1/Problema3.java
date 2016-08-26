/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Jeffer
 */
public class Problema3 {

    public static void mostrarCarrito(int[] carrito, int cantlibroscomprados, String[] titulos, int[] totales,
            String[] isbn, int[] cantejemplares) {
        for (int i = 0; i < carrito.length; i++) {
            System.out.println(isbn[carrito[i]] + " |" + titulos[carrito[i]] + " |"
                    + cantejemplares[carrito[i]] + " |" + totales[carrito[i]] + " |");
        }
    }
    public static void mostrarCatalogo(int cantidad, String[] isbn, String[] titulos, int[] precios) {
        System.out.println("\nCatálogo\n");
        System.out.println("| Num List | ISBN | Título | Precio |");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("| " + (i + 1) + " |" + isbn[i] + " |" + titulos[i] + " |" + precios[i] + " |");
        }
    }
    public static String[] addInfoString(int cantidad, String info, String[] array) {
        String[] arraysustituto = new String[cantidad + 1];
        for (int i = 0; i < cantidad; i++) {
            arraysustituto[i] = array[i];
        }
        arraysustituto[cantidad] = info;
        return arraysustituto;
    }
    public static int [] addInfoInt(int cantidad, int info, int [] array) {
        int [] arraysustituto = new int [cantidad + 1];
        for (int i = 0; i < cantidad; i++) {
            arraysustituto[i] = array[i];
        }
        arraysustituto[cantidad] = info;
        return arraysustituto;
    }
    public static void tiendaVirtualLibros() {
        Scanner tec = new Scanner(System.in);
        char add, comprar;
        int cantidad = 0, numprecio;
        String[] isbn = new String[cantidad], titulos = new String[cantidad];
        int [] precio = new int[cantidad];
        String numisbn, titulo;
        System.out.print("¿Desea añadir un libro al catálogo? (y/n): ");
        add = tec.next().charAt(0);
        while (add == 'y') {
            System.out.print("ISBN del libro: ");
            numisbn = tec.next();                                    
            System.out.print("precio del libro: ");
            numprecio = tec.nextInt();
            System.out.print("Título del libro: ");
            titulo = tec.nextLine();
            titulos = addInfoString(cantidad, titulo, titulos);
            isbn = addInfoString(cantidad, numisbn, isbn);
            precio = addInfoInt(cantidad, numprecio, precio);
            System.out.println("\n¿Desea añadir otro libro?");
            add = tec.next().charAt(0);
            cantidad++;
        }
        mostrarCatalogo(cantidad, isbn, titulos, precio);
        System.out.println("¿Desea comprar un libro? (y/n): ");
        comprar = tec.next().charAt(0);
        int subtotal = 0, cantlibroscomprados = 0, numlist, numcantejemplares;
        int [] carrito = new int[cantlibroscomprados];
        int cantejemplares[] = new int[cantlibroscomprados];
        int[] totales = new int[cantlibroscomprados];
        while (comprar == 'y') {
            System.out.println("¿Qué libro desea comprar? (Num List): ");
            numlist = tec.nextInt();
            carrito = addInfoInt(cantlibroscomprados, numlist-1, carrito);            
            System.out.println("¿Cuantos ejemplares?");
            numcantejemplares = tec.nextInt();
            cantejemplares = addInfoInt(cantlibroscomprados, numcantejemplares, cantejemplares);
            subtotal = precio[numlist-1]*numcantejemplares;
            totales = addInfoInt(cantlibroscomprados, subtotal, totales);            
            System.out.println("Desea comprar otro libro? (y/n): ");
            comprar = tec.next().charAt(0);                    
            cantlibroscomprados++;
        }
        mostrarCarrito(carrito, cantlibroscomprados+1, titulos, totales, isbn, cantejemplares);
        int i = 0, total = 0; 
        for (i = 0; i < totales.length; i++) {
            total = total + totales[i];
        }
        System.out.println("El total a pagar es: " + total);
        
    }

    public static void main(String[] args) {
        System.out.println("Bienvenid@ a la tienda virtual");
        tiendaVirtualLibros();        
    }
}
