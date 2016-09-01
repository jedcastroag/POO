/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.Scanner;

/**
 *
 * @author Jeffer
 */
public class Problema5 {

    static int[] sillasDisponibles(int[][] sillas) {
        boolean centinela = false;
        int filapuestos = 0, cantpuestosdisponibles = 0, puestofinal = 0;
        int[] puestosdisponibles = new int[11];
        for (int fila = 0; fila < 11; fila++) {
            for (int puesto = 0; puesto < 20; puesto++) {
                if (sillas[fila][puesto] == 0) {
                    centinela = true;
                    filapuestos = fila;
                    puestofinal = puesto + 1;
                    cantpuestosdisponibles++;
                }
            }
            puestosdisponibles[fila] = cantpuestosdisponibles;
            if (centinela == true) {
                int puestoinicial = puestofinal - cantpuestosdisponibles;
                char letrafila = letraFila(filapuestos);
                System.out.println("Hay puestos en la fila " + letrafila + " de la silla " + puestoinicial
                        + " a la " + puestofinal);
                cantpuestosdisponibles = 0;
            }
            centinela = false;
        }
        return puestosdisponibles;
    }

    static void buscaReserva(int[][] sillas, int numid) {
        boolean centinela = false;
        int puestosreservados = 0;
        for (int fila = 0; fila < 11; fila++) {
            int filapuestos = 0, puestoinicial = 0, puestofinal;
            for (int puesto = 0; puesto < 20; puesto++) {
                if (sillas[fila][puesto] == numid) {
                    filapuestos = fila;
                    puestoinicial = puesto;
                    puestosreservados++;
                } else {

                }
            }
            if (centinela == true) {
                puestofinal = puestoinicial + 1;
                puestoinicial = puestofinal - puestosreservados;
                char letrafila = letraFila(filapuestos);
                System.out.println("La reservación está en la fila " + letrafila + " de la silla " + puestoinicial
                        + " a la " + puestofinal);
                puestosreservados = 0;
            } else {

            }
            centinela = false;
        }
    }

    static int[] addInfo(int info, int[] array) {
        int[] arraysustituto = new int[array.length + 1];
        for (int pos = 0; pos < array.length; pos++) {
            arraysustituto[pos] = array[pos];
        }
        arraysustituto[array.length] = info;
        return arraysustituto;
    }

    static char letraFila(int fila) {
        char letra = 'l';
        switch (fila) {
            case 0:
                letra = 'A';
                break;
            case 1:
                letra = 'B';
                break;
            case 2:
                letra = 'C';
                break;
            case 3:
                letra = 'D';
                break;
            case 4:
                letra = 'E';
                break;
            case 5:
                letra = 'F';
                break;
            case 6:
                letra = 'G';
                break;
            case 7:
                letra = 'H';
                break;
            case 8:
                letra = 'I';
                break;
            case 9:
                letra = 'J';
                break;
            case 10:
                letra = 'K';
                break;
            default:
                break;
        }
        return letra;
    }

    static int numfila(char letra) {
        int fila;
        switch (letra) {
            case 'A':
                fila = 0;
                break;
            case 'B':
                fila = 1;
                break;
            case 'C':
                fila = 2;
                break;
            case 'D':
                fila = 3;
                break;
            case 'E':
                fila = 4;
                break;
            case 'F':
                fila = 5;
            case 'G':
                fila = 6;
                break;
            case 'H':
                fila = 7;
                break;
            case 'I':
                fila = 8;
                break;
            case 'J':
                fila = 9;
                break;
            case 'K':
                fila = 10;
                break;
            default:
                throw new AssertionError();
        }
        return fila;
    }

