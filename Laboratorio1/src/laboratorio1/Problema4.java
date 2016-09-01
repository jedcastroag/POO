/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Problema4 {

    static String buscadorPalabra(String[][] diccionario, String palabra, int filaorigen, int filadestino) {
        String traduccion = "";
        for (int i = 0; i < 13; i++) {
            if (diccionario[filaorigen][i].equals(palabra)) {
                traduccion = diccionario[filadestino][i];
            }
        }
        if (traduccion.equals("")) {
            traduccion = "(No existe palabra para la palabra: " + palabra + ")";
        }
        return traduccion;
    }

    static String traductor(String[][] diccionario, String palabras, int filaorigen, int filadestino) {

        String traduccion = "";
        String palabra = "";
        int posletrainicio = 0;
        for (int i = posletrainicio; i < palabras.length(); i++) {
            if (palabras.charAt(i) == ' ') {
                for (int j = posletrainicio; j < i; j++) {
                    palabra = palabra + palabras.charAt(j);
                }
                palabra = buscadorPalabra(diccionario, palabra, filaorigen, filadestino);
                traduccion = traduccion + " " + palabra;
                palabra = "";
                posletrainicio = i + 1;
            }
        }
        for (int i = posletrainicio; i < palabras.length(); i++) {
            palabra = palabra + palabras.charAt(i);
        }
        palabra = buscadorPalabra(diccionario, palabra, filaorigen, filadestino);
        traduccion = traduccion + " " + palabra;
        return traduccion;
    }

    static void diccionario() {
        Scanner flujo = new Scanner(System.in);
        //Español-1,Frances-2, Italiano-3,Ingles-3
        String[][] diccionario = {{"hola", "como", "estas", "adios", "bien", "tu", "llamas", "gracias", "me", "ayuda", "disculpe", "de", "nada"},
        {"bonjour", "Comment", "allez-vouz", "salut", "bien", "vôtre", "appelez-vous", "merci", "moi", "aider", "pardon", "de", "rien"},
        {"ciao", "come", "stai", "addio", "bene", "vostra", "nome", "grazie", "mi", "aiutare", "mi scusi", "di", "niente"},
        {"hello", "how", "are you", "goodbye", "fine", "your", "name", "thanks", "me", "help", "excuse", "of", "noting"},};

        int idiomaOrigen;//Indicados por el usuario
        int idiomaDestino;//Indicados por el usuario
        String palabras;//Indicados por el usuario
        System.out.println("Frase o Palabra(s)- Sentence or Word(s):");
        palabras = flujo.nextLine();
        
        System.out.println("Lengua Nativa-Native Language (1.Español  2.Frances  3.Italiano  4.Ingles): ");
        idiomaOrigen = flujo.nextInt() - 1;
        System.out.println("Idioma Destino-Destiny Language (1.Español  2.Frances  3.Italiano  4.Ingles): ");
        idiomaDestino = flujo.nextInt() - 1;

        System.out.println(traductor(diccionario, palabras, idiomaOrigen, idiomaDestino));
    }

    public static void main(String[] args) {

        diccionario();

    }
}
