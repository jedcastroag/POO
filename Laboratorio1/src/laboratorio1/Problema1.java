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
public class Problema1 {

    static void GuessingGame() {
        int answer = (int) Math.floor((Math.random() * 100) + 1);
        System.out.println(answer);
        int guess = 0;
        int numGuesses = 1;
        while ((numGuesses < 7) && (guess != answer)) {
            System.out.print("Guess a number: ");
        Scanner num = new Scanner(System.in);
        guess = num.nextInt();
        if (guess < answer) {
            System.out.println("Higher...");
        } else if (guess > answer) {
            System.out.println("Lower...");
        } else {
            System.out.println("You win");
        }
        numGuesses = numGuesses + 1; 
        }
        if (numGuesses >= 7) {
                System.out.println("You lose");
            }
        
    }

    static void func1(){
        System.out.println("Segunda Función");
    }
    static void func2(){
        System.out.println("Tercera Función");
    }
    public static void main(String[] args) {
        // Primer algoritmo del problema 1
        System.out.println("Primera Función en main");
        func1();
        func2();
        System.out.println("Se termina main");
        // Segundo algoritmo del Problema 1
        System.out.println("");
        char playAgain = 'y';
        while (playAgain == 'y') {
            GuessingGame(); 
            System.out.print("Would you like to play another game? (y/n): ");
            Scanner  rep = new Scanner(System.in);
            playAgain = rep.next().charAt(0);/* El charAt convierte una cantidad especifica de caracteres de la cadena a tipo char
            ... el cero es la primera pocisión de la cadena*/
        }
    }

}