    static int reservar(int[][] sillas, int[][] precios, int numid) {
        Scanner teclado = new Scanner(System.in);
        boolean centinela1 = false;
        boolean centinela = false;
        int puestosdisponibles = 0;
        while (centinela1 == false) {
            System.out.println("¿Qué tipo de fila va a reservar? 1. Preferencial   2. General");
            int tipofilas = teclado.nextInt();
            switch (tipofilas) {
                case 1:
                    for (int fila = 8; fila < 11; fila++) {
                        int filapuestos = 0, puestoinicio = 0;
                        for (int puesto = 0; puesto < 20; puesto++) {
                            if (sillas[fila][puesto] == 0) {
                                centinela = true;
                                filapuestos = fila;
                                puestoinicio = puesto;
                                puestosdisponibles++;
                            }
                        }
                        if (centinela == true) {
                            int puestofinal = puestoinicio + 1;
                            puestoinicio = puestofinal - puestosdisponibles;
                            System.out.println("Hay puestos en la fila " + letraFila(filapuestos) + " de la silla "
                                    + (puestoinicio + 1) + " a la " + puestofinal);
                            puestosdisponibles = 0;
                        }
                        centinela = false;
                    }
                    centinela1 = true;
                    break;
                case 2:
                    for (int fila = 0; fila < 8; fila++) {
                        int filapuestos = 0, puestoinicio = 0;
                        for (int puesto = 0; puesto < 20; puesto++) {
                            if (sillas[fila][puesto] == 0) {
                                centinela = true;
                                filapuestos = fila;
                                puestoinicio = puesto;
                                puestosdisponibles++;
                            }
                        }
                        if (centinela == true) {
                            int puestofinal = puestoinicio + 1;
                            puestoinicio = puestofinal - puestosdisponibles;
                            System.out.println("Hay puestos en la fila " + letraFila(filapuestos) + " de la silla "
                                    + (puestoinicio + 1) + " a la " + puestofinal);
                            puestosdisponibles = 0;
                        }
                        centinela = false;
                    }
                    centinela1 = true;
                    break;
                default:
                    System.out.println("Opcion no valida, seleccione la opción correcta");
                    break;
            }
        }
        System.out.println("¿En que fila se reservarán los puestos?");
        char filareserva = teclado.next().charAt(0);
        int fila = numfila(filareserva);
        System.out.println("¿A partir de que puesto?");
        int puestoinicial = teclado.nextInt();
        System.out.println("¿Hasta que puesto?");
        int puestofinal = teclado.nextInt();
        int precioreservacion = 0;
        for (puestoinicial = puestoinicial - 1; puestoinicial < puestofinal; puestoinicial++) {
            sillas[fila][puestoinicial] = numid;
            precioreservacion += precios[fila][puestoinicial];
        }
        return precioreservacion;

    }

    static void recargas(int[] tarcine, int[] id, int numid) {
        Scanner teclado = new Scanner(System.in);
        boolean centinela = false;
        while (centinela == false) {
            System.out.println("¿Cuanto desea recargar?");
            int valor = teclado.nextInt();
            if (valor < 50000) {
                System.out.println("Debe recargar a partir de cincuenta mil");
            } else {
                int posid = buscarPosID(id, numid);
                tarcine[posid] = valor;
                centinela = true;
            }
        }

    }

    static int buscarPosID(int[] id, int numid) {
        int posid = 0;
        for (int pos = 0; pos < id.length; pos++) {
            if (id[pos] == numid) {
                posid = pos;
            }
        }
        return posid;
    }

    static void addPrecios(int[][] precios) {
        for (int fila = 0; fila < 11; fila++) {
            for (int puesto = 0; puesto < 20; puesto++) {
                if (fila > 7) {
                    precios[fila][puesto] = 11000;
                } else {
                    precios[fila][puesto] = 8000;
                }
            }
        }
    }

    static void cancelarReserva(int[][] sillas, int[] precioreserva, int[] id) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es su número de identificacióin?");
        int numid = teclado.nextInt();
        for (int fila = 0; fila < 11; fila++) {
            for (int puesto = 0; puesto < 20; puesto++) {
                if (sillas[fila][puesto] == numid) {
                    sillas[fila][puesto] = 0;
                }
            }
        }
        int posid = buscarPosID(id, numid);
        precioreserva[posid] = 0;
    }

    static void manejoSalaCine() {
        Scanner teclado = new Scanner(System.in);
        int[][] precios = new int[11][20], sillas = new int[11][20];
        int[] preciosreserva = new int[0], id = new int[0], tarcine = new int[0];
        int[] totales = new int[0];
        addPrecios(precios);
        boolean centinela = true;
        while (centinela == true) {
            System.out.println("¿Reserva, Venta o Ninguna? (r/v/n)");
            char resp = teclado.next().charAt(0);
            //Segmento de codigo para reservar y cancelar reservación
            switch (resp) {
                case 'r':
                    System.out.println("¿Desea Cancelar alguna reservación? (y / n)");
                    char cancelar = teclado.next().charAt(0);
                    if (cancelar == 'y') {
                        cancelarReserva(sillas, preciosreserva, id);
                        System.out.println("Se ha cancelado la reservación");
                    } else {
                        //Segmento para comprar o recargar
                        System.out.println("¿Ya tiene la tarjeta TARCINE?");
                        char resp1 = teclado.next().charAt(0);
                        char resp2;
                        if (resp1 == 'y') {
                            System.out.println("¿Desea recargarla? (y/n)");
                            resp2 = teclado.next().charAt(0);
                            int numid;
                            if (resp2 == 'y') {
                                System.out.println("¿Cual es el número de identificación?");
                                numid = teclado.nextInt();
                                recargas(tarcine, id, numid);
                            } else {
                                System.out.println("¿Cual es el número de identificación?");
                                numid = teclado.nextInt();
                            }
                            int posid = buscarPosID(id, numid);
                            int precioreservacion = reservar(sillas, precios, numid);
                            preciosreserva[posid] = precioreservacion;
                        } else {
                            System.out.println("¿Desea Comprar una? (y/n)");
                            resp2 = teclado.next().charAt(0);
                            if (resp2 == 'y') {
                                System.out.println("¿Cuál es el numero de identificación?");
                                int numid = teclado.nextInt();
                                id = addInfo(numid, id);
                                tarcine = addInfo(70000, tarcine);
                                int precioreservacion = reservar(sillas, precios, numid);
                                preciosreserva = addInfo(precioreservacion, preciosreserva);
                            } else {
                                System.out.println("No es posible hacer la reserva sin la tarjeta TARCINE");
                            }
                        }
                    }
                    //Segmento de ventas
                    break;
                case 'v':
                    int valor = 0;
                    System.out.println("Tienes alguna reserva? (y / n)");
                    char resp3 = teclado.next().charAt(0);
                    if (resp3 == 'y') {
                        System.out.println("¿Cual es su número de identificación?");
                        int numid = teclado.nextInt();
                        buscaReserva(sillas, numid);
                        int posid = buscarPosID(id, numid);
                        boolean pago = false;
                        while (pago == false) {
                            // Pago en Efectivo o con la tarjeta TARCINE
                            System.out.println("Medio de pago: 1.Efectivo   2.TARCINE   3.Cancelar Reserva");
                            int medio = teclado.nextInt();
                            switch (medio) {
                                case 1:
                                    System.out.print("El valor a cancelar es: " + preciosreserva[posid] + " Cancelar: ");
                                    valor = teclado.nextInt();
                                    if (valor == preciosreserva[posid]) {
                                        pago = true;
                                    } else {
                                    }
                                    break;
                                case 2:
                                    System.out.println("El valor a cancelar es: " + preciosreserva[posid]);
                                    valor = preciosreserva[posid];
                                    if (tarcine[posid] < valor) {
                                        System.out.println("Su tarjeta no tiene suficiente saldo");
                                        pago = true;
                                    } else {
                                        tarcine[posid] = tarcine[posid] - valor;
                                        pago = true;
                                    }
                                    break;
                                case 3:
                                    cancelarReserva(sillas, preciosreserva, id);
                                    System.out.println("Cancelación exitosa");
                                    break;
                                default:
                                    System.out.println("Comando equivocado");
                                    break;
                            }
                        }
                    } else {
                        int[] puestosdisponibles = sillasDisponibles(sillas);
                        System.out.println("¿En que fila se apartarán los puestos?");
                        char filapuestos = teclado.next().charAt(0);
                        int fila = numfila(filapuestos);
                        System.out.println("¿Cuantos puestos necesita?");
                        int cantidadpuestos = teclado.nextInt();
                        if (puestosdisponibles[fila] < cantidadpuestos) {
                            System.out.println("No hay suficientes puestos");
                        } else {
                            System.out.println("¿A partir de que puesto?");
                            int puestoinicial = teclado.nextInt();
                            int precioventa = 0;
                            System.out.println("¿Hasta que puesto?");
                            int puestofinal = teclado.nextInt();
                            for (puestoinicial = puestoinicial - 1; puestoinicial < puestofinal; puestoinicial++) {
                                sillas[fila][puestoinicial] = 1;
                                precioventa = precioventa + precios[fila][puestoinicial];
                            }
                            boolean pago = false;
                            while (pago == false) {
                                System.out.println("¿Cuanto cancela?");
                                valor = teclado.nextInt();
                                if (valor < precioventa) {
                                    pago = true;
                                    valor = precioventa;
                                }else{
                                    System.out.println("Ese no es el valor de la venta...Ingrese tal valor");
                                }
                            }                            
                        }
                    }
                    totales = addInfo(valor, totales);
                    break;
                default:
                    centinela = false;
                    break;
            }
        }
        int total = 0;
        for (int pos = 0; pos < totales.length; pos++) {
            total += totales[pos];
        }
        System.out.println("Las ganacias de hoy fueron: " + total);
    }

    public static void main(String[] args) {
        manejoSalaCine();
    }

}
